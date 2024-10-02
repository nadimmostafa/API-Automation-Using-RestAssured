package org.nadim.restful.bookingapp;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class PP3_ReponseJSONAsString {

	public static void main(String[] args) {
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
					.log()
					.all()
					.extract()
					.body() // can be header, cookies
					//.asString()
					.asPrettyString();
	}

}
