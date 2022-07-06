package study;
/*
 * 임의의 숫자가 들어있는 배열의 숫자 데이터들 중
 * 짝수인 요소만 골라서 출력하고,
 * 3의 배수인 요소만 골라서 출룍허눈 프로그램을 구현하시오
 *
 * 
 * 임의의 숫자 : 4, 7 , 9, 1, 3, 2, 5, 6, 8
 *
 * 1.배열의 전체 요소 출력 : 
 * 2.짝수만 출력 : 4,2,6,8
 * 3. 3의 배수만 출력 : 9,3,6
 * 
 */

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1. 배열의 선언과 초기화
		int arr [] = {4,7,9,1,3,2,5,6,8} ;
		
		/*
		for(int i =0 ; i<9 ; i++) {
			System.out.println("정수 입력 :");
			arr[i]=sc.nextInt();
			
		}
		*/
		System.out.println("배열의 전체 요소 출력 1)");
		for(int i =0 ; i<arr.length ; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		
		System.out.println("배열의 전체 요소 출력 2)");
		for(int temp :arr)
			System.out.printf("%4d",temp);
							
		System.out.println();
		
		System.out.println("짝수 출력")		;
		for(int i =0 ; i<arr.length ; i++) {
			if(arr[i]%2==0)
			System.out.printf("%4d", arr[i]);
		}
		
		System.out.println();
		
		System.out.println("3의 배수 출력")		;
		for(int i =0 ; i<arr.length ; i++) {
			if(arr[i]%3==0)
			System.out.printf("%4d", arr[i]);
		}
		}
		
		
		
		/*int aa[] = new int [] {4,7, 9, 1, 3, 2, 5, 6, 8} ;
		int i ;
		
		for ( i=0 ; i <10 ; i++ ) {	
		System.out.println(aa[]);}
		
		
		for(i=aa ; i<=aa ; i++ ) {
			if(i%2==0) {
				System.out.println(i);}
				if(i%3==0) {
					System.out.println(i);
				}
*/			
	}


