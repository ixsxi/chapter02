package com.javaex.ex05;

public class Goods {

	//필드
	String name;
	int price;
	
	
	
	public Goods() { //디폴트 생성자 --> 다른생성자를 만들면 없어진다.
		//생성자 (메모리 찾아서 힙영역에 올리는것) 생성자는 무조건 이작업을 함
	}
	
	
	public Goods(String name, int price) { // 파라미터 두개 받음
		this.name = name;
		this.price = price;
	}
	
	//메소드 = 게터 세터
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	//메소드- 일반
	
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("상품가격:" + price);
		System.out.println("====================");
	}


	
}
