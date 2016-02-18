package com.sshsgd.tut20;

public class Binary {

	public static void main(String[] args) {
		int[] array = {
			13, 24, 34, 46, 52, 63, 77, 89, 91, 100
		};
		System.out.println(binarySearch(array, 63));
		System.out.println(binarySearch(array, 42));
		System.out.println(binarySearch(array, 13));
	}

	public static int binarySearch(int array[], int find) {
		return binarySearch(array, find, 0, array.length - 1);
	}
	
	public static int binarySearch(int array[], int find, int low, int high) {
		
		int pos;
		
		pos = (low + high) / 2; //Center position between bounds
		
		while(array[pos] != find && (low <= high)) { //While the array at the position is not equal to what we are looking for, and lower bound is less than higher bound
			
			if(array[pos] > find) { //if the value at the array is greater than we are looking for
				high = pos - 1; //Move the higher bound to only include the numbers before the number at the position
			} else { 
				low = pos + 1; //Move the lower bound to only include the numbers after the number at the position
			}
			pos = (low + high) / 2; // Recenter position between bounds
		}
		if(low <= high) { //If low is still less than high, then we found the number
			return pos;
		}
		
		return -1; //Return -1 if the number was not found
	}
	
}
