package study;

/* 1. �⵵�� 4�� ������ �������� �ش� �������� �Ѵ�.
 * 2. �� �߿��� 100���� ������ �������� �ش� ������� ��
 * 3. �ٸ� 400���� ������ �������� �ش� �ٽ� �������� ����
 * 
 *1���� ��ճ�¥�� 365.2425 �Ϸ� ���Ͽ� ��
 *���� 1�⺸�� 0.0003���� ���.
 *
 *������ ��¥ 31, 30��, 28���̸� ���
 *29���̸� ����
 
 */
 
import java.util.*;
 
 public class Tes01 {
	public static void main(String[] args)  {
	
	Scanner sc = new Scanner(System.in);

	int y,m,d ;
	System.out.println("�⵵ �Է� : ");
	y = sc.nextInt();
	
	System.out.println("�� �Է� : ");
	m = sc.nextInt();
	
	switch(m) {
	
	case 1: case 3: case 5: case 7:case 8: case 10: case 12: d =31 ;break;
	case 4: case 6: case 9: case 11: d =30 ;break;
	case 2 : 
		if(y%4==0 && y%100!=0 || y%400==0)
			d=29 ;
		else 
			d= 28 ;
		break ;
		
	default :
		d=0 ;
	break ;
	
	}
	if(d!=0) {
		System.out.println(y+"�� "+m+"���� " +d+"���� �Դϴ�.");
	
	}else {
		System.out.println("�Է� ���� !!");
		
	
	}
	
	
	}

}
