package com.javaex.ex03;

public class point {

	
		private int x;
		private int y;
		
		
		public void setX(int px) {
			x = px ;
		}
	
		
		public void setY(int py) {
			y=py;
			
			
		}
		
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void drwaw(){
			//그리는 복잡한 기능을 구현해야된다고 가정 .. 
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}
}
