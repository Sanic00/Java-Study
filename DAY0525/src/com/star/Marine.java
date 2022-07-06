package com.star;

public class Marine extends Unit { //일반 클래스에서는 추상형 모두 구현해야한다.

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린의 위치 이동 좌표는 x: "+x+",y : "+y+"입니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 대기 상태에 있습니다.");
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Standing back..");
	}
	
	void stimPack() {
	System.out.println("마린이 스팀팩을 사용합니다.");
	}
	
}
