package org.nadim.jacksonapi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class P3WriteJsonObjectUsingJackson {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student st = new Student();
		st.setName("Asif");
		st.setAge(29);
		st.setGender("male");
		st.setMarriedStatus(true);
		
		ObjectMapper m = new ObjectMapper();
		//String jsonObject = m.writerWithDefaultPrettyPrinter().writeValueAsString(st);
		//System.out.println(jsonObject);
		
		m.writerWithDefaultPrettyPrinter()
				.writeValue(new FileOutputStream(new File("./src/test/resources/std.json")),st);
		
		

	}

}
