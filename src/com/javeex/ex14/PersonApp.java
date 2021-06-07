package com.javeex.ex14;



public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		//디폴드 생성자 사용
		Student s01 = new Student();
		
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울고");
		*/
		
		
		
		/////Student 생성자 3 개
		//생성자 순서 (부모까지 포함)
		/*
		Student s02 = new Student("이효리",45,"제주고등학교");
		s02.showInfo();
		*/
		
		
		//부모의 디폴트 생성자 사용 --> 확인
		//Student s03 = new Student();
		
		Student s04 = new Student("이효리", 45, "제주고등학교");
		
		
		Person p =new Person();
		p.name="바보"; // protected 로 선언할경우 같은 패키지는 들어갈수있음
	}

}
