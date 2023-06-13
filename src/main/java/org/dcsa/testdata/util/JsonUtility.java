package org.dcsa.testdata.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonUtility {

    public static <T> String getStringFormObject(T t) {
        ObjectMapper mapper = JsonMapper.builder()
                            .addModule(new JavaTimeModule())
                            .build();
        String inputJson = "";
        if (t != null) {
            try {
                inputJson = mapper.writeValueAsString(t);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return inputJson;
    }
    public static <T> T getObjectFromJson(Class<T> t1, String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        T t = null;
        try {
            t = (T) mapper.readValue(jsonString, t1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return t;
    }
}
