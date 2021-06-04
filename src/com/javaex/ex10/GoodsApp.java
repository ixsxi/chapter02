package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
	
		
	Goods [] goodsArray = new Goods[3]; // 3칸방으로 잡음
	System.out.println(goodsArray.length);
	
	
	
		Goods computer = new Goods("그램" , 100000);
		Goods camera = new Goods("니콘", 400000);
		
		/*
		computer.showInfo();
		camera.showInfo();
		*/
		
		//방에 주소넣는것
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		
		System.out.println(goodsArray[0].getName());
		
		int count =0;
		
		for(int i = 0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) {//배열에 주소가 없지 않으면
				
				count = count + 1;
				
				goodsArray[1].showInfo();
			}
			
		}
		System.out.println(count);
	}

}
