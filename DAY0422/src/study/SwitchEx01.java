package study;

//�� ������ �����ڸ� �Է¹޾� ����ϴ� ���α׷��� ����
// switch ~ case
import java.io.*;
public class SwitchEx01 {
 //static int tot;
	
	public static void main(String[] args) throws IOException{
				
				int a, b, tot=0;
				char  op;
		
				BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));

				System.out.print("ù��° ����  :");
				a = Integer.parseInt(br.readLine());
				System.out.print("������ �Է� :");
				op = (char)System.in.read() ;
		        System.in.read(); // \r 
				System.in.read(); // \n
				System.out.print("�ι�° ����  : ") ;
				b = Integer.parseInt(br.readLine());

				switch (op) {
				//char + - * / %

				case '+' :
					tot = a+b ;
					break;
					
				case '-' :
					tot = a-b ;	
					break;
				
				case '*' :
					tot = a*b ;	
					break;

				case '/' :
					tot = a/b ;
					break;

				case '%' :
					tot = a%b ;
					break;
				
				default:
					System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�");
				break;
				
				}
				System.out.println();
				System.out.println(a+" "+op+" "+b+"="+tot);
				
			}
		

}
