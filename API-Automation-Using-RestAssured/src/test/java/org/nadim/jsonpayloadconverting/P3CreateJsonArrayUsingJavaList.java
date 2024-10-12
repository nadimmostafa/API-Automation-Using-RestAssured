package org.nadim.jsonpayloadconverting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

/*
 [
  {
    "id": 1,
    "fname": "nadim",
    "lname": "mostafa",
    "gender": "male",
    "married-status": false,
    "address": {
      "state": "Dhaka",
      "zip code": 1216,
      "house no": "57/58",
      "road": 4
    }
  },
  {
    "id": 2,
    "fname": "Asif",
    "lname": "Iqbal",
    "gender": "male",
    "married-status": false,
    "address": "Rajshahi"
  }
]
 */
public class P3CreateJsonArrayUsingJavaList {

	public static void main(String[] args) {
		Map<String, Object> childJson = new HashMap<>();
		childJson.put("city", "Dhaka");
		childJson.put("state", "Mirpur-6");
		childJson.put("zip-code", "1216");
		
		Map<String,Object> parentJson = new HashMap<>();
		parentJson.put("id", 1);
		parentJson.put("fname", "nadim");
		parentJson.put("lname", "mostafa");
		parentJson.put("gender", "male");
		parentJson.put("married-status", false);
		parentJson.put("address", childJson);
		
		Map<String,Object> parentJson2 = new HashMap<>();
		parentJson2.put("id", 2);
		parentJson2.put("fname", "asif");
		parentJson2.put("lname", "iqbal");
		parentJson2.put("gender", "male");
		parentJson2.put("married-status", true);
		parentJson2.put("address", "Rajshahi");
		
		List<Map<String,Object>> jsonArray = new ArrayList<Map<String,Object>>();
		
		
		jsonArray.add(parentJson2);
		jsonArray.add(parentJson);
		
		RestAssured.given()
						.body(jsonArray)
						.log()
						.all()
						.post();

	}

}
