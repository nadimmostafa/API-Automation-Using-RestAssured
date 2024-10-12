package org.nadim.jsonto.javapojo;

import org.nadim.pojo.P0EmployeePojo;

import io.restassured.RestAssured;

public class P1CreateJsonSimpleObjUsingJavaPojo {

	public static void main(String[] args) {
		P0EmployeePojo e = new P0EmployeePojo();
		
		e.setStdId(11);
		e.setSname("Nadim Mostafa");
		e.setGender("Male");
		e.setMarried(false);
		e.setSalary(45000.00f);
		
		RestAssured.given()
						.body(e)
						.contentType("application/json")
						.log()
						.all()
						.when()
						.post();
	}

}
