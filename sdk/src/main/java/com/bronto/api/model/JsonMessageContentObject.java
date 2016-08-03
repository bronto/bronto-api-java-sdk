package com.bronto.api.model;

import java.io.IOException;
import java.util.Map;

import com.bronto.api.BrontoClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMessageContentObject extends MessageContentObject {

  public JsonMessageContentObject() {
    
  }
  
  public JsonMessageContentObject(MessageContentObject messageContent) throws IOException {
      /*
       * Got ahead and initialize this object with the original message content.
       */
      ObjectMapper mapper = new ObjectMapper();
      Map<String, Object> jsonContent = mapper.readValue(messageContent.getContent(),
          new TypeReference<Map<String, Object>>() {});
      setRawJson(jsonContent);
      setSubject(messageContent.getSubject());
      setType(messageContent.getType()); 
  }
  
  private Map<String, Object> rawJson;
  
  public Map<String, Object> getRawJson() {
      return rawJson;
  }
  
  public void setRawJson(Map<String, Object> rawJson) {
      this.rawJson = rawJson;
  }
  
  @Override
  public String getContent() {
      return rawJson.get("body").toString();
  }
  
  @Override 
  public void setContent(String content) {
    
      try {
        
        rawJson.put("body", content);
        ObjectMapper mapper = new ObjectMapper();
        super.setContent(mapper.writeValueAsString(rawJson));
        
      } catch (JsonProcessingException jpe) {
          throw new BrontoClientException(jpe);
      }
  }
  
}
