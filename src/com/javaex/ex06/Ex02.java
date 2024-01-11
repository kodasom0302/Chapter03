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
		String[] sArray=a.split(",");	//나누면 두 개 이상의 문자가 되기 때문에 배열로 취급
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		String str="Hello JAVA!";
		
		//3번째 방부터 뒤까지 출력 - 배열로 관리된 걸 알 수 있음
		System.out.println(str.substring(3));
		//1번째 방부터 7번째 방 전까지
		System.out.println(str.substring(1,7));
		
		//i luv u♡ 

	}

}
