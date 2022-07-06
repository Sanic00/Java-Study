package com.constex;

class BookEx{
	String title ; 
	String author ; 
	
	public void show()
	{
		System.out.println(title +""+author);
	}	

	public BookEx() {
	this("","");
	System.out.println("생성자 호출함");
	
	}

	public BookEx(String title) {
	this(title,"작자미상");	
	}
	

	public BookEx(String title, String author) {
		this.title = title;
		this.author = author; 
	}


}
public class ThisEx03 {

	public static void main(String[] args) {

		BookEx be = new BookEx("홍길동전","허균");
		BookEx be2 = new BookEx("홍길동전");
		BookEx be3 = new BookEx();
		
		be.show();
		be2.show();
		be3.show();
		
		
		
	}

}
