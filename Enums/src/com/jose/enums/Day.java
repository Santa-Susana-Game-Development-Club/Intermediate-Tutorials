package com.jose.enums;

public enum Day {
	SUNDAY ("Weekend is almost over :("), 
	MONDAY ("Week has started :("), 
	TUESDAY ("Normal day."), 
	WEDNESDAY ("Hump day"), 
	THURSDAY ("Almost done with week"), 
	FRIDAY ("Last day of week :)"),
	SATURDAY ("Weekend!!!!");
	
	private final String opinion;
	Day(String opinion) {
		this.opinion = opinion;
	}
	
	public String getOpinion() { return opinion; }
}
