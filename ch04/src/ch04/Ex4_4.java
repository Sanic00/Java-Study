package ch04;
import java.util.*;
public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' '; // �������� �ʱ�ȭ �Ѵ�.
		
		System.out.println("������ �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90)
		{
			grade = 'A';
		}
			else if (score >= 80)
		{
			grade = 'B';
		}
			else if (score >= 70)
			{
				grade = 'C';
			}
			else 
			{
				grade = 'D';
			}
		System.out.println("����� ������"+grade+"�Դϴ�.");
	
	
	}
	
	

}
