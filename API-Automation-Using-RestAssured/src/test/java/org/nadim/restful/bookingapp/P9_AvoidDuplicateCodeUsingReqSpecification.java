package org.nadim.restful.bookingapp;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class P9_AvoidDuplicateCodeUsingReqSpecification {
	
	String baseUri="https://restful-booker.herokuapp.com/";
	String basePath="booking";
	RequestSpecification reqSp;
	
	@BeforeClass
	public void setUpSpecification() {
		reqSp = given()
			.baseUri(baseUri)
			.basePath(basePath)
			.contentType(ContentType.JSON);
	}
	
	@Test
	public void booking1() {
		String body="{\r\n"
				+ "    \"firstname\" : \"Rajib\",\r\n"
				+ "    \"lastname\" : \"Gandhi\",\r\n"
				+ "    \"totalprice\" : 344,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-11-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		given()
			.spec(reqSp)
			.body(body)
		.when()
			.post()
		.then()
			.statusCode(200)
			.log()
			.all();
	}
	
	@Test
	public void booking2() {
		String body="{\r\n"
				+ "    \"firstname\" : \"Attab\",\r\n"
				+ "    \"lastname\" : \"Ali\",\r\n"
				+ "    \"totalprice\" : 99,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-11-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		given(reqSp)
			.body(body)
		.when()
			.post()
		.then()
			.statusCode(200)
			.log()
			.all();
	}
}
