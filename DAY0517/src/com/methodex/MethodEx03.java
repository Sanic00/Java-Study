package com.methodex;
/*
 * �������� ��� 
 *1.�ִ�� 2. ������ �հ� 3.���� 4.����  
 *
 *���� ���α׷� ������~
 */


import java.io.*;
public class MethodEx03 {

	//�ִ밪 ���ϴ� �޼ҵ� �ۼ�
	public static int aaa()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ù��° �� �Է� :");
		int a= Integer.parseInt(br.readLine());
		System.out.println("�ι�° �� �Է� : ");
		int b= Integer.parseInt(br.readLine());
		//else ���� �������� ���� �ȵ�.
		if (a>b) {
		return  a;
		}else {
		return  b;	
		}
	}
		//return 0 ;
	
	// �� �� ������ �հ踦 ���ϴ� �޼ҵ�
	public static void bbb()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ù��° �� �Է� :");
		int a= Integer.parseInt(br.readLine());
		System.out.println("�ι�° �� �Է� : ");
		int b= Integer.parseInt(br.readLine());
		
		//���� ���� ����
		int tot  = 0 ;
		
		if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
		}
		for(int i = a ; i<=b ; i++ ) {
			tot+=i;

		}
		
		System.out.println(a+"~~~"+b+"������ �հ�:"+tot);
		//return ;
		
		//������ �ڵ��� system.out.println()�� ���� �ȵ�. return�� �ڿ� �ƹ��͵� ���� �ȵ� ! ���������� ����� ~ 
	}// end bbb
	
	//ū ������� �����ϴ� ������ �����ϴ� �޼ҵ�
	public static String ccc(int x, int y, int z) { //firstSu = x , SecondSu = y , ThirdSu= z
	
		if(y>=x && y>=z) {	// y�� ���� Ŭ��
			//swap ���Ŀ� �ǰ��ؼ� �� ���� �ڸ��� �ٲ��ش�.
			int imsi = x ;
			x =  y ;
			y = imsi ;
			
		}else if(z>=x && z>=y) { // z�� ���� Ŭ��
			int imsi = x ;
			x =  z ;
			z = imsi ;
		
		}if(z>=y) {	// z�� y �� ū ��
		
			int imsi = y ;
			y =  z ;
			z = imsi ;	
		
		}
		String abc = x+">="+y+">="+z ;
		return abc;
	}
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0; //�޴��� �Է� ���� ����
		
		while(true) {
			System.out.print("1:�ִ�� 2:���� �հ� 3:���� 4:����");
			x = Integer.parseInt(br.readLine());
			
			if(x==1) { // return ���� ���´�.
				int k = aaa(); 
				System.out.println("�� ���� �ִ밪��"+k+"�Դϴ�");
			}else if(x==2) {//Call by Name(�Լ��� �̸��� ȣ���Ѵ�). return���� ���� ������ �ٷ� ȣ�� ����.
				 bbb();
			}else if(x==3) { // Call by Value(���� ȣ�� => �Ű������� ����) 
				System.out.println("ù��° �� �Է� :");
				int firstSu = Integer.parseInt(br.readLine());
				System.out.println("�ι�° �� �Է� : ");
				int secondSu = Integer.parseInt(br.readLine());
				System.out.println("����° �� �Է� : ");
				int thirdSu = Integer.parseInt(br.readLine());
				
				String str =  ccc(firstSu, secondSu, thirdSu);
				System.out.println("ū ������ ������ "+str);
			}else if(x==4) {
				break;
			}else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println("���� �ϼ̽��ϴ�.");
		

	}

}
