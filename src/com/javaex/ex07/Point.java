package com.javaex.ex07;

public class Point {
	//field
		private int x;
		private int y;

	//constructor
		public Point() {
		}

	//method-g/s
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

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
