package study;

public class TvTest {
//extends Tv(Tv클래스를 상속한다.)
	
	
	
	public static void main(String[] args) {
		Tv t; // TV인스턴스를 참조하기 위한 변수 t를 선언했다.// 클래스는 생성자 , 배열은 배열길이 
		t = new Tv(); // 인스턴스를 생성했다.(인스턴스 = 객체)
		//class변수는 0으로 초기화되어있다.
		t.channel = 24 ; // Tv객체의 멤버변수 채널 값을 24로 지정했다. YTN
		t.channelDown(); // 23 : 연합뉴스
		//t.color = "노랑"; // 
		//t.power = true ;
		System.out.println("현재 채널은"+t.channel+"입니다.");
	
		
	}
/*@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		super.channelDown(); // super은 extend(상속/확장)을 했다고 의미(Tv:부모 class 상속받음)
	}*/
	
}
