package com.javeex.ex14;

public class Person {
	//필드
		protected String name;
		protected int age;
		
		
		
		//생성자
		public Person(String name, int age) {
			
			this.name = name;
			this.age = age;
			System.out.println("ddd");
		}



		public Person() {
			super();
		
		}


		
		
		//메소드 get /set
		
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
		
		//데이터 확인용 
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		//메소드 일반
		
		
		public void showInfo() { // 화면출력용 만들기 힘들다, 오래걸린다.
			System.out.println("이름:"+ name +"나이"+age);
		}



		
		
	
}
