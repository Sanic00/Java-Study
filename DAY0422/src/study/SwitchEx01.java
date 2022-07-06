package study;

//두 정수와 연산자를 입력받아 계산하는 프로그램을 구현
// switch ~ case
import java.io.*;
public class SwitchEx01 {
 //static int tot;
	
	public static void main(String[] args) throws IOException{
				
				int a, b, tot=0;
				char  op;
		
				BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));

				System.out.print("첫번째 정수  :");
				a = Integer.parseInt(br.readLine());
				System.out.print("연산자 입력 :");
				op = (char)System.in.read() ;
		        System.in.read(); // \r 
				System.in.read(); // \n
				System.out.print("두번째 정수  : ") ;
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
					System.out.println("잘못된 연산자를 입력하셨습니다");
				break;
				
				}
				System.out.println();
				System.out.println(a+" "+op+" "+b+"="+tot);
				
			}
		

}
