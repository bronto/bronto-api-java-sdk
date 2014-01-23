package com.bronto.api.app;

import com.bronto.api.*;
import com.bronto.api.model.*;
import com.bronto.api.request.*;
import com.bronto.api.operation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    private static abstract class CompletionHandler<T> extends AsyncReadPager<T> {
        public CompletionHandler(ObjectOperations<T> ops, BrontoReadRequest<T> read) {
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
        BrontoClientFactory factory = new BrontoClientFactory(Executors.newCachedThreadPool());
        BrontoClient client = factory.getClient(token);
        String sessionId = client.login();
        System.out.println("Successful login: " + sessionId);

        System.out.println("Reading active contacts");
        final ContactOperations contactOps = new ContactOperations(client);
        final ContactReadRequest activeContacts = new ContactReadRequest().withStatus(ContactStatus.ACTIVE);
        contactOps.read(activeContacts, new CompletionHandler<ContactObject>(contactOps, activeContacts) {
            private int total = 0;

            @Override
            public void readObjects(List<ContactObject> contacts) {
                for (ContactObject contact : contacts) {
                    total += 1;
                    System.out.println(String.format("Contact %s: %s", contact.getId(), contact.getEmail()));
                }
            }
        });

        System.out.println("Reading lists");
        final MailListOperations listOps = new MailListOperations(client);
        final MailListReadRequest listRead = new MailListReadRequest();
        listOps.read(listRead, new CompletionHandler<MailListObject>(listOps, listRead) {
            @Override
            public void readObjects(List<MailListObject> lists) {
                for (MailListObject list : lists) {
                    System.out.println(String.format("MailList %s: %s", list.getId(), list.getName()));
                }
            }
        });

        System.out.println("Reading fields");
        final ObjectOperations<FieldObject> fieldOps = client.transport(FieldObject.class);
        final FieldReadRequest fieldRead = new FieldReadRequest();
        fieldOps.read(fieldRead, new CompletionHandler<FieldObject>(fieldOps, fieldRead) {
            @Override
            public void readObjects(List<FieldObject> fields) {
                for (FieldObject field : fields) {
                    System.out.println(String.format("Field %s: %s (%s)", field.getId(), field.getLabel(), field.getType()));
                }
            }
        });

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine() != null) {
            factory.shutdown();
        }
    }
}
