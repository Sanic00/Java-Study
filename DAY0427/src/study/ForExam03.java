package study;
/* �� ���� ������ ��� n���� �Է¹޾� �� �� ������ n���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� �ΰ��� ����� �Է¹���
 */
import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a, b, n, i,sum = 0 ;
		
		System.out.println("ù��° ������?");
		a = sc.nextInt() ;
		System.out.println("�ι�° ������?");
		b = sc.nextInt() ;
		System.out.println("n�� �����");
		n = sc.nextInt();
		
		if(a>b) {
		a=a^b;
		b=b^a;
		a=b^a;
	}
	
		for(i=a ; i<=b ; i++) 
		{
			if(i%n==0) {
				sum +=i;
			}
		
		}
		System.out.println();
		System.out.println(a+"����"+b+"������ ����� �հ��? :"+sum+"�Դϴ�.");
}
}