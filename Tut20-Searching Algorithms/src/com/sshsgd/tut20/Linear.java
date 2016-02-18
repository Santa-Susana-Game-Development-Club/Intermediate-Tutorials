package com.sshsgd.tut20;

public class Linear {

	public static void main(String[] args) {
		int[] array = {
			5, 7, 1, -8, 63, 42
		};
		System.out.println(linearSearch(array, 42));
		System.out.println(linearSearch(array, 0));
		System.out.println(linearSearch(array, 1));
	}
	
	public static int linearSearch(int[] array, int find) {
		int result = -1; //Default return, will still be -1 if the number is not found
		for(int i = 0; i < array.length; i++) { //Loop through the array
			if(array[i] == find) { //If the value at the index is equal to find
				result = i; //Set the result to the index of the first iteration of find
				break; //Break out of the loop so that we don't do anymore unnecessary checks
			}
		}
		return result;
	}
	
	/**
	 * 
	 * EXPECTED OUTPUT:
	 * 
	 * 5
	 * -1
	 * 2
	 * 
	 */
	
}
