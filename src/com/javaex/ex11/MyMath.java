package com.javaex.ex11;

public class MyMath {

	
	
	//필드
	
	
	
	
	
	//생성자
	
	
	
	
	
	
	//메소드 gs
	
	
	
	
	
	//메소드 일반// 모소드 오버로딩
	
	public static int plus(int a, int b){
		
		int result = a + b; //복잡한 식
		return result;
	}
	
	public static double plus(double a, double b) {
		double result =a + b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result =a + b;
		return result;
	}
	
	public static double plus(int a, double b) {
		double result =a + b;
		return result;
	}
}
