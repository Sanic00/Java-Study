package com.instrument;

public class UseInstrument extends Instrument {

	public static void main(String[] args) {
		
		UseInstrument play = new UseInstrument() ;
		System.out.println(play.play());
		System.out.println(play.volumeUp());
		System.out.println(play.volumeDown());
		
	}

	@Override
	void play() {
	// TODO Auto-generated method stub
		return piano ;
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		
	}

}
