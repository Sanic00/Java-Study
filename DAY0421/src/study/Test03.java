package study;
import java.io.*;
public class Test03 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*����ڷκ��� ������ ���� ������ �Է¹޾� ���������� ū�� ������ ����ϴ� ���α׷���
		 * �ۼ��Ѵ�.
		 */
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ù��°������ �Է��ϼ���");
		int a=Integer.parseInt(br.readLine());
		System.out.println("�ι�°������ �Է��ϼ���");
		int b=Integer.parseInt(br.readLine());
		System.out.println("����°������ �Է��ϼ���");
		int c=Integer.parseInt(br.readLine());
		
		
		  if (a>b) {a=a^b; b=b^a; a=a^b;}
		  // ���� ù��° ������ �ι�° �������� ũ�ٸ� �������� �ڸ��� �ٲپ��ش�.
		  //temp=a; a=b; a=temp;
		  if(b>c) {b=b^c; c=c^b; b=b^c;}
		  // ���� �ι�° ������ ����° �������� ũ�ٸ� �������� �ڸ��� �ٲپ��ش�.
		 //temp=b; b=c; c=temp;
		  if (a>b) {a=a^b; b=b^a; a=a^b;}
		 // ���� ù��° ������ �ι�° �������� ũ�ٸ� �ڸ��� �ٲپ��ش�.
		 //temp=a; a=b; a=temp;
		System.out.println(a+","+b+","+c);
		
	/* �ϴ� BufferedReader�� �Ἥ ���ڸ� �Է��Ѵ�.
	 * �ι�°�� ���࿡ a = 32 b=56 c=52�� ���� �ִٰ� �����ϰ� 
	 * xor ����Ʈ�� ����ؼ� a=a^b;b=b^a;a=a^b; (--> a�� b�� �ڸ��� �ٲپ��ش�)
	 * a>b���� ũ�ٸ�  �ٲپ� �ְ�  b>c���� ũ�ٸ� �ٲپ��ְ� 
	 * �ٽ� a�� b�� ���ؼ� ũ�ٸ� �ٲپ��ش�! �״��� ������ֱ�! 	
	 */
	//xor ���� a��b�� �ٲپ��ش�. a=a^b;b=b^a;a=a^b;
			
	/*
	 * 		
	 */
			
	}

}
