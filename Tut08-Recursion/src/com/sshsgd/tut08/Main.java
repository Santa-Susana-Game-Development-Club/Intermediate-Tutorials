package com.sshsgd.tut08;

public class Main {

	public static void main(String[] args) {
//		infinteRecursion(10);
		System.out.println(factorial(5));
		System.out.println(factorial(8));
		System.out.println(factorial(1));
	}
	
	@SuppressWarnings("unused")
	private static int infinteRecursion(int n) {
		System.out.println(infinteRecursion(n));
		return n - 1;
	}
	
	private static int factorial(int n) {
		int result;
		if(n <= 1) {
			result =  1; //stopping point
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}

}
