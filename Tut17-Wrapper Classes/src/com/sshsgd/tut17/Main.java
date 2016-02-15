package com.sshsgd.tut17;

import java.util.ArrayList;

/**
 * Wrapper Classes are used to convert back and forth between primitive and object types.
 * For every primitive data type, there is a wrapper class to make an object out of the type
 */
public class Main {

	public static void main(String[] args) {
		/**
		 * The wrapper classes are as follows:
		 * Primitive	-	Wrapper
		 * boolean		-	Boolean
		 * char			-	Character
		 * byte			- 	Byte
		 * short 		- 	Short
		 * int			-	Integer
		 * long			- 	Long
		 * float		-	Float
		 * double		-	Double
		 */
		
		//Converting primitive to object
		
		int primA = 10;
		Integer objA1 = Integer.valueOf(primA); //Getting value of primA manually
		Integer objA2 = primA; //This is known as autoboxing, which is a Java feature that converts primitive to object automatically
		
		System.out.println(String.format("Primative: %d\tManual Conversion: %d\tAutobox: %d", primA, objA1, objA2)); //They all have the same value
		
		Integer objB = new Integer(40);
		int primB1 = objB.intValue(); //Getting value of objB manually
		int primB2 = objB; //This is known as unboxing, which is a Java feature that converts object to primitive automatically
		
		System.out.println(String.format("Object: %d\tManual Conversion: %d\tUnbox: %d", objB, primB1, primB2)); //They all have the same value
		
		/**
		 * You may be asking yourself, "Why is this important?" 
		 * One example of how this all comes into play is when working with Generic Classes
		 * Remember that Generic Types only work with Objects, not with Primitives
		 */
		
//		ArrayList<int> intList;
		//^^ You cannot do this
		
		ArrayList<Integer> intList = new ArrayList<>(); //Use Wrapper Class to use a primitive type in a Generic Class
		
		intList.add(3); //The list works as if it were an ArrayList of int types
		
		System.out.println(intList);

		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * Primative: 10	Manual Conversion: 10	Autobox: 10
		 * Object: 40		Manual Conversion: 40	Unbox: 40
		 * [3]
		 * 
		 */
		
	}

}
