package com.javaex.ex03;

public class Circle {
//field
	private int radius;

//constructor
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

//method-g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//method-generic
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
