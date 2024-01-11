package com.javaex.ex03;

public class Point /*extends Object와 동일(기본적인 거라 표시가 없을 뿐)*/ {
	
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//toSting() 재정의 -> Object에 기본으로 있는 걸 원하는대로 다시 만듦
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		//'같다'는 결과의 로직을 다시 작성
		//o=p01의 주소
		//본인(p00)의 x값과 o의 x값이 같냐?
		//본인의 y값과 o의 y값이 같냐?
		Point p=(Point) obj;
		boolean result;
		
		if (this.x==p.x && this.y==p.y) {
			result=true;
		} else {
			result=false;
		}
		return result;
	}

}
