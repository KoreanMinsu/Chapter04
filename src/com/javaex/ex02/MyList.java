package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
//field	
	private Object[] oArray;
	private int crtPos;
	
//constructor
	public void Mylist() {
		this.oArray = new Object[3];
		crtPos = 0;
	}
	
//method-g/s
	
//method-generic
	public void add(Object object) {
		//배열크기 가변로직 생략
		oArray[crtPos] = object;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
