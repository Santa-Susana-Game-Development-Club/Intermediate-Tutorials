package com.sshsgd.tut18;

public class Circle extends Shape {

	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}


	@Override
	public float getArea() {
		return (float) (Math.PI * Math.pow(radius, 2));
	}

}
