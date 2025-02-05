package org.nadim.jsonto.javapojo;

import java.util.ArrayList;
import java.util.List;

import org.nadim.pojo.P1EmployeeDetails;
import org.nadim.pojo.P2EmployeeAddress;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class P3CreateJsonArrayUsingJavaPojo {

	public static void main(String[] args) {
		P2EmployeeAddress address = new P2EmployeeAddress();
		address.setCity("Dhaka");
		address.setHouseNo("57/58");
		address.setRoadNo("#004");
		
		P2EmployeeAddress address2 = new P2EmployeeAddress();
		address2.setCity("Rajshahi");
		address2.setHouseNo("100/58");
		address2.setRoadNo("#010");
		
		P1EmployeeDetails emp = new P1EmployeeDetails();
		emp.setEmpId(10);
		emp.setEmpName("Nadim Mostafa");
		emp.setEmpGender("male");
		emp.setEmail("nadim23@gmail.com");
		emp.setSalary(45000.00);
		emp.setAdress(address);
		
		P1EmployeeDetails emp2 = new P1EmployeeDetails();
		emp2.setEmpId(11);
		emp2.setEmpName("Asif Iqbal");
		emp2.setEmpGender("male");
		emp2.setEmail("asif36@gmail.com");
		emp2.setSalary(35000.00);
		emp2.setAdress(address2);
		
		List<P1EmployeeDetails> l = new ArrayList<>();
		l.add(emp);
		l.add(emp2);
		
		RestAssured.given()
						.body(l)
						.contentType(ContentType.JSON)
						.log()
						.all()
						.post();
	}

}
