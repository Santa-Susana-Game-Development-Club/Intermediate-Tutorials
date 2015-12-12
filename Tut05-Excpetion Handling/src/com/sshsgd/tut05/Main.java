package com.sshsgd.tut05;
/**
 * 
 * An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
 * - https://docs.oracle.com/javase/tutorial/essential/exceptions/
 *
 */
public class Main {
	
	static Object o;

	public static void main(String[] args) {
//		printObject(o); This code will cause a NullPointerException and completely stop the program from running
		/*
		 * Exception handling exists so that the program does not have to completely stop running
		 * when an error occurs
		 */
		 
		try {
			printObject(o);
		} catch(Exception e) {
			System.out.println("There was an error printing the object");
		}
		
		try {
			printObjectWithThrows(o);
		} catch (NullPointerException e) {
			System.out.println("That object was not initalized");
		}
		
		try {
			System.out.println(divideFloats(3.1459f, 0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		/**
		 * 
		 * EXPECTED OUTPUT: 
		 * 
		 * There was an error printing the object
		 * That object was not initalized
		 * java.lang.ArithmeticException: Can not divide by 0
		 * 		at com.sshsgd.tut05.Main.divideFloats(Main.java:61) (These line numbers include comments and such)
		 * 		at com.sshsgd.tut05.Main.main(Main.java:32)
		 * 
		 */
		
	}
	
	private static void printObject(Object o) {
		System.out.println(o.toString());
	}
	
	private static void printObjectWithThrows(Object o) throws NullPointerException {
		System.out.println(o.toString());
	}
	
	private static float divideFloats(float f1, float f2) throws ArithmeticException {
		if(f2 == 0) {
			throw new ArithmeticException("Can not divide by 0");
		} else {
			return f1 / f2;
		}
	}

}
