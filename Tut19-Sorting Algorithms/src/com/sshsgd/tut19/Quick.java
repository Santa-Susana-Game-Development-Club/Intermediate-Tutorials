package com.sshsgd.tut19;

public class Quick {

	public static void main(String[] args) {
		int[] array = {
			3, 7, 8, 5, 2, 1, 9, 5, 4
		};
		System.out.println(SortingConstants.intArrayToString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println(SortingConstants.intArrayToString(array));
		

	}
	
	public static void quickSort(int[] array, int low, int high) {
		int i = low; //low index
		int j = high; //high index
		int pivot = array[low+(high - low)/2]; //setting pivot to center
		while(i <= j) { //Manipulate i and j until i is greater than j
			//Find the first number that is greater than the pivot from the right
			while(array[i] < pivot) {
				i++; //Move i up until it is not less than the pivot
			}
			//Find the first number that is less than the pivot from the left
			while(array[j] > pivot) {
				j--; //Move j down until it is not greater than the pivot
			}
			if(i <= j) {
				int tempI = array[i];
				int tempJ = array[j];
				array[i] = tempJ;
				array[j] = tempI;
				i++;
				j--; //if i is less than or equal to j then swap the numbers at i and j
				 
			}
		}
		//Recursively call quick sort until the array is completely sorted
		if(low < j) {
			quickSort(array, low, j);
		}
		if(i < high) {
			quickSort(array, i, high);
		}
	}

}
