package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;
public class P6_PatialUpdateBookingPatchReqMethod {

	public static void main(String[] args) {
		//https://restful-booker.herokuapp.com/booking/:id
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath = "booking/{id}";
		String partialBody="{\r\n"
				+ "    \"firstname\" : \"Asif\",\r\n"
				+ "    \"lastname\" : \"Iqbal\"\r\n"
				+ "}";
		
		given()
			.baseUri(baseUri)
			.basePath(basePath)
			.pathParam("id", 2)
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body(partialBody)
		.when()
			.patch()
		.then()
			.statusCode(200)
			.log()
			.all();
	}

}
