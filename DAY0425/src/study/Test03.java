package study;
import java.util.*;
public class Test03 {
	/*
	 * ���� ) ��Ģ ������ �Է¹޾� �Ի��ϴ� ���α׷��� �ۼ��Ͻÿ�. �����ڴ� +,-,*,/ �װ����� ��� �Ǽ��� ó���� 
	 * �ǿ����ڿ� �����ڴ� ��ĭ���� �и��Ͽ� �Է�. 0���� ������ �� "0���� ���� �� �����ϴ�."�� ����ϰ� ������ switch ~case ���� �̿��Ͽ� �ۼ�
	 * �����ڴ� Scanner�� ����Ͽ� ���ڿ��� �Է¹����ÿ�.
	 */	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	double a, b, c = 0 ;
	char op ;
	
	System.out.print("������? : ");
	a = sc.nextInt();	
	op = sc.next().charAt(0);	
	b = sc.nextInt();
	
	
	switch (op) {
	case '+':
		c = a+b;
		break;

	case '-':
		c = a-b;
		break;
		
	case '*':
		c = a*b;
		break;
		
	case '/':
		if(b==0)
			System.out.println("0���� ���� �� �����ϴ�");
		else c=a/b;
		return;
		//break;
		
	default:
		System.out.println("��Ģ������ �ƴմϴ�");
		//break;
	}
	System.out.println(a+" "+op+" "+b+ "=" +c);
}
}