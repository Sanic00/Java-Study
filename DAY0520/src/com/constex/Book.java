package com.constex;

public class Book {

	String title ; 
	String author ;
	
	//생성자가 없는 클래스는 존재 하지 않는다 ! 1개도 없다면 컴파일러가 만든다  
	
	//기본생성자(매개변수가 없는 생성자) 
	public Book() {
	}
	
	//생성자를 만들어서 필드 초기화
	public Book(String t) {
		
		title = t; //매개변수로만 객체 생성
		author = "작자미상";
	}

	public Book(String t, String a ) {
		
		title = t; //매개변수로만 객체 생성
		author = a;		
	}

	
}
