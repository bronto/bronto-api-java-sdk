package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToList;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.RemoveFromList;
import com.bronto.api.model.MailListObject;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public class MailListOperations extends AbstractObjectOperations<MailListObject> {
    public MailListOperations(BrontoClient client) {
        super(MailListObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("lists",
            "add",
            "update",
            "delete",
            "clear",
            "class:" + AddToList.class.getSimpleName(),
            "class:" + RemoveFromList.class.getSimpleName()) {
            @Override
            protected String getListMethodForName(String name) {
                if (name.equals("clear")) {
                    return "getList";
                } else {
                    return super.getListMethodForName(name);
                }
            }
        };
    }

    public Future<WriteResult> clear(List<MailListObject> lists) {
        return callWrite("clear", lists);
    }

    public void clear(List<MailListObject> lists, AsyncHandler<WriteResult> handler) {
        callWrite("clear", lists, handler);
    }

    private RemoveFromList createRemoveCall(MailListObject list, List<ContactObject> contacts) {
        RemoveFromList removeFromList = new RemoveFromList();
        removeFromList.setList(list);
        removeFromList.getContacts().addAll(contacts);
        return removeFromList;
    }

    private AddToList createAddCall(MailListObject list, List<ContactObject> contacts) {
        AddToList addToList = new AddToList();
        addToList.setList(list);
        addToList.getContacts().addAll(contacts);
        return addToList;
    }

    public Future<WriteResult> removeFromList(MailListObject list, List<ContactObject> contacts) {
        return callClientAsync("removeFromList", createRemoveCall(list, contacts));
    }

    public Future<WriteResult> addToList(MailListObject list, List<ContactObject> contacts) {
        return callClientAsync("addToList", createAddCall(list, contacts));
    }

    public void removeFromList(MailListObject list, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("removeFromList", createRemoveCall(list, contacts), handler);
    }

    public void addToList(MailListObject list, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addToList", createAddCall(list, contacts), handler);
    }
}
