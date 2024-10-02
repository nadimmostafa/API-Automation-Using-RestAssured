package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;
public class P5_UpdateBookingPutMethodRequest {

	public static void main(String[] args) {
		// https://restful-booker.herokuapp.com/booking/:id
		String baseUri = "https://restful-booker.herokuapp.com/";
		String basePath="booking/{id}";
		String body="{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Nayon\",\r\n"
				+ "    \"totalprice\" : 999,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2015-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		given()
			.baseUri(baseUri)
			.basePath(basePath)
			.pathParam("id", 2)
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body(body)
			.log()
			.all()
		.when()
			.put()
		.then()
			.statusCode(200)
			.log()
			.all();
			
	}

}
