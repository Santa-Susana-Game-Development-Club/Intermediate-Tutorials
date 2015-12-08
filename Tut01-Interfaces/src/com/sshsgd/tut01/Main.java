package com.sshsgd.tut01;

public class Main {

	public static void main(String[] args) {
		FoodInstruction fi1 = new FoodInstruction();
		FoodInstruction fi2 = new FoodInstruction();
		FoodInstruction fi3 = new FoodInstruction();
		
		fi1.setEdible(new Sushi()); //Polymorphism applies to interfaces
		fi1.howToEat();
		
		fi2.setEdible(new Edible() { //This is called an anonymous class
			@Override
			public void howToEat(Edible e) { //Instructions for bread
				 System.out.println("Use a spoon! " + e.getClass().getName());//Anonymous classes do not have their own names, the $1 shows that it is the first anonymous class in Main
			}
		});
		fi2.howToEat();
		
		fi3.setEdible(e -> { //This is a lambda expression, which is basically creating an anonymous class much easier
			//Note that here is the code for the howToEat(Edible e) method, Java identifies that by the arguments, here we have "e" and since howToEat is the only method that only has one parameter, Java knows to override that method
			System.out.println("Use a fork! " + e.getClass().getName()); //Similar to anonymous classes, lambda expressions do not have names, but are identified by the $, so in this case, this is Main$$Lambda$1/some# 
		});
		fi3.howToEat();
		/**
		 * EXPECTED OUTPUT:
		 * 
		 * Use chopsticks! Sushi
		 * Use a spoon! com.sshsgd.tut01.Main$1
		 * Use a fork! com.sshsgd.tut01.Main$$Lambda$1/some#
		 */
	}

}
