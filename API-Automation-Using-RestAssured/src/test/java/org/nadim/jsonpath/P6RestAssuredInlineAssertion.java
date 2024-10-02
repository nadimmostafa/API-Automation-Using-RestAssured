package org.nadim.jsonpath;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class P6RestAssuredInlineAssertion {

	public static void main(String[] args) {
		
		RestAssured.given()
						.baseUri("https://restful-booker.herokuapp.com/auth")
						.contentType(ContentType.JSON)
						.body("{\r\n"
								+ "    \"username\" : \"admin\",\r\n"
								+ "    \"password\" : \"password123\"\r\n"
								+ "}")
					.when()
						.post()
					.then()
						.log()
						.all()
						.body("token",Matchers.notNullValue());

	}

}
