package com.sshsgd.tut01;

public class Sushi implements Edible { //This is the implementation of an interface, you can implement multiple interfaces by doing the following: "public class ClassName implements InterfaceOne, InterfaceTwo,...InterfaceN" but I will not be doing that in this tutorial

	@Override
	public void howToEat(Edible e) { //Everything from every interface a class implements must be overridden
		 System.out.println("Use chopsticks! " + e.getClass().getSimpleName()); //Shows that the class is in fact Sushi when this method is called
	}

}
