package com.javaex.ex15_1;

public class Person {
 protected String name;
 protected	int age;
	
	
	
	
	//생성자
	
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	
	public Person() { // 디폴트 값 
		
	}

	
	//메소드 g/s
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//메소드 일반
	
	public void showInfo() {
		System.out.println(name + age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
