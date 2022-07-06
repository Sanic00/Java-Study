package study;

/*
 *대문자를 소문자, 소문자 => 대문자
 * 
 */
import java.io.*;

//import javax.swing.Spring;
public class Test02 {

	public static void main(String[] args)throws IOException {

		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		char ch ;
		int n ;

		System.out.print("문자입력 : ");
		n = System.in.read();
		
				/*하단은 주은이 푼것 (오류 발생)
		 * char aa=' '; char ch=' '; System.out.println("문자입력 : "); aa =
		 * sc.next().charAt(0);
		 * 
		 * if ((aa >= 'A' && aa <= 'Z') ||(aa >= 'a' && aa<= 'z')) { ch=(char)(aa+32) ;
		 * System.out.println(ch) ;
		 * 
		 * ch = (char)(aa-32) ; System.out.println(ch) ; }
		 */
		 
		// 대문자를 입력받았을 경우 소문자로 변환
		// 소문자를 입력 받았을 경우 대문자로 변환
		//1. 입력값이 대문자 라면 
		
		if (n>=65 && n<=90) {
			n+= 32 ; // n값을 32만큼 증가시킴.
			ch = (char)n;
			System.out.println(ch);
		}
		else if (n>=97 && n<=122) { // 입력값이 소문자라면
			n-= 32 ; // n값을 32만큼 감소시킴.
			ch = (char)n;
			System.out.println(ch);
		}else { // 입력값이 알파벳이 아니라면 입력오류 출력
			System.out.println("입력 오류");
		}
		
		
	}}

	
