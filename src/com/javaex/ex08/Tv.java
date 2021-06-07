package com.javaex.ex08;

public class Tv {
			//필드
	
	private	int channel;
	private	int volume;
	private	boolean power;
		
	

	
	
			//생성자
		
	public Tv() {
		//디폴트 값 생성
	}

	public Tv(int channel, int volume, boolean power) {
		
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	

	
	
		//메소드 gs
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	

	
	
	// 메소드 -일반
	
	
	public void power(boolean on) { //메소드 구현 
		this.power = on;
	}
	
	public void channel(int channel) {   //메소드구현 1~255 유지
		this.channel = channel;
		if(this.channel>255 ) {
			this.channel = 0;
		}else if (this.channel<0){
			this.channel = 0;
		}
	}
	
	public void channel(boolean up) { 	//메소드 오버로딩 (1~255 유지, 1씩 증감)
		if(up==true) {
			this.channel++;
			if(this.channel > 255) {
				this.channel = 0;
			}
		}else {
			this.channel --;
			if(this.channel <0) {
				this.channel = 255;
			}
		}
	}
	
	public void volume(int volume) { 	//메소드 구현  ( 0 ~ 100 유지 )
		this.volume =volume;
		
	}
	
	public void volume(boolean up) { 	//메소드 오버로딩 (0 ~ 100 유지, 1씩 증감
		
	}
	
	
	
	public void status() {
		System.out.println("channel: "+channel+" volume : "+volume+power);
	}

	
	
	
	
}
