package study;

import java.util.*;
public class Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n,total ;
		n=total=1;
		
		System.out.println("n�� ���� �Է��Ͻÿ�");
		n = sc.nextInt();

		for (int i=1 ; i<=n ; i++) 
		total *= i;
		
		System.out.println(n+"�� ���丮���� ����"+total+"�Դϴ�.");
	}

	}
