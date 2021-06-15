package com.javaex.ex01;

public class MyListApp {
	public static void main(String[] args) {

		System.out.println("Point 관리---------------");

//포인트 관리 리스트 생성
		PointList pList = new PointList();

		Point p00 = new Point(2, 2); //array no1
		Point p01 = new Point(3, 3); //array no2
		Point p02 = new Point(4, 4); //array no3

		pList.add(p00);
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList);
		
		System.out.println(pList.size());
		
		System.out.println(pList.get(1).toString()); //Point x=3 y=3
		System.out.println(pList.get(1)); // Point x=3 y=3
		System.out.println(pList.get(1).getX()); //3
		System.out.println("0--------------------------"); //3
		
		for(int i=0; i<pList.size();i++) {
			System.out.println(pList.get(i).getX());
		}
		
		System.out.println("======================");
		
//원관리
		
//원관리 리스트 생성
		CircleList cList = new CircleList();
		
		Circle c00 = new Circle(5);
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(15);
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList);
		
		System.out.println(cList.size());
		
		System.out.println(cList.get(1).toString());
		System.out.println(cList.get(1));
		System.out.println(cList.get(1).getRadius());
		System.out.println("---------------------------------");
		
		
		for(int i=0; i<cList.size(); i++ ) {
			//System.out.println(cList.get(i));
			System.out.println(cList.get(i).getRadius());
		}
		
	//배열사용시
		//Point[] pArray = new Point[100]; 
	// 갯수를 정해야된다.
		
	}
}
