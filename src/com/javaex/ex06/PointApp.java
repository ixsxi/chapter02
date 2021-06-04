package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		Point p01 =new Point();
		

		p01.setX(5);
		p01.setY(5);
		p01.drwaw();
	
		
		
		
		Point p02 =new Point(6,6);
		p02.drwaw();
		
		
		
		Point p05 =new Point (50,50);
		p05.drwaw(false);
		p05.drwaw(1);
	}

}
