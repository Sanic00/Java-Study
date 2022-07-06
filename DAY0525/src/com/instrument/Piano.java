package com.instrument;

public class Piano extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("피아노를 연주한다.");
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("피아노 소리를 높인다.");
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("피아노 소리를 낮춘다.");
	}

}
