package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {
	
		Tv tv = new Tv( 7, 20, false);

		tv.status();    // 도장에있는 status 행동을 보여줘라
		
		tv.power(true);
		tv.status();
	}

}
