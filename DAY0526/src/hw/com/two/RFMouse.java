package hw.com.two;

public class RFMouse extends Mouse implements IRF {
	
	
	@Override
	public void wconnect() { //�������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� �����");
		// TODO Auto-generated method stub

	}

	@Override
	public void wdisconnect() {//�������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� ���� ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RFMouse m = new RFMouse();
		System.out.println("������� : "+IRF.RF_Type_BT);
		m.wconnect();
		m.move();
		m.scroll();
		m.wdisconnect();
	}

	@Override
	void move() { //�߻� Ŭ������ �޼ҵ带 �������ߴ�.
		System.out.println("���콺 ������");
		
	}

	@Override
	void scroll() {
		System.out.println("���콺 ��ũ�� ����");
	}

}
