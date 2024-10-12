package org.nadim.jsonpayloadconverting;

import io.restassured.RestAssured;
// generate mock API response URL from : designer.mocky.io
public class P4MockingJsonResponse {

	public static void main(String[] args) {
		RestAssured.given()
					.get("https://run.mocky.io/v3/29a4ee46-fd35-4567-96e5-365de2ba6a0a")
					.then()
					.statusCode(200)
					.log()
					.all();
	}

}
