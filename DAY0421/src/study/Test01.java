package study;
import java.io.*;
public class Test01 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		/*������ ������ �Է¹޾� ¦������ Ȧ������ 0������ �����ϴ� ���α׷��� �ۼ��ϼ���
		 * �� �̿��� �͵��� ������ �����Ұ��� ���
		 */
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("������ �Է��ϼ���");
	int a=Integer.parseInt(br.readLine());
	if (a%2==0)System.out.println("¦��");
	else if(a%2==1)System.out.println("Ȧ��");
	else if(a==0)System.out.println("0");
	
	/*int n;
	 * if(n%2!=0)
	 * System.out.println(n+"-->Ȧ��");
	 * else if(n==0)
	 * System.out.println(n+"-->Ȧ��");
	 * 
	 */
	}

}
