package com.javaex.ex02;

public class Goods {

	
	//필드 
	String name;
	
	int price;
	
	
	//생성자
	
	
	
	//메소드(겟터, 세터 ) 일반
	public void setname(String name){
		
		this.name =name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getname(){
		return name;
	}
	
	public int getprice() {
		return price;
	}
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("상품가격:" + price);
		System.out.println("====================");
	}
	
}
