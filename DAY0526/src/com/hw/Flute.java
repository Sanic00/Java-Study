package com.hw;

public class Flute extends Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flute f = new Flute();
		f.play();
		f.volumeUp();
		f.volumeDown();
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute : play()ȣ���");

	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Flute : volumeUp()ȣ���");

	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Flute : volumeUp()ȣ���");

	}

}
