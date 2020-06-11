package com.zk.testbaobao.util;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MsgUtil {
	

	private static List<String> list = new LinkedList<String>();
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	private static final int maxLength = 30;
	
	public static String getList() throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list); 
	}
	
	
	public static void put(String json){
		if(list.size() >= maxLength){
			list.remove(0);
		}
		list.add(json);
	}
	
	public static void clear(){
		list.clear();
	}
}
