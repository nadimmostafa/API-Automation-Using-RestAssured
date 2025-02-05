package org.nadim.jsonpayloadconverting;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class P6ConvertSimpleJsonToJavaGenericMap {

	public static void main(String[] args) {
		
		Map<String,Object> jsonMap = RestAssured.given()
		.get("https://run.mocky.io/v3/29a4ee46-fd35-4567-96e5-365de2ba6a0a")
		.as(new TypeRef<Map<String,Object>>(){});
		
		Set<Entry<String, Object>> set = jsonMap.entrySet();
		Iterator<Entry<String, Object>> i= set.iterator();
		
		while(i.hasNext()) {
			Entry<String, Object> next = i.next();
			Object value = next.getValue();
			System.out.println(value);
		}
	}

}
