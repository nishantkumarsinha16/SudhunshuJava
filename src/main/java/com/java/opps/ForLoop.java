package com.java.opps;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		System.out.println("List value: " + list);
		System.out.println("List Size: " + list.size());
		System.out.println("\n");

		for (int i = 1; i <= 20; i++) {
			if (i > 10 && i <= 15) {
				System.out.println(i);

			} else {
				System.out.println("===> " + i);
			}
		}

		for (String order : list) {
			System.out.println(order);
		}

//		list.stream().forEach(e-> System.out.println(e));
	}

}
