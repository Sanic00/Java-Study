package study;

public class TvTest {
//extends Tv(TvŬ������ ����Ѵ�.)
	
	
	
	public static void main(String[] args) {
		Tv t; // TV�ν��Ͻ��� �����ϱ� ���� ���� t�� �����ߴ�.// Ŭ������ ������ , �迭�� �迭���� 
		t = new Tv(); // �ν��Ͻ��� �����ߴ�.(�ν��Ͻ� = ��ü)
		//class������ 0���� �ʱ�ȭ�Ǿ��ִ�.
		t.channel = 24 ; // Tv��ü�� ������� ä�� ���� 24�� �����ߴ�. YTN
		t.channelDown(); // 23 : ���մ���
		//t.color = "���"; // 
		//t.power = true ;
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");
	
		
	}
/*@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		super.channelDown(); // super�� extend(���/Ȯ��)�� �ߴٰ� �ǹ�(Tv:�θ� class ��ӹ���)
	}*/
	
}
