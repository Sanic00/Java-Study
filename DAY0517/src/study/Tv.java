package study;

public class Tv {

	//Ŭ������ �������(�Ӽ� + �޼ҵ�)
	//�Ӽ�(��� ����, �ʵ�) 

	String color;
	boolean power ;
	int channel ;

	// Tv�� ���(�޼ҵ�)
	public void power() { // ��Ģ�����δ� public�� �ٿ��ִµ�, ���� ������ ������.
		power =!power; //ó�� / =!�� not�� �ǹ�(�ݴ��� �ǹ�. on/off)
		//return ; 
		//����� ������ / ���� �ڷ����� ���ؼ� �ҷ��� ���� ��ȯ��
	}
	
	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}
	
}	
	

