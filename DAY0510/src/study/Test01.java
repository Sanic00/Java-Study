package study;
/*
 * ������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
 * ¦���� ��Ҹ� ��� ����ϰ�,
 * 3�� ����� ��Ҹ� ��� �⏋�㴫 ���α׷��� �����Ͻÿ�
 *
 * 
 * ������ ���� : 4, 7 , 9, 1, 3, 2, 5, 6, 8
 *
 * 1.�迭�� ��ü ��� ��� : 
 * 2.¦���� ��� : 4,2,6,8
 * 3. 3�� ����� ��� : 9,3,6
 * 
 */

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1. �迭�� ����� �ʱ�ȭ
		int arr [] = {4,7,9,1,3,2,5,6,8} ;
		
		/*
		for(int i =0 ; i<9 ; i++) {
			System.out.println("���� �Է� :");
			arr[i]=sc.nextInt();
			
		}
		*/
		System.out.println("�迭�� ��ü ��� ��� 1)");
		for(int i =0 ; i<arr.length ; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		
		System.out.println("�迭�� ��ü ��� ��� 2)");
		for(int temp :arr)
			System.out.printf("%4d",temp);
							
		System.out.println();
		
		System.out.println("¦�� ���")		;
		for(int i =0 ; i<arr.length ; i++) {
			if(arr[i]%2==0)
			System.out.printf("%4d", arr[i]);
		}
		
		System.out.println();
		
		System.out.println("3�� ��� ���")		;
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


