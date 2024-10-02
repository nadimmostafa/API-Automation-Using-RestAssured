package org.nadim.jsonpath;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class P4JsonPathWithFilters {

	public static void main(String[] args) {
		String fileLoc = ".//src//test//resources//JsonData.json";
		File file = new File(fileLoc);
		
		JsonPath jp = new JsonPath(file);
		System.out.println(jp.getString("[1].firstname"));
		
		List<Object> list = jp.getList("findAll{it.firstname=='Mustak'}.address.city");
		System.out.println(list);
		
		List<Object> list2 = jp.getList("findAll{it.gender=='Female' && it.age >17}.firstname");
		System.out.println(list2);
		
		
		int age = jp.getInt("find{it.firstname=='Nadim'}.age");
		System.out.println(age);

	}

}
