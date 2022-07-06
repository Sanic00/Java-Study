package com.constex;

public class Circle { //클래스
	
	int radius ; //속성, 멤버변수, 필드
	String name ; //

	//생성자의 목적은 객체가 생성될 때, 필드를 초기화하기 위함이다.
	
	public Circle() { //생성자 메소드 : 생성자의 이름은 클래스의 이름과 같다.
		//필드 초기화
		radius = 1;
		name = "";//null로 감 => null : 공간은 있지만 비어있는 것
			
}

	public Circle(int r, String n) { //매개변수를 활용하여 필드를 초기화
		//매개변수를 가진 생성자 (객체를 만들때,하단과 같이 초기화해도 됨)
		//생성자 리턴타입은 없음.(void, return 넣으면 생성자가 아닌 일반 instance의 메소드가 되는것임)
		//생성자는 new라는 연산자를 통해 객체 생성할 때 , 딱 1번만 호출됨.
		
		radius = r;
		name = n ;
	}
		
		public double getArea() {
		return 3.14 * radius * radius ;
		}
		
		
		
		//return ; 넣어도 되지만 보통 생략 	
		//자료형이 있는 경우는 반환값 즉 return  이 있어야 합니다. 
		//특별한 값이 없을 경우에는 return 0;이나  return 을  작성해도 됩니다



}


