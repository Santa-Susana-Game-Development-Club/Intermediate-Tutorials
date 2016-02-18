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
		int result = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == find) {
				result = i;
				break;
			}
		}
		return result;
	}
	
}
