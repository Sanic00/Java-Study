package ch06;

public class TvTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7; // Tv��ü�� ������� channel �� 7�� �����Ų��.
		t.channelDown(); // ä�� �ٿ� �޼��� ȣ�� �Ѱ�
		System.out.println("������ ä����" + t.channel + "�Դϴ�.");

	}

}
