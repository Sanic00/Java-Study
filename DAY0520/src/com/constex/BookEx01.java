package com.constex;

public class BookEx01 {

	public static void main(String[] args) {
	
		Book b = new Book("어린왕자", "생텍쥐폐리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(b.title+"의 작자는"+b.author);
		System.out.println(loveStory.title+"의 작자는"+loveStory.author);
						

	}

}
