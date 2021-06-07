package com.javaex.ex13;

public class Student extends Person { // extends (클래스) 상속

	
	
	//필드
	
	
	private String schoolName;
	
	
	//생성자
	
	
	public Student() {
		
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
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("학교:"+ schoolName);
		System.out.println("======================");
	}
	
}
