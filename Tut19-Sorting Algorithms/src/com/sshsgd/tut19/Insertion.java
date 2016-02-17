package com.sshsgd.tut19;

public class Insertion {

	public static void main(String[] args) {
		int array[] = {
			5, 2, 4, 6, 1, 3
		};
		System.out.println(SortingConstants.intArrayToString(array));
		insertionSort(array);
		System.out.println(SortingConstants.intArrayToString(array));
	}

	public static void insertionSort(int array[]) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 1; j < array.length; j++) {
				int tempJ = array[j];
				int tempJM = array[j - 1];
				if(tempJM > tempJ) {
					array[j] = tempJM;
					array[j - 1] = tempJ;
				}
			}
		}
	}
	
}
