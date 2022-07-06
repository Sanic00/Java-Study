package com.constex;
/*
 * this : 객체 자신을 가리키는 레퍼런스임(참조)
 * 	
 * 		this는 컴파일러에 의해 자동으로 관리므로 개발자는 this를 사용하기만 하면 됨.
 * 
 * 
 */

class CircleEx001 {

	int radius ; // 클래스 변수(전역변수)
	// this라고 쓸 수 있는건 일반 객체 메소드는 사용할 수 없고 ,오직 생성자에서만 사용가능하다.
	// 생성자에서 다른 생성자를 호출 할 때, this();문은 반드시 첫번째 줄에 놓아야한다. 
	// 호출되는 this 구별 법은 생성자의 매개변수를 보면된다
	
	public CircleEx001() {
		this(10); //매개변수를 가지고 있는 생성자 함수. 생성자에서 다른 생성자를 호출할 때 this용어를 씀.
	}

	public CircleEx001(int radius) {
		this(10,10); // 
		radius = radius ; //클래스변수 = 지역변수 / 자신 클래스.자신이 갖고 있는 객체
	}
	
	public CircleEx001(int radius, int a) {
		this(10,10,10);
		radius = radius ; 
	}

	public CircleEx001(int radius, int a, int b) {
		radius = radius ;
	}

	
	public int getRadius() {
		return radius; // Q.왜 this를 생략하나요 ? A. 매개변수의 이름을 보면됨.
		//this사용하는 이유  : 변수를 구분하기 위해서!
//		클래스의 멤버변수 , 생성자가 가지고 있는 변수 
		//변수 2가지 : 전역변수(클래스 내) / 지역변수(메소드 내)
		//private쓰는이유 : 보완성 /클래서 전역변수는 값이 0으로 초기화되기때문에 getter/setter이용가능?
	}


public class ThisEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
