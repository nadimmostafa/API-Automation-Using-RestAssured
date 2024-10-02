package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;
public class P7_DeleteBookingDeleteReq {

	public static void main(String[] args) {
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath = "booking/{id}";

		given()
			.baseUri(baseUri)
			.basePath(basePath)
			.pathParam("id", 1)
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when()
			.delete()
		.then()
			.statusCode(201)
			.log()
			.all();
			
	}

}
