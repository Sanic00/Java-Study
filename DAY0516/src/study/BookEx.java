package study;

public class BookEx {

	public static void main(String[] args) {

	Book mybook = new Book();
	mybook.name = "����";
	mybook.writer = "����"; 
	mybook.price = 6000 ;
	mybook.isbn="10000-11111-1111";
	mybook.nowPage = 1;
	
	Book mybook2 = new Book("����","����",6000,1,"10000-11111-1111");
	
	
	}

}