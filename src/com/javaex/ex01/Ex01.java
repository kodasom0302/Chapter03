package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj=new Object();
		
		System.out.println(obj.getClass());		//클래스 정보
		System.out.println(obj.toString());		//겟클래스 이름+@+해시코드
		System.out.println(obj.hashCode());		//일단 주소라고 알자
		System.out.println(obj.equals(obj));	//두 개가 같냐?
		
		System.out.println("==========================");
		
		//클래스 정보
		System.out.println(obj.getClass());
		
		//obj.toString()
		System.out.println(obj.toString());
		System.out.println(obj);	//println이 가진 기능으로 인해 주소 출력됨

	}

}
