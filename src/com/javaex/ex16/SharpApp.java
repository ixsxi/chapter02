package com.javaex.ex16;

public class SharpApp {

	public static void main(String[] args) {
		//배열로 표기
		
		Rectangle[] rArray = new Rectangle[3];
		
		
		
		
		
		Rectangle r01 =new Rectangle("빨강","검정",5,5);
		//System.out.println(r01.toString());
		Rectangle r02 =new Rectangle("노랑","검정",6,6);
		Rectangle r03 =new Rectangle("초록","검정",7,7);
		
		
		rArray[0] = r01;  //rArray에의 0번방에 r01를 넣어라
		rArray[1] = r02;
		rArray[2] = r03;
		
			//배열을 이용하여 글기ㅣ
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//배열을 이용한 면색 변경
		for(int i=0; i<rArray.length; i++) {
			rArray[i].setFillColor("파랑");
			rArray[i].draw();
		}
		
		
		Circle[] cArray =new Circle[3];
		
		
		
		
			//원 그리기
		Circle c01 = new Circle("초록","검정",13);
		Circle c02 = new Circle("빨강","검정",18);
		Circle c03 = new Circle("노랑","검정",135);
		
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		
		//배열을 이용한 원 그리기
		
		for(int i =0; i<cArray.length; i ++) {
			cArray[i].draw();
		}
		
		
		
		
		/*
		c01.draw();
		c02.draw();
		c03.draw();
		*/
		
		
		
		
		
		
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
	}

}
