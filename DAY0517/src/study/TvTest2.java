package study;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); 
		Tv t2 = new Tv(); 
		
		
		System.out.println("t1�� ���� ä�� ����"+t1.channel+"�� �̴�.");
		System.out.println("t1�� ���� ä�� ����"+t2.channel+"�� �̴�.");		
		
		t2 = t1 ; //
		//t1�� �����ϰ� �ִ� �ּҰ��� t2�� �����Ѵ�.(ȿ������ �ڵ�) ? / t1�� ��������
		
		t1.channel = 7 ;
		System.out.println("t1�� ���� ä�� ���� 7������ ���� �Ǿ���");
		System.out.println("t2�� ���� ä�� ����"+t2.channel+"�� �̴�.");
			
	}

}
