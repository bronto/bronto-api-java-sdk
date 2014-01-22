package com.bronto.api.contact;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;
import com.bronto.api.AbstractObjectOperations;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddContactEvent;
import com.bronto.api.model.AddContactsToWorkflow;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.WorkflowObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.Future;

public class ContactOperations extends AbstractObjectOperations<ContactObject> {
    public ContactOperations(BrontoClient client) {
        super(client);
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

    public Future<WriteResult> addOrUpdate(List<ContactObject> contacts) {
        return callWrite("addOrUpdate", contacts);
    }

    public void addOrUpdate(List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callWrite("addOrUpdate", contacts, handler);
    }

    private AddContactEvent createAddContactCall(String keyword, List<ContactObject> contacts) {
        AddContactEvent addContacts = new AddContactEvent();
        addContacts.setKeyword(keyword);
        addContacts.getContacts().addAll(contacts);
        return addContacts;
    }

    private AddContactsToWorkflow createAddContactsToWorkflowCall(WorkflowObject workflow, List<ContactObject> contacts) {
        AddContactsToWorkflow addContacts = new AddContactsToWorkflow();
        addContacts.setWorkflow(workflow);
        addContacts.getContacts().addAll(contacts);
        return addContacts;
    }

    public Future<WriteResult> addContactEvent(String keyword, List<ContactObject> contacts) {
        return callClientAsync("addContactEvent", createAddContactCall(keyword, contacts));
    }

    public void addContactEvent(String keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addContactEvent", createAddContactCall(keyword, contacts), handler);
    }

    public Future<WriteResult> addContactsToWorkflow(WorkflowObject workflow, List<ContactObject> contacts) {
        return callClientAsync("addContactsToWorkflow", createAddContactsToWorkflowCall(workflow, contacts));
    }

    public void addContactsToWorkflow(WorkflowObject workflow, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addContactsToWorkflow", createAddContactsToWorkflowCall(workflow, contacts), handler);
    }
}
