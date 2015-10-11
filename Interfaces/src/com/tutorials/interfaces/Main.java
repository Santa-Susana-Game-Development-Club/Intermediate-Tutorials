package com.tutorials.interfaces;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Edible e;
		boolean passed = true;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("What food would you like to learn about?");
			String s = in.nextLine();
			if(s.equalsIgnoreCase("apple")) {
				e = new Apple();
			} else if(s.equalsIgnoreCase("banana")) {
				e = new Banana();
			} else {
				passed = false;
				e = null;
			}
		} while(!passed);
		
		if(passed) {
			System.out.println(e.howToEat());
		}
		in.close();
	}

}
