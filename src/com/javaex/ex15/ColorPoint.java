package com.javaex.ex15; //자식

public class ColorPoint extends point {
		
		//필드

	private String color;

	//생성자
	
	public ColorPoint() {
		
	}
	public ColorPoint( String color) {
		this.color =color;
		
	}
	public ColorPoint( int x, int y, String color) {
		super(x,y);
		//super.setX(x);
		//super.setY(y);
		this.color = color;
	}
	
	
	//메소드 g/t
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//일반 메소드 
	
	public void showInfo() {
		System.out.println(this.x+","+this.y+color);
	}
	
	 
}
