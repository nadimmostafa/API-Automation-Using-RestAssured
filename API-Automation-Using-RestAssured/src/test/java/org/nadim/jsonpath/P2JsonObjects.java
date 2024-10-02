package org.nadim.jsonpath;

import io.restassured.path.json.JsonPath;

public class P2JsonObjects {

	public static void main(String[] args) {
		String json="{\r\n"
				+ "   \"widget\": {\r\n"
				+ "      \"debug\": \"on\",\r\n"
				+ "      \"window\": {\r\n"
				+ "         \"title\": \"Sample Konfabulator Widget\",\r\n"
				+ "         \"name\": \"main_window\",\r\n"
				+ "         \"width\": 500,\r\n"
				+ "         \"height\": 500\r\n"
				+ "      },\r\n"
				+ "      \"image\": {\r\n"
				+ "         \"src\": \"Images/Sun.png\",\r\n"
				+ "         \"name\": \"sun1\",\r\n"
				+ "         \"hOffset\": 250,\r\n"
				+ "         \"vOffset\": 250,\r\n"
				+ "         \"alignment\": \"center\"\r\n"
				+ "      },\r\n"
				+ "      \"text\": {\r\n"
				+ "         \"data\": \"Click Here\",\r\n"
				+ "         \"size\": 36,\r\n"
				+ "         \"style\": \"bold\",\r\n"
				+ "         \"name\": \"text1\",\r\n"
				+ "         \"hOffset\": 250,\r\n"
				+ "         \"vOffset\": 100,\r\n"
				+ "         \"alignment\": \"center\",\r\n"
				+ "         \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\r\n"
				+ "      }\r\n"
				+ "   }\r\n"
				+ "}";
		
		String jArray = "[\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\",\r\n"
				+ "    \"30\",\r\n"
				+ "    \"Nadim\",\r\n"
				+ "    \"Asif\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\",\r\n"
				+ "    \"30\",\r\n"
				+ "    \"Hasan\",\r\n"
				+ "    \"Ali\"\r\n"
				+ "  ]\r\n"
				+ "]";
		
		JsonPath jpath = new JsonPath(json);
		System.out.println((Object)jpath.getString("$")); // return json as string array
		System.out.println((Object)jpath.get("$")); // return json format
		
		//retrieve image alignment value
		System.out.println((Object)jpath.get("widget.image.alignment")); //center
		
		
		JsonPath jp = new JsonPath(jArray);
		System.out.println(jp.getList("$")); //all
		System.out.println(jp.getList("$").size()); // 2
		
		//retrieve data from json array
		System.out.println(jp.getString("[1][3]")); // Hasan
		System.out.println(jp.getList("[1]").size()); //5

	}

}
