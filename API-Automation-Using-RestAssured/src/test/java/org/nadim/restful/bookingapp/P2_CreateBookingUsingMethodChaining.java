package org.nadim.restful.bookingapp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class P2_CreateBookingUsingMethodChaining {

	public static void main(String[] args) {
		String baseuri = "https://restful-booker.herokuapp.com/";
		String basePath = "booking";
		String JsonAsBodyData = "{\r\n" + "    \"firstname\" : \"Nadim\",\r\n" + "    \"lastname\" : \"Mostafa\",\r\n"
				+ "    \"totalprice\" : 178,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
		// 1. Build Request
		RestAssured.given()
		.baseUri(baseuri).basePath(basePath)
		.contentType(ContentType.JSON)
		.body(JsonAsBodyData)
		// 02. send request and get response
		.post()
		// 03.Validate Response
		.then()
		.statusCode(200)
		.log()
		.all();

	}

}
