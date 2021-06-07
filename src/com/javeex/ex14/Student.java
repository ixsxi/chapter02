package com.javeex.ex14;

public class Student extends Person { // extends (클래스) 상속

	
	
	//필드
	
	
	private String schoolName;
	
	
	//생성자
	
	public Student() {
		super();
		System.out.println ("Student()");
	}
	//부모의 person(2) 생성자 사용
	/*
	public Student(String name, int age, String schoolName) {
		super(name ,age);
		this.schoolName = schoolName;
		System.out.println("에에");
	}
	*/
	
	
	//부모의 person() 생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
		
		System.out.println("student(3)");
		
	}


	//메소드
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	
	
	//메소드 일반
	
	@Override
	public String toString() {   // 상속이 되면 private 는 못씀 get 으로 접근  get은 public 이니 까 접근 가능
		return "Student [schoolName=" + schoolName +"age="+getAge()+ "]";
	}
	
	public void showInfo() {
		System.out.println("======================");
		System.out.println("이름:" + name);
		System.out.println("나이:" + super.age);
		System.out.println("학교:"+ schoolName);
		System.out.println("======================");
	}
	
}
