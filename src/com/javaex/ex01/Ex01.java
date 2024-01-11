package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj=new Object();
		
		System.out.println(obj.getClass());		//클래스 정보
		System.out.println(obj.toString());		//겟클래스@hashcode
		System.out.println(obj.hashCode());		//일단 주소라고 알자
		System.out.println(obj.equals(obj));	//두 개가 같냐? - 주소 비교X
		
		System.out.println("==========================");
		
		//클래스 정보
		System.out.println(obj.getClass());
		
		//obj.toString()
		System.out.println(obj.toString());
		System.out.println(obj);	//println이 가진 기능(toString()을 찾음)으로 인해 클래스 정보 출력됨
		
		//hashcode()
		Object obj01=new Object();
		Object obj02=new Object();
		Object obj03=new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//equals()
		System.out.println(obj01.equals(obj01));
		System.out.println(obj01.equals(obj02));
		
		System.out.println(obj01==obj01);	//주소값 비교
		System.out.println(obj01==obj03);

	}

}
