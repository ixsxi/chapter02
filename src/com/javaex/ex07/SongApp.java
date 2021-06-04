package com.javaex.ex07;



public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song iu= new Song();
		Song bigbang = new Song();
		Song busker = new Song();
		//**************아이유 ***********8
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack("3번");
		
	
		Song iu1 = new Song("좋은날","아이유","real");
		iu1.showInfo();
		
		//************빅뱅****************
		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setComposer("G-DRAGON");
		bigbang.setYear(2007);
		bigbang.setTrack("2번");
		
		//*************버스커*************8
		busker.setTitle("벚꽃엔딩");
		busker.setArtist("버스커버스커");
		busker.setAlbum("버스커버스커1집");
		busker.setComposer("장범준");
		busker.setYear(2012);
		busker.setTrack("4번");
		
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();
	}

}