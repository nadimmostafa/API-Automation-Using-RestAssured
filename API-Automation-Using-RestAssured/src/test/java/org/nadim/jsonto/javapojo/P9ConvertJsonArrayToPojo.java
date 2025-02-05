package org.nadim.jsonto.javapojo;

import java.util.List;

import org.nadim.pojo.P1EmployeeDetails;

import io.restassured.RestAssured;

public class P9ConvertJsonArrayToPojo {

	public static void main(String[] args) {
		
		 P1EmployeeDetails[] emp = RestAssured.given()
						.get("https://run.mocky.io/v3/ef75811e-b181-4366-a443-f52b8eba36fc")
						//.as(new TypeRef<List<P1EmployeeDetails>>() {});
						.as(P1EmployeeDetails[].class);
		
		//P1EmployeeDetails emp1 = list.get(0);
		//P1EmployeeDetails emp2 = list.get(1);
		//System.out.println(emp1.getEmpName() + " " + emp2.getEmpName());
		
		 System.out.println(emp[0].getEmpName() + " " + emp[1].getEmpName());

	}

}
