package com.sshsgd.tut16;

public class MainTwo {

	public static void main(String[] args) {
		// No need to call new for NoInstance
		System.out.print("[");
		for(int i : NoInstance.array) { //The array does not need to be initialized here because it was initialized at the start of the program
			System.out.print(i + ", ");
		}
		System.out.print("]");
		// Without the static initialization block, the above code would have resulted in a NullPointerException
		
		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * [1, 4, 8, 1, ]
		 * 
		 */
	}

}
