package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryGroupIds {
    private List<String> messageIds;
    private List<String> deliveryIds;
    private List<String> messageRuleIds;

    public DeliveryGroupIds setMessageIds(List<String> messageIds) {
        this.messageIds = messageIds;
        return this;
    }

    public DeliveryGroupIds setDeliveryIds(List<String> deliveryIds) {
        this.deliveryIds = deliveryIds;
        return this;
    }

    public DeliveryGroupIds setMessageRuleIds(List<String> messageRuleIds) {
        this.messageRuleIds = messageRuleIds;
        return this;
    }

    public DeliveryGroupIds addMessageId(String messageId) {
        getMessageIds().add(messageId);
        return this;
    }

    public DeliveryGroupIds addDeliveryId(String deliveryId) {
        getDeliveryIds().add(deliveryId);
        return this;
    }

    public DeliveryGroupIds addMessageRuleId(String messageRuleId) {
        getMessageRuleIds().add(messageRuleId);
        return this;
    }

    public List<String> getMessageIds() {
        if (messageIds == null) {
            messageIds = new ArrayList<String>();
        }
        return messageIds;
    }

    public List<String> getDeliveryIds() {
        if (deliveryIds == null) {
            deliveryIds = new ArrayList<String>();
        }
        return deliveryIds;
    }

    public List<String> getMessageRuleIds() {
        if (messageRuleIds == null) {
            messageRuleIds = new ArrayList<String>();
        }
        return messageRuleIds;
    }
}
