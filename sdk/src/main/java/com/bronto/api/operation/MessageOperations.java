package com.bronto.api.operation;

import java.io.IOException;
import java.util.List;

import com.bronto.api.BrontoApi;
import com.bronto.api.model.JsonMessageContentObject;
import com.bronto.api.model.MessageContentObject;
import com.bronto.api.model.MessageObject;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoReadRequest;

public class MessageOperations extends AbstractObjectOperations<MessageObject> {

  public MessageOperations(BrontoApi client) {
    super(MessageObject.class, client);
  }

  @Override
  public ApiReflection getSupportedWriteOperations() {
    return new ApiReflection("messages",
        "add",
        "update",
        "delete");
  }  
  
  @Override
  public MessageObject get(BrontoReadRequest<MessageObject> request) {
      
      MessageObject message = super.get(request);
      
      if (message.getContent() != null && !message.getContent().isEmpty()) {
        
          for (int contentNum = 0; contentNum < message.getContent().size(); contentNum++) {
              message.getContent().set(contentNum, 
                  convertContent(message.getContent().get(contentNum)));
          }
        
      }
      
      return message;
  }
  
  @Override
  public List<MessageObject> read(BrontoReadRequest<MessageObject> request) {
    
    List<MessageObject> messages = super.read(request);
    
    for (MessageObject message : messages) {
      
        if (message.getContent() != null && !message.getContent().isEmpty()) {
          
            for (int contentNum = 0; contentNum < message.getContent().size(); contentNum++) {
                message.getContent().set(contentNum, 
                    convertContent(message.getContent().get(contentNum)));
            }
          
        }
      
    }
    
    return messages;
    
  }
  
  private MessageContentObject convertContent(MessageContentObject messageContent) {
    
    try {
      
      JsonMessageContentObject jsonContent = new JsonMessageContentObject(messageContent);
      return jsonContent;
      
    } catch (IOException e) {
      
        return messageContent;
      
    }
    
  }
  
}
