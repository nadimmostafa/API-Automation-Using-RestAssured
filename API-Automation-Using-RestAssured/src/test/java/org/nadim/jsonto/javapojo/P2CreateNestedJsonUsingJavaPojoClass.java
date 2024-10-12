package org.nadim.jsonto.javapojo;

import org.nadim.pojo.P1EmployeeDetails;
import org.nadim.pojo.P2EmployeeAddress;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class P2CreateNestedJsonUsingJavaPojoClass {

	public static void main(String[] args) {
		P2EmployeeAddress address = new P2EmployeeAddress();
		address.setCity("Dhaka");
		address.setHouseNo("57/58");
		address.setRoadNo("#004");
		
		P1EmployeeDetails emp = new P1EmployeeDetails();
		emp.setEmpId(10);
		emp.setEmpName("Nadim Mostafa");
		emp.setEmpGender("male");
		emp.setEmail("nadim23@gmail.com");
		emp.setSalary(45000.00);
		emp.setAdress(address);
		
		RestAssured.given()
						.body(emp)
						.contentType(ContentType.JSON)
						.log()
						.all()
						.post();
		
	}

}
