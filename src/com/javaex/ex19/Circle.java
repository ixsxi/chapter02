package com.javaex.ex19;

public class Circle extends Shape {
	private double rd; //반지름

		
	//생성자
	
	
	public Circle() {
		super();
	}
	
	public Circle(String fillColor,String lineColor,double rd) {
		super(fillColor,lineColor);
		this.rd = rd;
	}

	
	
	//메소드 g/s
	public double getRd() {
		return rd;
	}

	public void setRd(double rd) {
		this.rd = rd;
	}

	
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [rd=" + rd + "]";
	}
	
	public void draw() {
		System.out.println("면색:"+super.getFillColor()+"	"+"선색:"+lineColor+"	"+"반지름:"+rd+"	"+"원을 그렸습니다.");
	}
	
	public double area() {
		return  rd *rd * 3.14;
	}
	
}
