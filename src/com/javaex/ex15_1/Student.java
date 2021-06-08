package com.javaex.ex15_1;

public class Student extends Person {
	private String schoolName;

	
	
	
	//생성자
	
	
	
	public Student() {  //디폴트 
		super();
	}
	
	public Student(String schoolName) {
	this.schoolName = schoolName;
	}
	
	public Student(String name, int age) {  //내꺼
		super(name, age);
	}
	
	
	

	public Student(String name, int age, String schoolName) { // 부모영향
		
		super(name,age); // 프로텍트면 일케 들갈수있음
		this.schoolName = schoolName;
	}


	


		//메소드 g/s
	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
	//메소드 일반
	/*
	public void showInfo() {
		System.out.println(super.getName()+super.getAge()+schoolName);
	}
	*/   // Person(부모가 필드값이 private 일시 student 생성자 --> setName --> 출력 getName

	
	public void showInfo() {
		System.out.println(name + age + schoolName);
	}
	
	
	
	public void showInfohi() {
		System.out.println(schoolName);
	}

	
	
	
}
