package com.tutorials.interfaces;

public class Apple implements Edible, Fruit { //This is how you can implement interfaces

	@Override
	public String howToEat() { //All methods in every interface a class implements must be overriden
		return "Bite into it";
	}

	@Override
	public String name() {
		return "name";
	}

}
