package com.sshsgd.tut19;

public class Bubble {

	public static void main(String[] args) {
		int[] array = {
			5, 1, 12, -5, 16
		};
		System.out.println(SortingConstants.intArrayToString(array));
		array = bubbleSort(array);
		System.out.println(SortingConstants.intArrayToString(array));
	}
	
	public static int[] bubbleSort(int[] array) {
		int[] tempArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		for(int j = 0; j < tempArray.length - 1; j++) {
			for(int i = 1; i < tempArray.length; i++) {
				int index1 = i;
				int index2 = i - 1;
				int temp1 = tempArray[index1];
				int temp2 = tempArray[index2];
				if(temp2 > temp1) {
					tempArray[index1] = temp2;
					tempArray[index2] = temp1;
				}
			}
		}
		return tempArray;
	}

}
