package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00=new Point(3,5);
		Point p01=new Point(3,5);
		Point p02=new Point(13,15);
		Point p03=p02;	//p02의 주소를 p03에 넣어준 것 - new를 쓰지 않았기에 메모리에 올리지 않음
		
		System.out.println(p00.equals(p01));	//논리 비교:재정의 한 equals() 사용 - true
		System.out.println(p00==p01);			//주소값 비교 - false
		
		System.out.println(p01.equals(p02));	//논리 비교
		System.out.println(p03.equals(p02));	//논리 비교

	}

}
