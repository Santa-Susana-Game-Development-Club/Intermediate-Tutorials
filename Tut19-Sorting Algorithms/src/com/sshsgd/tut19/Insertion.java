package com.sshsgd.tut19;
/**
 * Bubble sorting read left to right, and checked the value after the current value. Insertion
 * sorting works the same way, but checks the value before the current value instead. If the 
 * value at the index is greater than the current value, then swap the elements in the list.
 *
 */
public class Insertion {

	public static void main(String[] args) {
		int array[] = { //Unordered int array
			5, 2, 4, 6, 1, 3
		};
		System.out.println(SortingConstants.intArrayToString(array)); //Show the array before sort
		insertionSort(array); //Sort the array
		System.out.println(SortingConstants.intArrayToString(array)); //Show the array after sort
	}

	public static void insertionSort(int array[]) {
		for(int i = 0; i < array.length - 1; i++) { //Go through the array 1 time less than the length
			for(int j = 1; j < array.length; j++) { //Starting at the second index, loop through the array
				int tempJ = array[j]; //Current value
				int tempJM = array[j - 1]; //Value before current
				if(tempJM > tempJ) { //If the previous number is greater than the current number
					array[j] = tempJM; //Set the number at the current index to the previous number
					array[j - 1] = tempJ; //Set the number at the previous index to the original number
				}
			}
		}
	}
	
	/**
	 * 
	 * EXPECTED OUTPUT:
	 * 
	 * [5, 2, 4, 6, 1, 3]
	 * [1, 2, 3, 4, 5, 6]
	 * 
	 */
	
}
