package com.javaex.ex05;

public class Point {
//field
	private int x;
	private int y;

//constructor
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//method-g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//method-generic
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

		

}
