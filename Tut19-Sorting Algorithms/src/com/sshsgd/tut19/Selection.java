package com.sshsgd.tut19;

public class Selection {

	public static void main(String[] args) {
		int[] array = {
			5, 1, 12, -5, 16, 2, 12, 14	
		};
		System.out.println(SortingConstants.intArrayToString(array));
		selectionSort(array);
		System.out.println(SortingConstants.intArrayToString(array));
	}
	
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				int tempI = array[i];
				int tempJ = array[j];
				if(tempI > tempJ) {
					array[i] = tempJ;
					array[j] = tempI;
				}
			}
		}
	}
	
}
