package org.nadim.jacksonapi;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class P1ConvertJsonToPojoUsingJackson {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new  ObjectMapper();
		Student std = om.readValue(new File("./src/test/resources/student.json"),Student.class);
		System.out.println(std.isMarriedStatus());
		
		//if our pojo class is not present
		
		ObjectMapper om2 = new  ObjectMapper();
		Map<String, Object> map =  om2.readValue(new File("./src/test/resources/student.json"),
				new TypeReference<Map<String,Object>>(){});
		System.out.println(map.get("name"));
	}

}
