package study;
/*
 *������ 5�� ������ ������ �Է¹޾� ������ ����� ���ϰ� ����� �̿��Ͽ� ������ �����ϴ� ���α׷� ����
 * switch ~case ���� BufferedReader�� �̿��Ͽ� ���� �Ͻÿ�.
 *  
 */
import java.io.*;
public class Score {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		char rank ;
		
		System.out.print("����������? :");
		int a=Integer.parseInt(br.readLine());

		System.out.print("����������? :");
		int b=Integer.parseInt(br.readLine());
	
		System.out.println("����������? :");	
		int c=Integer.parseInt(br.readLine());
		
		System.out.println("��ȸ������? :");
		int d=Integer.parseInt(br.readLine());
		
		System.out.println("����������? :");
		int f=Integer.parseInt(br.readLine());
		
		int sum = a+b+c+d+f ;
		int avg = sum /5 ;
				
		switch ((int)avg/10) {
		
			case 9 :
			rank = 'A' ;
			break;

			case 8 :
				rank = 'B' ;
				break;
				
			case 7 :
				rank = 'C' ;
				break;
				
			case 6 :
				rank = 'D' ;
				break;
	
		default:
			rank = 'F' ;
		
		}
		
		System.out.println("����� ������"+sum+"�̰�, ��������� "+avg+"�̸�,");		
		System.out.println("����� ������"+rank+" �Դϴ�");
			
	}

}
