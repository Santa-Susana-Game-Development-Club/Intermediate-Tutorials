package com.sshsgd.tut16;

public class Test {

	public int instanceInt; //1 value for each individual Test object
	public static int staticInt; //1 value for every Test object
	
	public Test(int instanceInt) { //Called when making a Test object, as you know
		this.instanceInt = instanceInt; //The value of instanceInt is set for the individual instance
		//staticInt is not given a value in the constructor
	}
	
	public void incrementInts() {
		instanceInt++;
		staticInt++; //Static variables can be used in non static methods
	}
	
	public static void incrementStaticInt() {
//		instanceInt++; 
		//^^Instance variables can not be used in static methods
		staticInt++;
	}
	
	
	
	
}
