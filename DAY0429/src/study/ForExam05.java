package study;

/*Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է� �ް�
 * ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���ĺ� �Է� : e 
 * abcde
 * abcd
 * abc
 * ab
 * a
 * 
 */

import java.util.*;
public class ForExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char i,j ;
		char c = ' ' ;
		c = sc.next().charAt(0);
		
		for(i=c ; i>='a' ; i--) {
			for(j='a' ; j<=i ; j++) {
					System.out.print(j);}
			System.out.println();
			}
		}
			
	}

