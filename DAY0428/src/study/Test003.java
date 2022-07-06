package study;
/*
 * 사용자로부터 임의의 정수를 입력받아
 * 1부터 입력받은 수까지의 전체의 합계,짝수의 합계,홀수의 합을 각각 출력하는 프로그램을 구현하고
 * 
 * 10단위로 합계를 출력하시오.
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
		
			System.out.println("1부터"+i+"까지의 전체의 합계는 ;"+total);	
			System.out.println("1부터"+i+"까지의 짝수의 합계는 ;"+even);	
			System.out.println("1부터"+i+"까지의 홀수의 합계는 ;"+odd);	
			}		
			
 {
			}
		
		}
		
	
		
	}

}
