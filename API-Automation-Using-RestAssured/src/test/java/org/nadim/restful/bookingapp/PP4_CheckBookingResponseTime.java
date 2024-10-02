package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PP4_CheckBookingResponseTime {

	public static void main(String[] args) {
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking";
		String body="{\r\n"
				+ "    \"firstname\" : \"Sobuj\",\r\n"
				+ "    \"lastname\" : \"Ali\",\r\n"
				+ "    \"totalprice\" : 299,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-10-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		Response res = given()
			.baseUri(baseUri)
			.basePath(basePath)
			.contentType(ContentType.JSON)
			.body(body)
		.when()
			.post();
		
		
		// Approach - 01
		long mstime = res.time();
		System.out.println("Get Reponse Time in MilliSeconds: "+mstime);
		
		long timeInSeconds = res.timeIn(TimeUnit.SECONDS);
		System.out.println("Get Reponse Time in Seconds: "+timeInSeconds);
		
		
		// Approach - 02
		//long timeInMS = res.getTime();
		//long timeInSeconds = res.getTimeIn(TimeUnit.SECONDS);
		
	}

}
