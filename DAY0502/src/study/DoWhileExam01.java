package study;

/* ��]
 * 
 * ����, ����, ���������� �Է¹޾� ������ ��� �׸��� ������ ���ϴ� ���α׷��� �ۼ�
 *	���� : 100~ 90: A , ~ 60�� ���ϴ� F�� ó��
 *	����� �Ҽ��� ���� 2�ڸ����� ǥ��,
 *	��, �� ������ ������ 0 ~ 100�� ����� ����.
 * 
 * 
 */
import java.util.Scanner;
public class DoWhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int kor=0 , eng=0 , math=0, tot = 0 ;
		char hak = 0;
		float avg = 0.0f;
		
		do {	
			System.out.println("���������� ? :");
			kor = sc.nextInt();
		} while(kor<0 || kor> 100);
		
		do {
			System.out.println("���������� ? :");
			eng = sc.nextInt();
		} while(eng<0 || eng> 100);
		
		do {
			System.out.println("���������� ? :");
			math = sc.nextInt();
		} while(math<0 || math> 100);
		
		tot = kor + eng + math;
		avg = tot/3.0f ;
		
		switch((int)(avg/10)){
			
			case 10 : 
			case 9 : 
			hak = 'A';
			case 8 :
				hak = 'B';
			case 7 :
				hak = 'C';
			case 6 :
				hak = 'D';
				break;
				default :
				hak = 'F';
		}
		
		System.out.println();
		System.out.println("������? :"+tot);
		System.out.printf("��� : %.2f\n",avg);
		System.out.println("������ ���Ͻÿ�"+hak);		
		
	}
			
	}
