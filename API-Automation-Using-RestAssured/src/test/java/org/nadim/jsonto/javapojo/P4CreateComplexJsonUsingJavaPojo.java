package org.nadim.jsonto.javapojo;

import java.util.ArrayList;
import java.util.List;

import org.nadim.pojo.P3Student;
import org.nadim.pojo.StudentAddress;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class P4CreateComplexJsonUsingJavaPojo {

	public static void main(String[] args) {
		
		StudentAddress addr = new StudentAddress();
		addr.setCity("Dhaka");
		addr.setState("Mirpur-6");
		addr.setHouseNo("57/58");
		addr.setRoadNo("#004");
		
		StudentAddress addr2 = new StudentAddress();
		addr2.setCity("Rajshahi");
		addr2.setState("Shaheb Bazar");
		addr2.setHouseNo("10/14");
		addr2.setRoadNo("#02");
		
		List<StudentAddress> l = new ArrayList<>();
		l.add(addr);
		l.add(addr2);
		
		P3Student std = new P3Student();
		std.setSname("Nadim Mostafa");
		std.setsId(15);
		std.setGender("Male");
		std.setDept("CSE");
		std.setEmail("nadim65@gmail.com");
		std.setAddresses(l);
		
		RestAssured.given()
		.body(std)
		.contentType(ContentType.JSON)
		.log()
		.all()
		.post();

	}

}
