package study;
//무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램을 작성하시오
//변수 : n1,n2

import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,n2 ;
		
		
		//for(;;) {//무한으로 돌아가는 for식
		while(true) {//무한으로 돌아가는 while식
		System.out.print("정수입력:");
		n1 =sc.nextInt();
		if(n1==0)
			break;
		System.out.print("정수입력:");
		n2 =sc.nextInt();
		System.out.println("두개의 합계는 : "+(n1+n2));	}


	}
	
}
