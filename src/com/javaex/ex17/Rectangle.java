package com.javaex.ex17;

public class Rectangle extends Shape {
			//필드
	
	
		private int width;
		private int height;
		
		//생성자
		
		public  Rectangle() {
			
		}

		public Rectangle(String fillColor, String lineColor,int width, int height) {
			super(fillColor,lineColor);
			this.width = width;
			this.height = height;
			System.out.println("Rectangle(4)");
		}

		
		
		
		//메소드 g/s
		
		public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public void setHeight(int height) {
			this.height = height;
		}

	
	
		
		
		//메소드 일반 
		
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
					+ lineColor + "]";
		}
		
		public void draw() {
			System.out.println("면색:"+fillColor+"선색:"+lineColor+"가로:"+width+"세로:"+height+"도형을 그렸습니다.");
		}
	
}
