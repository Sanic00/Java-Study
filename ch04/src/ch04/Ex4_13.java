package ch04;

public class Ex4_13 {

	public static void main(String[] args) {
		int sum = 0; //�հ踦 �����ϱ� ���� ������ ���� �ϴ°� �ƴϰ� �ʱ�ȭ�� �ؾߵȴ�.
		
		for(int i =1; i <= 10; i=i+2)
		{
			sum = sum + i;
			System.out.printf("1���� %2d ������ ��:%2d%n",i , sum);
			
		}
	}
	

}
