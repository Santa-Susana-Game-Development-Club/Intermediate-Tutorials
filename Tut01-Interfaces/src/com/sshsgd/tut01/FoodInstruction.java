package com.sshsgd.tut01;

public class FoodInstruction {

	private Edible e;
	
	public void howToEat() {
		e.howToEat(e);
	}

	public void setEdible(Edible e) {
		this.e = e;
	}
}
