package com.sshsgd.tut19;

public class Bubble {

	public static void main(String[] args) {
		int[] array = {
			5, 1, 12, -5, 16
		};
		System.out.println(SortingConstants.intArrayToString(array));
		bubbleSort(array);
		System.out.println(SortingConstants.intArrayToString(array));
	}
	
	public static void bubbleSort(int[] array) {
		for(int j = 0; j < array.length - 1; j++) {
			for(int i = 1; i < array.length; i++) {
				int index1 = i;
				int index2 = i - 1;
				int temp1 = array[index1];
				int temp2 = array[index2];
				if(temp2 > temp1) {
					array[index1] = temp2;
					array[index2] = temp1;
				}
			}
		}
	}

}
