package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a=new String(" abcd");
		String b=new String(",efg ");
		
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		*/
		
		//문자 합치기
		a=a.concat(b);
		System.out.println(a);
		
		//시작과 끝 공백 없애기 - 중간은 사라지지 않음
		a=a.trim();
		System.out.println(a);
		
		//특정 부분 내용 바꾸기
		a=a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("------------------------");
		
		//"" 안에 넣은 기호 기준으로 문자를 나눠달라
		String[] sArray=a.split(",");	//나누면 두 개 이상의 문자가 되기 때문에 배열로 관리
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		String str="Hello JAVA!";
		
		//3번째 방부터 뒤까지 출력 - 배열로 관리 된다는 걸 알 수 있음
		String result01=str.substring(3);
		System.out.println(result01);
		
		//1번째 방부터 7번째 방 전까지
		String result02=str.substring(1,7);
		System.out.println(result02);
		
		char result03=str.charAt(8);
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("----------------------");
		
		String s01=new String("안녕");
		String s02=new String("안녕!");
		
		if (s01==s02) {
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		
		if (s01.equals(s02)) {
			System.out.println("글자 같음");
		} else {
			System.out.println("글자 다름");
		}
		
		System.out.println("-------------------------------");
		
		String s03=null;
		
		if ("안녕".equals(s03)) {	//주소가 없는 경우 오류 발생할 가능성이 있기 때문에 그 변수의 equals()를 사용
			System.out.println("출력");
		}
		
		//i luv u♡ 

	}

}
