package com.sshsgd.tut18;

public class Rectangle extends Shape {

	private float length;
	private float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public float getArea() {
		return length * width;
	}
	
	public float getPerimeter() {
		return (length * 2) + (width * 2);
	}

}
