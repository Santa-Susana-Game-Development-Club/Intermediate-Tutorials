package com.jose.enums;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Day day;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the week is it?");
		String dow = in.nextLine();
		
		if(dow.equalsIgnoreCase("Sunday")) {
			day = Day.SUNDAY;
		} else if(dow.equalsIgnoreCase("Monday")) {
			day = Day.MONDAY;
		} else if(dow.equalsIgnoreCase("Tuesday")) {
			day = Day.TUESDAY;
		} else if(dow.equalsIgnoreCase("Wednesday")) {
			day = Day.WEDNESDAY;
		} else if(dow.equalsIgnoreCase("Thursday")) {
			day = Day.THURSDAY;
		} else if(dow.equalsIgnoreCase("Friday")) {
			day = Day.FRIDAY;
		} else if(dow.equalsIgnoreCase("Saturday")) {
			day = Day.SATURDAY;
		} else {
			System.out.println("That was wrong!");
			day = null;
		}
		
		System.out.println(day + ": " + day.getOpinion());
		
		in.close();
	}

}
