package org.nadim.restful.bookingapp;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;

public class PP5_HttpHeaders {

	public static void main(String[] args) {
		//defualtHeader();
		overwriteHeader();
	}

	public static void defualtHeader() {

		Map<String, String> headers = new HashMap<>();
		headers.put("key3", "val3");
		headers.put("key4", "val4");

		Header header = new Header("Key2", "val2");

		RestAssured.given().baseUri(RestAssured.baseURI).basePath(RestAssured.basePath).contentType("Application/json")
				.header("key1", "value1").headers("key1", "val1", "key2", "Val2").headers(headers).header(header).log()
				.all().when().post();
	}

	// Overwrite Header key and value

	public static void overwriteHeader() {
		Map<String, String> headers = new HashMap<>();
		headers.put("key3", "val3");
		headers.put("key4", "val4");

		Header header = new Header("Key2", "val2");
		RestAssured.given()
						.config(
								RestAssuredConfig.config()
											.headerConfig(
													HeaderConfig
													.headerConfig()
													.overwriteHeadersWithName("key1", "val1")
													)
						).header("key1", "val1")
						.headers("key1", "val1", "key2", "Val2")
						.headers(headers)
						.header(header).log()
						.all()
						.when()
						.post();
	}

}
