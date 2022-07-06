package com.utilex;

public class StringBufferEx02 {
	/*
	 * String Buffer 클래스
	 * 
	 * (버퍼란 : 임시 저장 공간. 임시 공간을 활용해 변경, 수정이 가능해진다.)
	 * 데이터 변동이 자주 일어나는 경우에 사용
	 * 이 클래스의 객체는 크기가 동적인데, 객체 생성시기를 지정하지 않아 기본적으로 16개의 문자를 저장할 수 있는 버퍼 공간을 가진다.
	 * String 클래스의 객체는 한 번 생성되면 그 내용이 변하지 않지만
	 * StringBuffer 클래스의 객체는 문자열의 내용을 변경할 수 있다.
	 * 메서드 리턴 타입은 void.
	 */	
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
	
		System.out.println(sb.capacity());//16+10
		System.out.println(sb.length());//10
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//10+17
		sb.delete(1, 20);
		//안에 있는 데이터를 줄일 수 있지만, 버퍼는 한번 늘어나면 줄어들지 않는다.
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//8
//토근 : ","로 분리된 문자열		
//st.next Token() : 다음 토근을 가져온다.
	
	}
}
