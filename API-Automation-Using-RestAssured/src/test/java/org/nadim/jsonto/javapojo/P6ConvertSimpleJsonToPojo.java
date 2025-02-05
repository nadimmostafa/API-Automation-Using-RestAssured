package org.nadim.jsonto.javapojo;

import org.nadim.pojo.P0EmployeePojo;

import io.restassured.RestAssured;

public class P6ConvertSimpleJsonToPojo {

	public static void main(String[] args) {
		
		P0EmployeePojo emp = RestAssured.given()
						.get("https://run.mocky.io/v3/41705bab-04a9-425f-999a-36a70ad7d446")
						.as(P0EmployeePojo.class);
		
		System.out.println(emp.getSname() + " "+ emp.getStdId());

	}

}
