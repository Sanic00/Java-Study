package hw.com.two;

public class RFMouse extends Mouse implements IRF {
	
	
	@Override
	public void wconnect() { //인터페이스의 메소드 재정의
		System.out.println("마우스 무선 연결됨");
		// TODO Auto-generated method stub

	}

	@Override
	public void wdisconnect() {//인터페이스의 메소드 재정의
		System.out.println("마우스 무선 연결 끊김");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RFMouse m = new RFMouse();
		System.out.println("무선방식 : "+IRF.RF_Type_BT);
		m.wconnect();
		m.move();
		m.scroll();
		m.wdisconnect();
	}

	@Override
	void move() { //추상 클래스의 메소드를 재정의했다.
		System.out.println("마우스 움직임");
		
	}

	@Override
	void scroll() {
		System.out.println("마우스 스크롤 동작");
	}

}
