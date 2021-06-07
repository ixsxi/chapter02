package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Student s01 = new Student();
			
			s01.setName("정우성");
			s01.setAge(50);
			s01.setSchoolName("서울고");
			
		
			
			/*
			System.out.println(s01.getName());
			System.out.println(s01.getAge());
			System.out.println(s01.getSchoolName());
			
			
			System.out.println(s01.toString());
			*/
			
			
			s01.showInfo();
			
			Person p01 = new Person();
			p01.setName("이효리");
			p01.setAge(45);
			
			
			p01.showInfo();
	}

}
