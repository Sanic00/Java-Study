package com.methodex;

/*메소드
 * 
 * 1. 메소드(멤버 함수) : 객체가 할 수 있는 동작들을 정의한 것임
 * 					메소드의 종류는 두가지로 구분 짓는다.
 * 					1. 인스턴스 메소드 2. static 메소드
 *					(객체를 생성해여 접근 가능)
 */
//하단은 사용자 정의 메소드

public class MethodEx01 {

	public int add(int i,int j){
		return i + j;	
	}
	
	public int sub(int i,int j){
		return i - j;	
	}
	
	public int multi(int i,int j){
		return i * j;	
	}
	
	public int div(int i,int j){
		return i / j;	
	}
	//return 계산한 값을 다시 돌려보내줌(호출과 관련)
	public static void main(String[] args) {

		MethodEx01 me = new MethodEx01();

		int i = 10 ;
		int j = 10 ;
	
		int a,b,c,d ;
		a = me.add(i, j);  // 덧셈하는 기능을 가진 메소드 호출		
		b = me.sub(i, j) ; // 빼기하는 기능을 가진 메소드 호출
		c= me.multi(i, j) ; // 곱셈하는 기능을 가진 메소드 호출
		d = me.div(i, j) ; // 나누기 기능을 가진 메소드 호출
		
		System.out.println("더하기 한 결과 :"+a);
		System.out.println("빼기 한 결과 :"+b);
		System.out.println("곱셈 한 결과 :"+c);
		System.out.println("나누기 한 결과 :"+d);
	
	
	}
	
}

