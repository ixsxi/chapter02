package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모클래스  테스트
		Shape s01 = new Shape ("빨강","검정");
		System.out.println(s01.toString());
		s01.draw();
		
		
		//사각형 테스트
		//Rectangle r01 =new Rectangle("빨강","검정",3,3);
		//System.out.println(r01.toString());
		//r01.draw();
	
		//배열 , 사각형
		
		Rectangle[] rArray =new Rectangle[3];
		
		Rectangle r01 =new Rectangle("빨강","검정",3,3);
		Rectangle r02 =new Rectangle("주황","검정",4,4);
		Rectangle r03 =new Rectangle("초록","검정",5,5);
		
		
		// 배열 <-- 사각형
		rArray[0] =r01;
		rArray[1] =r02;
		rArray[2] =r03;
		
		
		//배열을 통해서 그리기
		for(int i =0; i<rArray.length; i ++) {
			rArray[i].draw();
		}
		
		
		
		
		
		//원 테스트
		/*
		Circle c01 = new Circle("노랑","흰색",3.14);
		System.out.println(c01.toString());
		c01.draw();
		*/
		
		
		// 원 테스트 배열  (전부다 출력)
		Circle[] cArray =new Circle[3];  // 배열 선언 
		
		Circle c01 = new Circle ("녹색","흰색",99.9); 
		Circle c02 = new Circle ("빨강","파란색",80);
		Circle c03 = new Circle ("아이보리","인디언 핑크",71);
		
		cArray[0] =c01;
		cArray[1] =c02;
		cArray[2] =c03;
		
		
		//System.out.println(c01); 궁금해서 해봄 Circle 클래스 toString 출력됨
		
		for(int i =0; i<cArray.length; i ++ ) {
			cArray[i].draw();
		}
		
		
		
		//삼각형 테스트
		/*
		Triangle t01 = new Triangle("자홍색","보라색",35,45);
		System.out.println(t01.toString());
		t01.draw();
		*/
		
		
		//삼각형 배열            // 생성자 호출 파라미터 같은걸 찾아라 
		Triangle t1 =new Triangle("주황","노랑",18,50);
		Triangle t2 =new Triangle("황토","회색",20,30);
		Triangle t3 =new Triangle("하늘색","베이지",80,53);

		
		//********************************************************************//
		//Shape[] tArray =new Shape[3]; 부모로 연결 가능 ??
		Triangle[] tArray =new Triangle[3];
		
		tArray[0] = t1;
		tArray[1] = t2;
		tArray[2] = t3;
		
		for(int i =0; i<tArray.length; i ++) {
			tArray[i].draw();
		}
		
		//*********************************************************************//
		
		
		
	}

}
