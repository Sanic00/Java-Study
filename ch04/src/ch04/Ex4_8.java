package ch04;
import java.util.*;
public class Ex4_8 {

	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���. (011234-1111222)>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch (gender)
		
		{
		case '1' : case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2' : case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default :
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
