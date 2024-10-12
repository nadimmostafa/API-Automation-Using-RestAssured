package org.nadim.jsonpayloadconverting;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class P7DynamicJsonResponseToJavaObject {
	public static void main(String[] args) {
		Object obj = RestAssured.given().get("https://run.mocky.io/v3/7ee8c6c6-8da2-4a1a-ac9a-6864974083ca")
				.as(new TypeRef<Object>() {
				});

		if (obj instanceof List) {
			List l = (List) obj;

			System.out.println("List Size " + l.size());
		} else {
			Map m = (Map) obj;
			System.out.println("Map size " + m.size());
		}
	}
}
