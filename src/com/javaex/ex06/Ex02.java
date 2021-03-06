package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		while(lottoSet.size() <6) {
			int num = 1+(int)(Math.random()*45);
			lottoSet.add(num); //duplicate check
		}
		
		System.out.println("------------------------------------------");
		
		for(int lottoNo : lottoSet) {
			System.out.print(lottoNo+"\t");
		}
	}
}
