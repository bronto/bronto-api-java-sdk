# Bronto Java SDK

The SDK is broken up into two projects:

- The `wsimported` Java models, that live in `com.bronto.api.model`
- The SDK wrapper providing a convenient API for various apps

## Benefits of the SDK

- Asynchronous web service calls
- Retry on common network errors
- Automatic pagination with the `readAll` object operations
- Chainable request building
- Component driven object operations

## Installation

```
<dependency>
  <groupId>com.bronto</groupId>
  <artifactId>bronto-api-sdk</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Example Code

All calls, with the exception of `login` and `readAll`, can be made
asynchronously. This means there's two deritives of an API call:

- The call itself, with expected arguments
- The call with the expected arguments and an `AsyncHandler`, see below

### Login

``` java
import com.bronto.api.*;
import com.bronto.api.model.*;

import java.util.concurrent.Executors;

String apiToken = "<You API token>";
BrontoClientFactory factory = new BrontoClientFactory(new Executors.newCachedThreadPool());
BrontoClient client = factory.getClient(apiToken);

String sessionId = client.login();
```

### Create new Contact

``` java
ContactObject contact = new ContactObject();
contact.setEmail("user@example.com");
contact.setStatus("onboarding");
contact.getListIds().add(listId);

CotactField field = new ContactField();
field.setFieldId(fieldId);
field.setContent(value);

contact.getFields().add(field);

ContactOperations contactOps = new ContactOperations(client);

try {
    Future<WriteResult> result = contactOps.add(Arrays.asList(contact));
} catch (Exception e) {
    // Handle exception
}

// OR
contactOps.add(Arrays.asList(contact), new AsyncHandler() {
    @Override
    public void onSuccess(WriteResult result) {
        // handle the result here
    }

    @Override
    public void onError(Exception e) {
        // handle the exception case here
    }
});
```

### Create / Update many Contacts

``` java
contactOps.addOrUpdate(contacts);
```

### Delete a contact

``` java
contactOps.delete(Arrays.asList(contact));
```

### Read Contacts using Read Request

#### Option #1: Using Async recursion

``` java
Calendar createdThreshold = Calendar.getInstance();


final ContactReadRequest readContacts = new ContactReadRequest()
    .withStatus("transactional")
    .withCreated(FilterOperator.AFTER, createdThreshold)
    .withListId(listId);

contactOps.read(readContacts, new AsyncHandler() {
    @Override
    public void onSuccess(List<ContactObject> contacts) {
        if (!contacts.isEmpty()) {
            for (ContactObject contact: contacts) {
                System.out.println(contact.getEmail());
                contactOps.read(readContacts.next(), this);
            }
        }
    }

    @Override
    public void onError(Exception e) {
        // Handle error
    }
});
```

#### Option #2: Using automatic pager

``` java
for (ContactObject contact : contactOps.readAll(readContacts)) {
    System.out.println(contact.getEmail());
}
```

### Read List by Name

``` java

MailListOperations listOps = new MailListOperations(client);

MailListObject list = listOps.get(new MailListReadRequest().withName("My Example List")).get();
```

### Clear List(s)

``` java
listOps.clear(Arrays.asList(list));
```

### Create new Field

``` java
FieldObject field = new FieldObject();
field.setName("API Field");
field.setLabel("API Field Label");
field.setVisibility(false);
field.setType("text");

ObjectOperations<FieldObject> fieldOps = client.getOperations("fields");
fieldOps.add(Arrays.asList(field));
```

### Get a ContentTag

``` java
ObjectOperations<ContentTagObject> contentTagOps = client.getOperations("contentTags");

ContentTag tag = contentTagOps.get(new ContentTagReadRequest().withId("123")).get();
```

### Retrieve a Message

``` java
ObjectOperations<MessageObject> messageOps = client.getOperations("messages");

MessageObject message = messageOps.get(new MessageReadRequest().withId("123")).get();
```
