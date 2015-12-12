package com.sshsgd.tut04;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		GenericBox<Integer> intBox; //Can only take object types
		GenericBox<Date> dateBox;
		
		intBox = new GenericBox<>(); //You do not have to put the type again in the constructor
		dateBox = new GenericBox<Date>(); //But you can if you want to
		
		intBox.set(23);
		intBox.print();
		System.out.println(12 + intBox.get());
		
		dateBox.set(new Date(98, 11, 28));
		dateBox.print();
		System.out.println(dateBox.get().getYear()); //Calling .get() returns whatever type put in
	
		/**
		 * EXPECTED OUTPUT:
		 * 
		 * 23
		 * 35
		 * Mon Dec 28 00:00:00 PST 1998
		 * 98
		 * 
		 */
	}

}
