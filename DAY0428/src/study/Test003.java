package study;
/*
 * ����ڷκ��� ������ ������ �Է¹޾�
 * 1���� �Է¹��� �������� ��ü�� �հ�,¦���� �հ�,Ȧ���� ���� ���� ����ϴ� ���α׷��� �����ϰ�
 * 
 * 10������ �հ踦 ����Ͻÿ�.
 * 
 * 1~10
 * 1~20
 * 1~30
 * 
 */
import java.util.*;
public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int n,total,even,odd ;
		total=even=odd=0;
		n = sc.nextInt();

		for (int i=1;i<=n;i++) {
			if (i%2==0)  
			even += i ;
			else  odd += i ;
			total = total + i;
			
			if((i%10==0)||(i==n)){
		
			System.out.println("1����"+i+"������ ��ü�� �հ�� ;"+total);	
			System.out.println("1����"+i+"������ ¦���� �հ�� ;"+even);	
			System.out.println("1����"+i+"������ Ȧ���� �հ�� ;"+odd);	
			}		
			
 {
			}
		
		}
		
	
		
	}

}
