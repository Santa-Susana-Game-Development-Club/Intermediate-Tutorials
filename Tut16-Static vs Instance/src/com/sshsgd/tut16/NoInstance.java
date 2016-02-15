package com.sshsgd.tut16;

public class NoInstance {
	//The new keyword will never be used for this class
	
	public static int[] array; //This array must be initialized somehow, or else it will be null
	
	static { //This is the static initialization block, which allows you to give static variables initial values, as well as creating static objects
		array = new int[]{
			1, 4, 8, 1
		};
	}
}
