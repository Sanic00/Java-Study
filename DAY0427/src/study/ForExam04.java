package study;
/*
 *���� �Ǽ��� �Է¹޾� �Է¹��� ���� ����� ���ϴ� ���α׷� ����
 *��, ���� �Ǽ��� �ԷµǸ� ����Ͻÿ�.
 
 *���� �Ǽ� �Է� : 1.1
 *���� �Ǽ� �Է� : 2.2
 *���� �Ǽ� �Է� : 3.3
 *���� �Ǽ� �Է� : 4.4
 *���� �Ǽ� �Է� : -5.5
 *���ݱ����� ��� : 2.2
 * 
 */
import java.util.*;
public class ForExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float total, input ;
		total = input = 0.0f; // �ʱⰪ�� ������ �ڷ����϶� ��ó�� �����ϰ� Ȱ���ص� �ȴ� !
		
		int count = 0 ;
		for(;input>=0.0;) {
			total = total + input ;
			System.out.println("���� �Ǽ� �Է�:");
			input = sc.nextFloat();
			count++;
		}
		
		System.out.println("���ݱ����� ���:"+total/count);
		
	}

}
