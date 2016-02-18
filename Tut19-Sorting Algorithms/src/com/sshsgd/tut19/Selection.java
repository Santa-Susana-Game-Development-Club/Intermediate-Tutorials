package com.sshsgd.tut19;
/**
 * Selection sorting involves checking all the values after the current value. You loop through
 * the array, and then loop through the array again starting at the index after the current
 * index. If it finds a number less than the current number, the elements swap places.
 *
 */
public class Selection {

	public static void main(String[] args) {
		int[] array = { //Unordered int array
			5, 1, 12, -5, 16, 2, 12, 14	
		};
		System.out.println(SortingConstants.intArrayToString(array)); //Show array before sort
		selectionSort(array); //Sort array
		System.out.println(SortingConstants.intArrayToString(array)); //Show array after sort
	}
	
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) { //Go through the array 1 time less than the length
			for(int j = i + 1; j < array.length; j++) { //Loop through the array starting at the index after i
				int tempI = array[i]; //Value at i
				int tempJ = array[j]; //Value at j
				if(tempI > tempJ) { //If the value at i is greater than the value at j
					array[i] = tempJ; //Set the value of i to the value of j
					array[j] = tempI; //Set the value of j to the original value of i
				}
			}
		}
	}
	
	/**
	 * 
	 * EXPECTED OUTPUT:
	 * 
	 * [5, 1, 12, -5, 16, 2, 12, 14]
	 * [-5, 1, 2, 5, 12, 12, 14, 16]
	 * 
	 */
	
}
