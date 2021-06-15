package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
	
	private Point[] pArray;
	private int crtPos = 0;
	
	public PointList() {
		this.pArray = new Point[3];
		crtPos = 0;
	}

	public void add(Point point) {
		//배열의 크기 가변로직 생략
		pArray[crtPos] = point;
		crtPos++;
	}
	public Point get(int index){
		return pArray[index];
	}
	
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
