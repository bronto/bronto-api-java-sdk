package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApiAsync;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.ContactObject;
import com.bronto.api.model.MailListObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

public class MailListOperationsAsync extends AbstractAsyncObjectOperations<MailListObject> {
    private MailListOperations listOps;

    public MailListOperationsAsync(BrontoApiAsync client) {
        super(MailListObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        this.listOps = new MailListOperations(client);
        return listOps.getSupportedWriteOperations();
    }

    public Future<WriteResult> clear(List<MailListObject> lists) {
        return callWriteAsync("clear", lists);
    }

    public Future<WriteResult> clear(MailListObject...lists) {
        return clear(Arrays.asList(lists));
    }

    public void clear(List<MailListObject> lists, AsyncHandler<WriteResult> handler) {
        callWriteAsync("clear", lists, handler);
    }

    public Future<WriteResult> removeFromList(MailListObject list, List<ContactObject> contacts) {
        return callClientAsync("removeFromList", listOps.createRemoveCall(list, contacts));
    }

    public Future<WriteResult> removeFromList(MailListObject list, ContactObject...contacts) {
        return removeFromList(list, Arrays.asList(contacts));
    }

    public Future<WriteResult> addToList(MailListObject list, List<ContactObject> contacts) {
        return callClientAsync("addToList", listOps.createAddCall(list, contacts));
    }

    public Future<WriteResult> addToList(MailListObject list, ContactObject...contacts) {
        return addToList(list, Arrays.asList(contacts));
    }

    public void removeFromList(MailListObject list, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("removeFromList", listOps.createRemoveCall(list, contacts), handler);
    }

    public void addToList(MailListObject list, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addToList", listOps.createAddCall(list, contacts), handler);
    }
}
