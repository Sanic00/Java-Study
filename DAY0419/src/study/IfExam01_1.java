package study;

/*
 * ������ ������ �Է� �޾� �Է¹��� ���� ¦������ �����Ͻÿ�. (if��)
 * 
 */
import java.util.Scanner;

public class IfExam01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a=0 ;
		
		System.out.print("ù��° ���� �Է�:");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("¦��"); 
			System.out.println("¦�� ����");
		}
		// {}�� ������ ���� ������ ������ ! 
			
		else System.out.println("Ȧ��");
		
		
		
		
		
	}

}
