package org.nadim.jsonpayloadconverting;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class P2CreateNestedJsonObjectFromMap {
/*
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
}
 */
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
		
		RestAssured.given()
					 .body(parentJson)
					 .log()
					 .all()
					 .post();
		
	}

}
