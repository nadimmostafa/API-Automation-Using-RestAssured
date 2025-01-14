package org.nadim.jsonpayloadconverting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class P8ShareDataOneAPIToAPI {
	String body = "{\r\n"
			+ "    \"firstname\" : \"Jim\",\r\n"
			+ "    \"lastname\" : \"Brown\",\r\n"
			+ "    \"totalprice\" : 111,\r\n"
			+ "    \"depositpaid\" : true,\r\n"
			+ "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2018-01-01\",\r\n"
			+ "        \"checkout\" : \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
			+ "}";
	
	int bookingId;

	@Test(priority=1)
	public void createBooking() {
		bookingId= RestAssured.given()
					.baseUri("https://restful-booker.herokuapp.com/")
					.basePath("booking")
					.body(body)
					.contentType(ContentType.JSON)
				.when()
					.post()
				.then()
				.extract()
				.jsonPath()
				.getInt("bookingid");
		
		System.out.println(bookingId);
	}
	
	@Test(dependsOnMethods="createBooking")
	public void retrieveBookingData() {
		RestAssured.given()
					.get("https://restful-booker.herokuapp.com/booking/"+bookingId)
					.then()
					.log()
					.all()
					.extract()
					.response();
	}

}
