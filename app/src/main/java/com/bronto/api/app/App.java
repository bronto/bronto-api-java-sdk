package com.bronto.api.app;

import com.bronto.api.*;
import com.bronto.api.model.*;
import com.bronto.api.request.*;
import com.bronto.api.operation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    private static abstract class CompletionHandler<T> extends AsyncReadPager<T> {
        public CompletionHandler(ObjectOperationsAsync<T> ops, BrontoReadRequest<T> read) {
            super(ops, read);
        }

        @Override
        public void onError(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please provide a Bronto API token.");
            System.exit(0);
        }

        String token = args[0];
        BrontoApiAsync client = new BrontoClientAsync(token, Executors.newCachedThreadPool());
        String sessionId = client.login();
        System.out.println("Successful login: " + sessionId);

        final MailListOperationsAsync listOps = new MailListOperationsAsync(client);
        ContactOperationsAsync contactOps = new ContactOperationsAsync(client);
        ObjectOperationsAsync<FieldObject> fieldOps = client.transportAsync(FieldObject.class);
        ObjectOperationsAsync<DeliveryObject> deliveryOps = client.transportAsync(DeliveryObject.class);
        ObjectOperationsAsync<HeaderFooterObject> headerFooterOps =
        		client.transportAsync(HeaderFooterObject.class);

        ContactReadRequest activeContacts = new ContactReadRequest()
            .withIncludeLists(true)
            .withStatus(ContactStatus.ONBOARDING)
            .withEmail(FilterOperator.STARTS_WITH, "philip");

        System.out.println("Reading active contacts");
        contactOps.read(activeContacts, new CompletionHandler<ContactObject>(contactOps, activeContacts) {
            @Override
            public void readObjects(List<ContactObject> contacts) {
                for (ContactObject contact : contacts) {
                    System.out.println(String.format("Contact %s: %s", contact.getId(), contact.getEmail()));
                    for (String listId : contact.getListIds()) {
                        System.out.println("\tList id: " + listId);
                    }
                }
            }
        });

        MailListReadRequest listRead = new MailListReadRequest();
        System.out.println("Reading lists");
        listOps.read(listRead, new CompletionHandler<MailListObject>(listOps, listRead) {
            @Override
            public void readObjects(List<MailListObject> lists) {
                for (MailListObject list : lists) {
                    System.out.println(String.format("MailList %s: %s", list.getId(), list.getName()));
                }
            }
        });

        FieldReadRequest fieldRead = new FieldReadRequest();
        System.out.println("Reading fields");
        fieldOps.read(fieldRead, new CompletionHandler<FieldObject>(fieldOps, fieldRead) {
            @Override
            public void readObjects(List<FieldObject> fields) {
                for (FieldObject field : fields) {
                    System.out.println(String.format("Field %s: %s (%s)", field.getId(), field.getLabel(), field.getType()));
                }
            }
        });

        DeliveryReadRequest deliveries = new DeliveryReadRequest()
              .withStatus(DeliveryStatus.SENT)
              .withDeliveryType(DeliveryType.NORMAL)
              .withIncludeRecipients(true);
        System.out.println("Reading sent bulk deliveries");
        for (DeliveryObject delivery : deliveryOps.readAll(deliveries)) {
            System.out.println(String.format("Delivery %s: status %s went to:", delivery.getId(), delivery.getStatus()));
            for (DeliveryRecipientObject recipient : delivery.getRecipients()) {
                System.out.println(String.format("\t%s: %s", recipient.getId(), recipient.getType()));
            }
        }

        HeaderFooterReadRequest headerFooters =
        		new HeaderFooterReadRequest().withIncludeContent(true);
        for (HeaderFooterObject headerFooter :
        	headerFooterOps.readAll(headerFooters)) {
        	System.out.println(String.format("Header/Footer %s (name: %s): "
        			+ "html:\n\t%s\ntext:\n\t%s\tHeader? - %b",
        			headerFooter.getId(), headerFooter.getName(),
        			headerFooter.getHtml(), headerFooter.getText(),
        			headerFooter.isIsHeader()));
        }

		/*
		 * The conversion calls are slow, so it's recommended that the
		 * conversion checks be left commented-out by default unless you're
		 * actively testing conversions.
		 */
		// ObjectOperationsAsync<ConversionObject> conversionOps =
		// client.transportAsync(ConversionObject.class);
		// ConversionReadRequest conversions = new ConversionReadRequest();
		// for (ConversionObject conversion :
		// conversionOps.readAll(conversions)) {
		// System.out.println(String.format("Conversion id: %s (email: %s) "
		// + "- item = %s", conversion.getId(), conversion.getEmail(),
		// conversion.getItem()));
		// }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine() != null) {
            client.shutdown();
        }

    }
}
