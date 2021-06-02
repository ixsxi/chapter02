package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera =new Goods();
		Goods computer =new Goods();
		Goods cup = new Goods();
		
		camera.setname("니콘");
		
		//camera.name ="니콘";
		//camera.price = 400000;
		camera.setPrice(400000);
		
		computer.setname("그램"); 
		computer.setPrice(1000000); 
		
		cup.setname("머그컵");
		cup.setPrice(2000);

		
		//System.out.println("상품명"+camera.name+","+"가격"+camera.price);
		
		//System.out.println("상품명"+camera.getname()+","+"가격"+camera.getprice());
		camera.showInfo();
		
		//System.out.println("상품명"+computer.name+","+"가격"+computer.price);
		//System.out.println("상품명"+computer.name+","+"가격"+computer.price);
		computer.showInfo();
		
		//System.out.println("상품명"+cup.name+","+"가격"+cup.price);
		//System.out.println("상품명"+cup.getname()+","+"가격"+cup.getprice());
		
		cup.showInfo();
	}

}
