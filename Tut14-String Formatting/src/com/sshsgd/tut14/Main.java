package com.sshsgd.tut14;

/**
 * String formatting is used to have variables in strings in a nice way. Numbers can be made to 
 * have less decimal places, leading zeros, correct spacing, and so on. There are several rules
 * when formatting a string in Java
 */

public class Main {

	public static void main(String[] args) {
		String s1 = String.format("%s", "Hello!"); //To format a string, you type basically the template, then all the variables that you plug in go in as varargs in the method
		
		System.out.println(s1);
		
		/*
		 * The basic rule to formating a string is "% [argument index] [flag] [width] [.precision] type"
		 */
		
		System.out.println(String.format("Plain integer %d", 766));
		
		System.out.println(String.format("Integer with leading zeroes: %06d", 123));
		
		System.out.println(String.format("Integer with padding:%6d%6d", 1, 332));
		
		System.out.println(String.format("Integer with padding to the right:%-6d%-6d.", 322, 43));

		System.out.println(String.format("Decimal Number: %f", Math.PI));
		
		System.out.println(String.format("Decimal Number with 2 Decimal Places: %.2f", Math.PI));
		
		System.out.println(String.format("Print a string: %s", "I am a string"));

		System.out.println(String.format("String padded to left:%15s", "Left"));
		
		System.out.println(String.format("String padded to left:%-15s.", "Right"));
		
		System.out.println(String.format("8 First Characters of a String:%.8s", "My Name Is Mr String"));
		
		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * Hello!
		 * Plain integer 766
		 * Integer with leading zeroes: 000123
		 * Integer with padding:     1   332
		 * Integer with padding to the right:322   43    .
		 * Decimal Number: 3.141593
		 * Decimal Number with 2 Decimal Places: 3.14
		 * Print a string: I am a string
		 * String padded to left:           Left
		 * String padded to left:Right          .
		 * 8 First Characters of a String:My Name
		 * 
		 */
		
	}

}
