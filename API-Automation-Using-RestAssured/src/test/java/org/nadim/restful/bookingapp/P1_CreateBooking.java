package org.nadim.restful.bookingapp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class P1_CreateBooking {

	public static void main(String[] args) {
		String baseuri = "https://restful-booker.herokuapp.com/";
		String basePath = "booking";
		String JsonAsBodyData = "{\r\n" + "    \"firstname\" : \"Nadim\",\r\n" + "    \"lastname\" : \"Mostafa\",\r\n"
				+ "    \"totalprice\" : 178,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
		// 1. Build Request
		RequestSpecification reqSpecification = RestAssured.given();
		// for console print
		// reqSpecification = reqSpecification.log().all();
		// set baseUri
		reqSpecification.baseUri(baseuri);
		reqSpecification.basePath(basePath);

		// set content type means which type of request body/payload will be send
		// which type of data will be send as request
		// reqSpecification.contentType("application/json");
		// (OR)
		reqSpecification.contentType(ContentType.JSON);

		// adding payload/body as String
		reqSpecification.body(JsonAsBodyData);

		// ======= 02. send request and get response========

		// we are creating new booking so http method should post
		// so, calling a post method that return response
		Response res = reqSpecification.post();

		// if we want to print which type of response return by post() method
		String prettyPrint = res.prettyPrint();
		System.out.println("Reposne as: " + prettyPrint);

		// 03. =========== Validate Response ===========
		// to check our response is valid or not, we need to perform validation on
		// request
		ValidatableResponse vRes = res.then().log().all();
		vRes.statusCode(200);

	}

}
