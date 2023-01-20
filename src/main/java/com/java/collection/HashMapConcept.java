package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
	

		map.put("Username", "nishant@gmail.com");
		map.put("Password", "password");
		
		
		//System.out.println(map);
		
		System.out.println(map.get("Username"));

		for (Map.Entry m : map.entrySet()) {
			//System.out.println(m.getKey() + ":" + m.getValue());			
			System.out.println(m.getKey());
			
		
			
			

		}

	}

}
