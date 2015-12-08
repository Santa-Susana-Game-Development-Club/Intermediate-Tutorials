package com.sshsgd.tut02;

public class Main {

	public static void main(String[] args) {
		HowAppPlays hap1;
		HowAppPlays hap2;
		
		hap1 = new HowAppPlays(Platforms.PC); //This is how you pass in an enum value
		hap1.printHowAppRuns();
		
		hap2 = new HowAppPlays(Platforms.ANDROID);
		hap2.printHowAppRuns();
	}

}
