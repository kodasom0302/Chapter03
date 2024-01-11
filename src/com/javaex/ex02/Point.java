package com.javaex.ex02;

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

}
