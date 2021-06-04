package com.javaex.ex09;

public class Goods {
			//필드
	private String name;
	private int price;
	private static int count;
	
	//생성자
	
	public Goods() {
		count =count +1;
	}
	
	
	public Goods(String name, int price) {

		this.name = name;
		this.price = price;
		count =count +1;
	}


	

	//메소드 gs
	
	
	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	//메소드 일반
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println("카운터"+count);
	}
	
}
