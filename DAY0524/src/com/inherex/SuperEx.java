package com.inherex;

class Super{ // 부모클래스 / 첫글자 무조건 대문자로 ! 
	int a = 5;  // 부모클래스 멤버 변수
	
	public Super(int x) {
		System.out.println("부모클래스 생성자 : "+x);
	}

}

class Sub extends Super {
	
	int a = 10 ; //자식과 부모의 변수가 똑같다

	public Sub() {
		super(5);
		System.out.println("자식 클래스의 생성자");
	}
	
	public void test() {
	//부모 변수와 자식 변수가 똑같을 때, 구별하는 방법. (this / super)
	System.out.println(this.a); // this / 자식 변수 값 출력 
	System.out.println(super.a); // super / 부모 변수 값 출력
	
	}

}


public class SuperEx {

	public static void main(String[] args) {

		Sub s = new Sub();
		s.test();
	}

}
