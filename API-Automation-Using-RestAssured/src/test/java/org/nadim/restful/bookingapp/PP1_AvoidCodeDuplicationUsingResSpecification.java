package org.nadim.restful.bookingapp;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.expect;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class PP1_AvoidCodeDuplicationUsingResSpecification {
	
	ResponseSpecification resSp;
	
	@BeforeClass
	public void tearDownSpecification() {
		resSp = expect()
		.statusCode(200)
		.log()
		.all();
	}
	
	@Test
	public void booking1() {
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking";
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
			.body(body)
			.baseUri(baseUri)
			.basePath(basePath)
			.contentType(ContentType.JSON)
		.when()
			.post()
		.then()
			.spec(resSp);
			
	}
	
	@Test
	public void booking2() {
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking";
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
		
		given()
			.baseUri(baseUri)
			.basePath(basePath)
			.contentType(ContentType.JSON)
			.body(body)
		.when()
			.post()
		.then()
			.spec(resSp);

	}
}
