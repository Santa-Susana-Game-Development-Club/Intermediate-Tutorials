package com.sshsgd.tut10;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(getTypeName(o));
		
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(2);
		intList.add(78);
		intList.add(321);
		intList.add(5);

		System.out.println(listContains(2, intList, false));
		System.out.println(listContains(4, intList, false));
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("lorem");
		stringList.add(new String("ipsum"));
		System.out.println(listContains("ipsum", stringList, true));
		System.out.println(listContains("ipsum", stringList, false));
		
		/**
		 * 
		 * EXPECTED OUTPUT
		 * 
		 * java.lang.Object
		 * true
		 * false
		 * true
		 * false
		 * 
		 */
		
	}

	static <T> String getTypeName(T t) { //Generic declaration goes between modifiers and return type
		return t.getClass().getName();
	}
	
	static <T> boolean listContains(T value, List<T> list, boolean equals) {
		for(T t : list) {
			if(equals) {
				if(t.equals(value)) {
					return true;
				}
			} else {
				if(t == value) {
					return true;
				}
			}
		}
		return false;
	}
	
}
