package study;

public class Book { //Ŭ���� �ش�(Ŭ���� ��)

//����ʵ�(����, ���), �Ӽ�
	String name ;
	String writer ;
	int price ;
	int nowPage ;
	String isbn ;
	
	//������
	public Book() {}
	
	Public Book(String name, String writer, int price, int nowPage, String isbn){
		this.name = name ;
		this.writer = writer ;
		this.price = price ;
		this.nowPage= nowPage ;
		this.isbn = isbn ;
		
	}
	
	//�޼ҵ�(����,����)
	public void NextPage() {nowPage++;}
	public void PreviousPage() {nowPage--;}
	}


