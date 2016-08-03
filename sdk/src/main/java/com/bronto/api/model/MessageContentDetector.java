package com.bronto.api.model;

public class MessageContentDetector {

    public static boolean hasJsonContent(MessageObject message) {
        
        for (MessageContentObject messageContent : message.getContent()) {
            
            if (messageContent instanceof JsonMessageContentObject) {
                return true;
            }
        }
        
        return false;
    }
  
}
