package study;

/*
 * ������ ������ �Է� �޾� �Է¹��� ���� ¦������ �����Ͻÿ�. (if��)
 * 
 */
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a,b  ;
		char op ; 
		String s ;
		
		  System.out.print("ù��° ���� �Է�:"); 
		  a = sc.nextInt();
		  
		  System.out.print("������ �Է� : "); 
		  op = sc.next().charAt(0); // scanner�� �⺻ ���ڿ��̱⶧���� sc.next()������ .charAt(0)�� �߰�������� ������ �ȶ�. //s = sc.next(); (string���� ���� ��)
		  
		  System.out.print("�ι�° ���� �Է�:"); b = sc.nextInt();
		 
		
		
		if(op == '+') {
		//if(s == "+") {
		//if(s.equals("+")) { string�϶� ,==�� .equals�� ǥ������.
			
		System.out.printf("%d %c %d = %d\n", a, op, b, (a+b));
		}else if(op == '-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a-b));
		}
		else if (op == '*'){
			System.out.printf("%d %c %d = %d\n", a, op, b, (a*b));		
		}
		else if( op == '/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a/b));
		}
		else if( op == '%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, (a%b));
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		//���� if��
		
	}

}
