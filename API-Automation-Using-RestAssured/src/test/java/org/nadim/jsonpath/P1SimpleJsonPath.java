package org.nadim.jsonpath;

import io.restassured.path.json.JsonPath;

public class P1SimpleJsonPath {

	public static void main(String[] args) {
		String json = "{ \r\n"
				+ "        \"src\": \"Images/Sun.png\",\r\n"
				+ "        \"name\": \"sun1\",\r\n"
				+ "        \"hOffset\": 250,\r\n"
				+ "        \"vOffset\": 250,\r\n"
				+ "        \"alignment\": \"center\"\r\n"
				+ "    }";
		
		JsonPath jpath = new JsonPath(json);
		System.out.println(jpath.getString("name"));
		System.out.println(jpath.getInt("hOffset"));
	}

}
