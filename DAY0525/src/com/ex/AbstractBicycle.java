package com.ex;

public abstract class AbstractBicycle {

	//멤버변수
	int id ;
	String brand ; 
	
	//추상 메소드 선언(반드시 하나는 선언되어야함)
	abstract void prtInfo();
	
	//일반 메소드 구현
	public String getBrand() {
		return brand ;
	}
}
//사용하는 목적 : 논리적인 문제를 해결하기 위해서?
