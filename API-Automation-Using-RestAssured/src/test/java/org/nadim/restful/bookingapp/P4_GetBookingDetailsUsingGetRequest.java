package org.nadim.restful.bookingapp;
import static io.restassured.RestAssured.given;

public class P4_GetBookingDetailsUsingGetRequest {

	public static void main(String[] args) {
		//https://restful-booker.herokuapp.com/booking/:id
		String baseUri="https://restful-booker.herokuapp.com/";
		String basePath="booking/{id}";
		String pathParamName="id";
		String pathParamVal="2";
		
		/*
		given()  //1. build request
			.baseUri(baseUri)
			.basePath(basePath)
			.pathParam(pathParamName, pathParamVal)
		.when() //2. send request and get response
			.get()
		.then() //3. validate response
			.statusCode(200)
			.log()
			.all();
		*/
		
		given()
		
		.when()
			.get("https://restful-booker.herokuapp.com/booking/2")
		.then()
			.statusCode(200)
			.log()
			.all();
	}

}
