package com.sshsgd.tut19;

/**
 * Bubble sorting works by looping through each element of an array, and checking if the element
 * after it is less. If it is less than the current value, they switch places. It loops through
 * the array n - 1 times, n being the length of the array.
 *
 */

public class Bubble {

	public static void main(String[] args) {
		int[] array = { //Unordered Array of ints
			5, 1, 12, -5, 16
		};
		System.out.println(SortingConstants.intArrayToString(array)); //Look at the array before sorting
		bubbleSort(array); //Sort the array
		System.out.println(SortingConstants.intArrayToString(array)); //Look at the array after sorting
	}
	
	public static void bubbleSort(int[] array) {
		for(int j = 0; j < array.length - 1; j++) { //Go through the array 1 time less than the length
			for(int i = 0; i < array.length - 1; i++) { //Loop through the array, stop at the second to last index
				int index1 = i; //Current number index
				int index2 = i + 1; //Next number index
				int temp1 = array[index1]; //Current number
				int temp2 = array[index2]; //Next Number
				if(temp2 < temp1) { //If the next number is less than than the current number
					array[index1] = temp2; //Set the current Number the the next number
					array[index2] = temp1; //Set the next number to the current nuber
				}
			}
		}
	}
	
	/**
	 * 
	 * EXPECTED OUTPUT:
	 * 
	 * [5, 1, 12, -5, 16]
	 * [-5, 1, 5, 12, 16]
	 * 
	 */

}
