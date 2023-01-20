package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {

		String[] arr = new String[5];
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4";
		arr[4] = "5";
		
		System.out.println(arr[3]);
		
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println(list.get(0));

	}

}
