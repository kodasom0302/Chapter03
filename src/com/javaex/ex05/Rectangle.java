package com.javaex.ex05;

public class Rectangle {
	
	private int width;
	private int height;
	private int area=width*height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r=(Rectangle) obj;
		boolean result;
		
		if (this.area==r.area) {
			result=true;
		} else {
			result=false;
		}
		return result;
	}

}
