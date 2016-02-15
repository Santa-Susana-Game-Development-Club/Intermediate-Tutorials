package com.sshsgd.tut18;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Instanceof checks if a variable is a certain type. Works great with dealing with 
		 * polymorphism and lists. 
		 */
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i = 0; i < 100; i++) {
			if(Math.random() > .5) {
				shapes.add(new Circle(r.nextFloat() * 10));
			} else {
				shapes.add(new Rectangle(r.nextFloat() * 10, r.nextFloat() * 10));
			}
		}
		
		int numCircles = 0; 
		float perimeters = 0;
		float totalArea = 0;
		
		for(Shape s : shapes) {
			if(s instanceof Circle) { //Checks if s is a Circle
				numCircles++;
			}
			if(s instanceof Rectangle) { //Checks if s is a Rectangle
				perimeters += ((Rectangle) s).getPerimeter(); //Safely cast Rectangle to s because we know it is a Rectangle, so we can do calculations specific to Rectangles
			}
			totalArea += s.getArea(); 
		}
		
		System.out.println(String.format("There are %d circles is the list.", numCircles));
		System.out.println(String.format("The total perimeter of all the rectangles in the list is: %f", perimeters));
		System.out.println(String.format("The total area of all the shapes is: %f", totalArea));
		
		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * There are some# circles is the list.
		 * The total perimeter of all the rectangles in the list is: some#
		 * The total area of all the shapes is: some#
		 * 
		 */
		
	}

}
