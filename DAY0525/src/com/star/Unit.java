package com.star;

public abstract class Unit { //추상 클래스 : 공통적인 기능만 모아서 만듦.
	
	int x, y ; // x :가로축 / y : 세로축
	
	abstract void move(int x , int y) ; // 추상
	abstract void stop() ; 
	abstract void message();


}
