package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods(); // 생성자 호출 -->디폴트 생성자
		
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		
		camera.showInfo();
		
		Goods
		
		//생성자는 1번만 사용할 수 있다. ****말의 의미 꼭 체크해볼것
		//camera.Goods("그램", 1000000);
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
	}

}
