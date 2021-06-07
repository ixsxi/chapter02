package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person test = new Person("정우성",46);
		
		System.out.println(test.toString());
		
		test.showInfo();
		
		
		test.setAge(50);
		
		test.showInfo();
		
		
		System.out.println(test.toString());
		
		
		
		Student test2 = new Student("주형준",26,"청주공고");
		System.out.println(test2.toString());
		
	}
	
	
	Student test2 = new Student("주형준",26,"청주공고");
	
	
	
}
