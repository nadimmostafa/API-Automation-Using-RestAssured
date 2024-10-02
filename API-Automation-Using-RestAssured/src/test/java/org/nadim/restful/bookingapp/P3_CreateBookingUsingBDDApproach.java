package org.nadim.restful.bookingapp;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class P3_CreateBookingUsingBDDApproach {

	public static void main(String[] args) {
		String baseuri = "https://restful-booker.herokuapp.com/";
		String basePath = "booking";
		String JsonAsBodyData = "{\r\n" + "    \"firstname\" : \"Nadim\",\r\n" + "    \"lastname\" : \"Mostafa\",\r\n"
				+ "    \"totalprice\" : 178,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
		
		/*
		given() // 1. build request
			.baseUri(baseuri)
			.basePath(basePath)
			.contentType(ContentType.JSON)
			.body(JsonAsBodyData)
		.when()  // 2. send request and get response
		 	.post()
		.then() // 3. validate response
			.statusCode(200)
			.log()
			.all();
			
			*/
		
		given()
			.contentType(ContentType.JSON)
			.body(JsonAsBodyData)
		.when()
			.post("https://restful-booker.herokuapp.com/booking")
		.then()
			.statusCode(200)
			.log()
			.all();
	}

}
