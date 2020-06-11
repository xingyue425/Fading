package com.zk.testbaobao.util;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;


public class JsonUtil {
	
	private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	 
	/***
	 * <br>描 述：将实体转化为String传
	 * <br>作 者：zhaowei 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param obj
	 * @return
	 */
	public static String convertObjectToJson(Object obj) {
		if(obj instanceof String) return (String) obj;
		try {
			/**
			 * 将NULL转化为""
			 */
			objectMapper.getSerializerProvider().setNullValueSerializer(
					new JsonSerializer<Object>(){
						@Override
						public void serialize(Object value, JsonGenerator jgen,
                                              SerializerProvider provider)
								throws IOException, JsonProcessingException {
							jgen.writeString("");
						}
					}
			);
			String data = objectMapper.writeValueAsString(obj);
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
			return null;
		}
	}
	
	public static Map<String, Object> convertJsonToMap(String json) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(json, Map.class);
	}

}
