package org.nadim.jsonpayloadconverting;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import io.restassured.RestAssured;

public class P5ConvertSimpleJsonToJavaMap {

	public static void main(String[] args) {
		
		Map jsonMap = RestAssured.given()
		.get("https://run.mocky.io/v3/29a4ee46-fd35-4567-96e5-365de2ba6a0a")
		.as(Map.class);
		
		String firstName =(String)jsonMap.get("fname");
		System.out.println(firstName);
		String string = jsonMap.toString();
		System.out.println(string);

	}

}
