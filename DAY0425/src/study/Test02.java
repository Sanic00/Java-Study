package study;

/*
 *�빮�ڸ� �ҹ���, �ҹ��� => �빮��
 * 
 */
import java.io.*;

//import javax.swing.Spring;
public class Test02 {

	public static void main(String[] args)throws IOException {

		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		char ch ;
		int n ;

		System.out.print("�����Է� : ");
		n = System.in.read();
		
				/*�ϴ��� ������ Ǭ�� (���� �߻�)
		 * char aa=' '; char ch=' '; System.out.println("�����Է� : "); aa =
		 * sc.next().charAt(0);
		 * 
		 * if ((aa >= 'A' && aa <= 'Z') ||(aa >= 'a' && aa<= 'z')) { ch=(char)(aa+32) ;
		 * System.out.println(ch) ;
		 * 
		 * ch = (char)(aa-32) ; System.out.println(ch) ; }
		 */
		 
		// �빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ
		// �ҹ��ڸ� �Է� �޾��� ��� �빮�ڷ� ��ȯ
		//1. �Է°��� �빮�� ��� 
		
		if (n>=65 && n<=90) {
			n+= 32 ; // n���� 32��ŭ ������Ŵ.
			ch = (char)n;
			System.out.println(ch);
		}
		else if (n>=97 && n<=122) { // �Է°��� �ҹ��ڶ��
			n-= 32 ; // n���� 32��ŭ ���ҽ�Ŵ.
			ch = (char)n;
			System.out.println(ch);
		}else { // �Է°��� ���ĺ��� �ƴ϶�� �Է¿��� ���
			System.out.println("�Է� ����");
		}
		
		
	}}

	
