package com.javaex.ex15; //부모

public class point {
	//필드
	protected int x;
	protected int y;
	
	
	

	
	public point() {
		super();
	}


	//생성자
	public point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	
	//메소드 g/t
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	
	//메소드 일반
	
	public void showInfo() {
		System.out.println(this.x+","+this.y);
	}
}
