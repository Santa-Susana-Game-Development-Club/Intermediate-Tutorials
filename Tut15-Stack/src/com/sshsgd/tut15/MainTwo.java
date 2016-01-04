package com.sshsgd.tut15;

/**
 * A stack is more than just a list type. The stack is basically how all programs are created.
 * A program starts with the main method, and a bunch of methods are called and methods are 
 * called in those methods. Those methods act like a stack. The most recently called method
 * would be the first to return its value (or nothing in terms of a void). The first method 
 * called is the last one to return its value.
 */

public class MainTwo {

	public static void main(String[] args) {
		System.out.println("Main is starting!");
		method1();
		System.out.println("Main is returning!");
	}

	private static void method1() {
		System.out.println("Method one starting!");
		method2();
		System.out.println("Method one returning!");
	}

	private static void method2() {
		System.out.println("Method two starting!");
		method3();
		System.out.println("Method two returning!");
	}

	private static void method3() {
		System.out.println("Method three starting!");
		System.out.println("Method three returning!");
	}
	
	/**
	 * 
	 * EXPCETED OUTPUT:
	 * 
	 * Main is starting!
	 * Method one starting!
	 * Method two starting!
	 * Method three starting!
	 * Method three returning!
	 * Method two returning!
	 * Method one returning!
	 * Main is returning!
	 * 
	 */
	
}
