package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddContactEvent;
import com.bronto.api.model.AddContactsToWorkflow;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.WorkflowObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

public class ContactOperations extends AbstractObjectOperations<ContactObject> {
    public ContactOperations(BrontoApi client) {
        super(ContactObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("contacts",
            "add",
            "addOrUpdate",
            "update",
            "delete",
            "class:" + AddContactsToWorkflow.class.getSimpleName(),
            "class:" + AddContactEvent.class.getSimpleName());
    }

    public WriteResult addOrUpdate(List<ContactObject> contacts) {
        return callWrite("addOrUpdate", contacts);
    }

    public WriteResult addOrUpdate(ContactObject...contacts) {
        return addOrUpdate(Arrays.asList(contacts));
    }

    public WriteResult addContactEvent(String keyword, List<ContactObject> contacts) {
        return callClient("addContactEvent", createAddContactCall(keyword, contacts));
    }

    public WriteResult addContactEvent(String keyword, ContactObject...contacts) {
        return addContactEvent(keyword, Arrays.asList(contacts));
    }

    public WriteResult addContactsToWorkflow(WorkflowObject workflow, List<ContactObject> contacts) {
        return callClient("addContactsToWorkflow", createAddContactsToWorkflowCall(workflow, contacts));
    }

    public WriteResult addContactsToWorkflow(WorkflowObject workflow, ContactObject...contacts) {
        return addContactsToWorkflow(workflow, Arrays.asList(contacts));
    }

    public AddContactEvent createAddContactCall(String keyword, List<ContactObject> contacts) {
        AddContactEvent addContacts = new AddContactEvent();
        addContacts.setKeyword(keyword);
        addContacts.getContacts().addAll(contacts);
        return addContacts;
    }

    public AddContactsToWorkflow createAddContactsToWorkflowCall(WorkflowObject workflow, List<ContactObject> contacts) {
        AddContactsToWorkflow addContacts = new AddContactsToWorkflow();
        addContacts.setWorkflow(workflow);
        addContacts.getContacts().addAll(contacts);
        return addContacts;
    }

}
