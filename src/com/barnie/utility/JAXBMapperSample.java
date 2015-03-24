package com.barnie.utility;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import java.io.IOException;

/**
 * Created by wbarnie on 2/23/15.
 */
public class JAXBMapperSample {
    public String jsonMarshall(Object obj)
               throws JsonMappingException, JsonGenerationException, IOException {

           ObjectMapper mapper = new ObjectMapper();
           JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
           mapper.registerModule(jaxbModule);
           return mapper.writeValueAsString(obj);
       }

       public <T> T jsonUnmarshall(String json, Class<T> type)
               throws JsonMappingException, JsonParseException, IOException {

           ObjectMapper mapper = new ObjectMapper();
           JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
           mapper.registerModule(jaxbModule);
           mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
           return mapper.readValue(json, type);

       }
}
