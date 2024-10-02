package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class P8_CreatingMultipleBooking {

	@Test
	public void booking1() {
		//https://restful-booker.herokuapp.com/booking
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking";
		String body="{\r\n"
				+ "    \"firstname\" : \"Nahid\",\r\n"
				+ "    \"lastname\" : \"Hasan\",\r\n"
				+ "    \"totalprice\" : 299,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-10-01\"\r\n"
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
			.statusCode(200)
			.log()
			.all();
	}
	
	@Test
	public void booking2() {
		//https://restful-booker.herokuapp.com/booking
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking";
				String body="{\r\n"
						+ "    \"firstname\" : \"Sujon\",\r\n"
						+ "    \"lastname\" : \"Ali\",\r\n"
						+ "    \"totalprice\" : 399,\r\n"
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
					.statusCode(200)
					.log()
					.all();
	}

}
