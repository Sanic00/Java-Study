package study;
 import java.io.*;
public class Test02 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/* ����ڷ� ���� ������ ������ �Է¹޾� �Է¹��� ������ 2�� ������� 3�� �������
		 *  2��3�� ������� 2�� 3�� ����� �ƴ����� ����� ����ϴ� ���α׷��� �����Ѵ�.  
		 */
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("������ �Է��ϼ���");
	int a=Integer.parseInt(br.readLine());
	
	if(a%3==0&&a%2==0) {
		System.out.println("2��3�ǹ���Դϴ�");}
	
	    else if(a%2==0) {System.out.println("2�� ����Դϴ�");}
		else if(a%3==0) {
			System.out.println("3�ǹ���Դϴ�");}
		else
		{System.out.println("2��3�� ����� �ƴմϴ�");}
	
	
	
	}

}
