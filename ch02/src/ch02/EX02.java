package ch02;

public class EX02 {

	public static void main(String[] args) {
		
		float pi = 3.14f;
		double rate = 1.618;
		float a = 10f;
		double b =10.;
		double c =.10;
//		float d = 3.14; // ����. float Ÿ�Ժ��� double Ÿ���� �� ũ��
//		int e = 0x123456789; //���� intŸ���� ������ �Ѵ� ���̿��� ����
		
		byte f = 65; //ok byte -128~127������ �������� 65�� ���;
		short g = 0x1234; 	// ok, short Ÿ�Կ� ���� ������ ������ int Ÿ���� ���ͷ�.
		
		char h = 'h'; // char h = "Java"; �̰Ǿȴ�
		String temp = "java"; //ok ��Ʈ�� Ÿ���� temp��� ������ "Java"�� ����
		String str = ""; //ok ������ ���� �� ���ڿ�
//		char ch =''; //���� ' '�ȿ� �ݵ�� �ϳ��� ���ڴ� �ʿ��ϴ�
		char chh = ' '; // ok ���� '' �ȿ� ������ �־ ok
		String name = "Ja"+"va"; // ok ������ + �� ����ؼ� ���ڿ��� �ٿ��ش�. name �� "Java"��
		String str1 = name + 8.0; // str1�� "Java"+8.0 = "Java8.0"���� ��
		
		// ���ڿ� + any type ->���ڿ� + ���ڿ� -> ���ڿ�
		/* anytype + ���ڿ� -> ���ڿ� + ���ڿ� -> ���ڿ�
		 * ��� �����ڴ� ���ʿ��� ���������� ������� ���� ���׿����ڸ� �� -> �� �������� �˴� �� ->�� �̵�
		 * 
		 * 
		 */
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
