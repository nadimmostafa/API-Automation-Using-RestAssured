package org.nadim.jsonpath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class P5RestAssuredAssertion {

	public static void main(String[] args) {
		String str = RestAssured.given()
						.baseUri("https://restful-booker.herokuapp.com/auth")
						.contentType(ContentType.JSON)
						.body("{\r\n"
								+ "    \"username\" : \"admin\",\r\n"
								+ "    \"password\" : \"password123\"\r\n"
								+ "}")
					.when()
						.post()
					.then()
						.extract()
						.asString();
		
		JsonPath jp = new JsonPath(str);
		System.out.println(jp.getString("token"));
	}

}
