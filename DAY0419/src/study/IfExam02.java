package study;

/*������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ�
 * �� 4�г��� ��� 70�� �̻��̾�� �հ�
 */
import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		int score, grade ;
		
		System.out.println("������?");
		score = sc.nextInt() ;
		
		System.out.println("�г���?");
		grade = sc.nextInt() ;
				
		if (score >= 60) {
			if (grade != 4)
				System.out.println("�հ�");
			else if (grade == 4 && score >=70) 
				System.out.println("�հ�");
			else  System.out.println("���հ�");
	}
		else System.out.println("���հ�");
	}
}