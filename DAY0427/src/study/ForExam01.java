package study;

/*1���� ���� 10������ �հ踦 ���Ѵ�.
 * 
 * 1+2+3+4+5+6+7+8+9+10
 */

public class ForExam01 {

	public static void main(String[] args) {
		// 1 ~ 10���� �ݺ�ó���ϴ� ����
		int i = 0 ;
		//�ݺ�ó���ϸ鼭 �����հ踦 �����ϴ� ����
		int sum = 0; // �����հ�� �ݵ�� �ʱ�ȭ�� �������.
		System.out.println("for���� ���");
		for(i=1;i<=10;i++) 
		{
		sum = sum + i ;
		System.out.println(i+","+sum);}
		System.out.println();
		
		
		
		System.out.println("while���� ���");
		i=1; 
		sum = 0 ;
		while(i<=10) {
			sum = sum+i;
			System.out.println(i+","+sum);			
			i++;
		}
		
		
		
		System.out.println();
		System.out.println("do~while���� ���");
		i=1; 
		sum = 0 ;
		do {
			sum = sum+i;
			System.out.println(i+","+sum);			
			i++;
		}while(i<=10) ;
		
	}
}