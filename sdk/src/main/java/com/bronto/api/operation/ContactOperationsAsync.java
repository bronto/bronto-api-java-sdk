package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApiAsync;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.ContactObject;
import com.bronto.api.model.WorkflowObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.Future;

public class ContactOperationsAsync extends AbstractAsyncObjectOperations<ContactObject> {
    private ContactOperations contactOps;

    public ContactOperationsAsync(BrontoApiAsync client) {
        super(ContactObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        this.contactOps = new ContactOperations(client);
        return contactOps.getSupportedWriteOperations();
    }

    public Future<WriteResult> addOrUpdate(List<ContactObject> contacts) {
        return callWriteAsync("addOrUpdate", contacts);
    }

    public Future<WriteResult> addOrUpdate(ContactObject...contacts) {
        return addOrUpdate(Arrays.asList(contacts));
    }

    public void addOrUpdate(List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callWriteAsync("addOrUpdate", contacts, handler);
    }

    public Future<WriteResult> addContactEvent(String keyword, List<ContactObject> contacts) {
        return callClientAsync("addContactEvent", contactOps.createAddContactCall(keyword, contacts));
    }

    public Future<WriteResult> addContactEvent(String keyword, ContactObject...contacts) {
        return addContactEvent(keyword, Arrays.asList(contacts));
    }

    public void addContactEvent(String keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addContactEvent", contactOps.createAddContactCall(keyword, contacts), handler);
    }

    public Future<WriteResult> addContactsToWorkflow(WorkflowObject workflow, List<ContactObject> contacts) {
        return callClientAsync("addContactsToWorkflow", contactOps.createAddContactsToWorkflowCall(workflow, contacts));
    }

    public Future<WriteResult> addContactsToWorkflow(WorkflowObject workflow, ContactObject...contacts) {
        return addContactsToWorkflow(workflow, Arrays.asList(contacts));
    }

    public void addContactsToWorkflow(WorkflowObject workflow, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addContactsToWorkflow", contactOps.createAddContactsToWorkflowCall(workflow, contacts), handler);
    }
}
