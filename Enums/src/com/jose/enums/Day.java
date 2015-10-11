package com.jose.enums;

/**
 * 
 * Enums are a special data type that is made for constants.
 * 
 * 
 * 
 */

public enum Day {
	SUNDAY ("Weekend is almost over :("), //These Parentheses are only necessary if there is a constructor
	MONDAY ("Week has started :("), 
	TUESDAY ("Normal day."), 
	WEDNESDAY ("Hump day"), 
	THURSDAY ("Almost done with week"), 
	FRIDAY ("Last day of week :)"),
	SATURDAY ("Weekend!!!!"); //This semicolon is only necessary if you have constant values in your enum
	
	private final String opinion; //Not all enums have values, but they must be final
	Day(String opinion) {
		this.opinion = opinion;
	}
	
	public String getOpinion() { return opinion; } //Enums can have getters, but not setters
}
