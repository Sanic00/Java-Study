package study;

public class Tv {

	//클래스의 구성요소(속성 + 메소드)
	//속성(멤버 변수, 필드) 

	String color;
	boolean power ;
	int channel ;

	// Tv의 기능(메소드)
	public void power() { // 원칙적으로는 public을 붙여주는데, 보통 생략도 자주함.
		power =!power; //처리 / =!은 not의 의미(반대의 의미. on/off)
		//return ; 
		//결과를 리턴함 / 같은 자료형에 의해서 불러준 값에 반환형
	}
	
	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}
	
}	
	

