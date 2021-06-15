package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
//field	
	private T[] oArray;
	private int crtPos;
	
//constructor
	public MyList() {
		this.oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
//method-g/s
	
//method-generic
	public void add(T object) {
		//배열크기 가변로직 생략
		oArray[crtPos] = object;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
