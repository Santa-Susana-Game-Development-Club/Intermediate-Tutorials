package com.sshsgd.tut12;

/**
 * 
 * As you know, an array can be a list of anything. An array can even be an array of arrays.
 * An array of an array is called a 2 Dimensional Array, an array of 2D Arrays is called a 3
 * Dimensional Array, and so on. These arrays of arrays are known as Multidimensional Arrays.
 * These absolutely will show up on the AP Test 
 *
 */

public class Main {

	public static void main(String[] args) {

		int[] oneD = { 1, 3, 7, 2 }; //This, as you know, is a one dimensional array
		/*
		 * One dimensional arrays have one set of square brackets ([]) and have one set of curly
		 * brackets ({}) with values
		 */
		
		System.out.println(oneD[1]); //Prints out the second element of oneD, which is an int
		
		int[][] twoD = { //This is a two dimensional array
			{43, 634, 423}, //You can have all this one one line, I prefer a line for each array
			{32, 42, 532},
			{3, 4, 2, 5, 56}
		};
		
		System.out.println(twoD[1]); //Prints out the second element of twoD, which is an array
		//This prints out the actual memory address of the array
		System.out.println(twoD[1][0]); //Prints the 1st element of the second array in twoD, and int
		System.out.print("\n");
		print2DArrayOfInts(twoD);
		
		/**
		 * 
		 * EXPCETED OUTPUT
		 * 
		 * 3
		 * [I@someHex
		 * 32
		 * 
		 * 43	634	423	
		 * 32	42	532	
		 * 3	4	2	5	56	
		 * 
		 */
		
	}
	
	private static void print2DArrayOfInts(int[][] array) {
		for(int row = 0; row < array.length; row++) { //Some like to use i, j, k... for their nested loops, but some like row and col for 2D arrays
			for(int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t"); //\t adds a tab in the string
			}
			System.out.print("\n"); //Creates a new line
		}
	}

}
