package com.javaex.ex03;

public class MyListApp {
	public static void main(String[] args) {

		System.out.println("point 리스트 관리-------------");
		MyList<Point> pList = new MyList<Point>();
		
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(5,10);
		
		
		
		Circle c03 = new Circle(100);
		
		pList.add(p01);
		pList.add(p02);
		
		//pList.add(c03); 
//다른 인스턴스도 들어가버림(오류가 발생해야함)
		
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
	}
}
