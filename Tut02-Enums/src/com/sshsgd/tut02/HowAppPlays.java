package com.sshsgd.tut02;

public class HowAppPlays {
	
	/**
	* public static final int PC = 0;
	* public static final int ANDROID = 1;
	* 
	* This is another way to do an Enumeration. Here, you explicitly give each constant a number.
	* This way would be usefull when doing key bindings that will be using in Arrays and such 
	* 
	*/
	
	private Platforms platform; //Declared like any other object
	
	public HowAppPlays(Platforms platform) {
		System.out.println(platform); //Prints out which specific constant is being used
		this.platform = platform;
	}
	
	public void printHowAppRuns() {
		if(this.platform == Platforms.ANDROID) { //This is how you evaluate the enum type
			System.out.println("Running the Android SDK");
		} else if(this.platform == Platforms.PC) {//A switch case block would also be appropriate for something like this
			System.out.println("Running whatever framework the dev chose");
		}
	}
	
}
