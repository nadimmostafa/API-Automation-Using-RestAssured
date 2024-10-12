package org.nadim.jsonto.javapojo;

import org.nadim.pojo.P2EmployeeAddress;

import io.restassured.RestAssured;

public class P8ConvertInnerJsonToPojo {

	public static void main(String[] args) {
		
		P2EmployeeAddress address = RestAssured.given()
					.get("https://run.mocky.io/v3/67c459a4-1be2-4a00-8b03-ddc119d94e75")
					.jsonPath()
					.getObject("adress", P2EmployeeAddress.class);
		
		System.out.println(address.getCity());

	}

}
