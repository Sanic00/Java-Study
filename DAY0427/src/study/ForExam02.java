package study;

/*���� �ΰ��� �Է¹޾� �� �� ������ ������ �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
import java.io.*;
import java.util.Scanner;

class ForExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,i,sum =0;	
		System.out.println("ù��° ������ ? : ");
		a = sc.nextInt();
		System.out.println("�ι�° ������ ? : ");
		b = sc.nextInt();
		
		if (a>b) {
			/*int temp ;
		
			temp = a ;
			a = b ;
			b = temp ;*/ / ���� ���� ���
		
			a=a^b;
			b=b^a;
			a=b^a;
		}
		
		for	(i=a;i<=b;i++) {
			sum += i ;
			}
			System.out.println("�� �� ������ ���� ? :"+sum);
			
			}		
	}