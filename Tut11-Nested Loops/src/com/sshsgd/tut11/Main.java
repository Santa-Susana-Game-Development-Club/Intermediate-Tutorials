package com.sshsgd.tut11;

/**
 * In programming, anything "nested" is basically referring to a block of code inside of another
 * block of code. For example, a nested if statement is an if statement inside another if statement
 * 
 * Nesting loops is done commonly, especially when reading and writing tables
 * 
*/

public class Main {

	public static void main(String[] args) {
		// This example is going to be VERY basic, we are just going to print a bunch of periods
		
		int numRows = 5;
		int numCols = 10;
		
		for(int i = 0; i < numRows; i++) { //Standard is to make the loop of rows the outer loop, with the variable i
			for(int j = 0; j < numCols; j++) { //Columns are the inner loop with variable j
				System.out.print(".");
			}
			System.out.print("\n");
		}
		
		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * ..........
		 * ..........
		 * ..........
		 * ..........
		 * ..........
		 * 
		 */

	}

}
