package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToList;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.RemoveFromList;
import com.bronto.api.model.MailListObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

public class MailListOperations extends AbstractObjectOperations<MailListObject> {

    public MailListOperations(BrontoApi client) {
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

    public RemoveFromList createRemoveCall(MailListObject list, List<ContactObject> contacts) {
        RemoveFromList removeFromList = new RemoveFromList();
        removeFromList.setList(list);
        removeFromList.getContacts().addAll(contacts);
        return removeFromList;
    }

    public AddToList createAddCall(MailListObject list, List<ContactObject> contacts) {
        AddToList addToList = new AddToList();
        addToList.setList(list);
        addToList.getContacts().addAll(contacts);
        return addToList;
    }

    public WriteResult clear(List<MailListObject> lists) {
        return callWrite("clear", lists);
    }

    public WriteResult clear(MailListObject...lists) {
        return clear(Arrays.asList(lists));
    }

    public WriteResult removeFromList(MailListObject list, List<ContactObject> contacts) {
        return callClient("removeFromList", createRemoveCall(list, contacts));
    }

    public WriteResult removeFromList(MailListObject list, ContactObject...contacts) {
        return removeFromList(list, Arrays.asList(contacts));
    }

    public WriteResult addToList(MailListObject list, List<ContactObject> contacts) {
        return callClient("addToList", createAddCall(list, contacts));
    }

    public WriteResult addToList(MailListObject list, ContactObject...contacts) {
        return addToList(list, Arrays.asList(contacts));
    }
}
