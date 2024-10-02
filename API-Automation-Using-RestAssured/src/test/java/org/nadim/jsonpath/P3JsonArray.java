package org.nadim.jsonpath;

import io.restassured.path.json.JsonPath;

public class P3JsonArray {

	public static void main(String[] args) {
		String jarray = "[\r\n"
				+ "   {\r\n"
				+ "      \"firstname\": \"Nadim\",\r\n"
				+ "      \"lastname\": \"Mostafa\",\r\n"
				+ "      \"age\": 27,\r\n"
				+ "      \"address\": [\r\n"
				+ "         {\r\n"
				+ "            \"city\": \"Chapainawabgonj\",\r\n"
				+ "            \"country\": \"Bangladesh\"\r\n"
				+ "         },\r\n"
				+ "         {\r\n"
				+ "            \"city\": \"Rajshahi\",\r\n"
				+ "            \"country\": \"Bangladesh\"\r\n"
				+ "         }\r\n"
				+ "      ]\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "      \"firstname\": \"Mustak\",\r\n"
				+ "      \"lastname\": \"Kafi\",\r\n"
				+ "      \"age\": 23,\r\n"
				+ "      \"address\": [\r\n"
				+ "         {\r\n"
				+ "            \"city\": \"Rajshahi\",\r\n"
				+ "            \"country\": \"Bangladesh\"\r\n"
				+ "         },\r\n"
				+ "         {\r\n"
				+ "            \"city\": \"Dhaka\",\r\n"
				+ "            \"country\": \"Bangladesh\"\r\n"
				+ "         }\r\n"
				+ "      ]\r\n"
				+ "   }\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jarray);
		System.out.println(jp.getString("[1].address.city"));

	}

}
