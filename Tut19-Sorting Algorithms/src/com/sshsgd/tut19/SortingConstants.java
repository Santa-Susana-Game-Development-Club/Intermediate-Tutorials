package com.sshsgd.tut19;

public class SortingConstants {

	public static String intArrayToString(int[] array) {
		String s = "[";
		for(int i = 0; i < array.length; i++) {
			s += array[i];
			if(i < array.length - 1) {
				s += ", ";
			}
		}
		s += "]";
		return s;
	}
	
}
