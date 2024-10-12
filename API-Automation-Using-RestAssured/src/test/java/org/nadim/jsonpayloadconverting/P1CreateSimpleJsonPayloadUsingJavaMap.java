package org.nadim.jsonpayloadconverting;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class P1CreateSimpleJsonPayloadUsingJavaMap {

	public static void main(String[] args) {
		
		Map<String,Object> jsonPayload = new LinkedHashMap<>();
		jsonPayload.put("id", 01);
		jsonPayload.put("fname", "Nadim");
		jsonPayload.put("lname", "Mostafa");
		jsonPayload.put("gender", "Male");
		jsonPayload.put("marrid-status", false);
		jsonPayload.put("salary", 45000.00);
		
		RestAssured.given()
					   .body(jsonPayload)
					   .log()
					   .all()
					   .get();
	}

}
