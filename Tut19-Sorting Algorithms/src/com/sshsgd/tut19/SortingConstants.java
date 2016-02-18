package com.sshsgd.tut19;

public class SortingConstants {

	public static String intArrayToString(int[] array) {
		String s = "["; //Start the String with an opening square bracket
		for(int i = 0; i < array.length; i++) { //Loop through each element of the array
			s += array[i]; //Add the value to the string
			if(i < array.length - 1) {
				s += ", "; //If the current element is not the last, add a comma and a space after the value
			}
		}
		s += "]"; //Close the String with a closing square bracket
		return s;
	}
	
}
