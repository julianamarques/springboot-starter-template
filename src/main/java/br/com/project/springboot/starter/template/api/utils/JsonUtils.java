package br.com.project.springboot.starter.template.api.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class JsonUtils {
    @Getter
    private final ObjectMapper objectMapper;

    @Autowired
    public JsonUtils(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String objectToJson(Object obj) {
        return objectMapper.writeValueAsString(obj);
    }

    public <C> C jsonToObject(String json, Class<C> clazz) {
        return objectMapper.readValue(json, clazz);
    }

    public <C> C jsonToObject(String json, TypeReference<C> typeReference) {
        return objectMapper.readValue(json, typeReference);
    }
}
