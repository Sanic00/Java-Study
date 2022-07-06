package study;

/*
 * 문) 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀수인지를 판정하는 프로그램을 작성하시오.
 *단, 조건삼항연산자를 이용하여 처리하시오. 
 */
import java.util.Scanner ;
public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
			
		int a ; //사용자로부터 입력받는 정수
		String b ; // 홀수인지 짝수인지 판별하는 변수
		
		System.out.println("입력한 정수는 ? : "); // 안내메시지 및 입력받은 정수 저장
		a = sc.nextInt();
				
		b = a%2==0? "짝수" : "홀수" ;
		//if(a%2==0) a ="짝수" ; else a="홀수" ; // 삼항연산자를 if로 변환했을떄 !
	
		System.out.println("입력한 정수는 "+b+"입니다");
	}

}
