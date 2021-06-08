package com.javaex.ex16;

public class Circle {

	
	private String fillColor;
	private String lineColor;
	private int radius;
	
	
	//생성자
	
	public Circle() {
		
	}
	
	
	public Circle(String fillColor, String lineColor, int radius) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	
	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public int getRadius() {
		return radius;
	}

	//***************셋터

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
	//메소드-일반
	//toString()	
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	//draw()
	public void draw() {
		System.out.println("원색:"+fillColor+","+"원색선:"+lineColor+","+"반지름:"+radius+","+"원을 그렸습니다.");
	}
}
