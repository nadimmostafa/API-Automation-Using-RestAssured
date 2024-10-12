package org.nadim.jsonto.javapojo;

import org.nadim.pojo.P1EmployeeDetails;
import org.nadim.pojo.P2EmployeeAddress;

import io.restassured.RestAssured;

public class P7ConvertNestedJsonToPojo {

	public static void main(String[] args) {
		
		P1EmployeeDetails empAddr = RestAssured.given()
						.get("https://run.mocky.io/v3/67c459a4-1be2-4a00-8b03-ddc119d94e75")
						.as(P1EmployeeDetails.class);
		
		P2EmployeeAddress address = empAddr.getAdress();
		//(or)
		String houseNo = empAddr.getAdress().getHouseNo();
		System.out.println(houseNo);
		
		System.out.println(empAddr.getEmpName()+ " from " + address.getCity());

	}

}
