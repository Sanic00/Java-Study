package study;

import java.io.*;

/*
 * 사용자가 입력하는 정수를 계속해서 더해 나아감
 * 만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함.
 */
public class WhileExam02 {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n ,sum  ;
		n = 1 ;
		sum = 0; 
		
		while (n!=0) {
		System.out.println("정수를 입력하시오, 0 종료 :");
		n=Integer.parseInt(br.readLine());
		 /*
		if (n==0)
			break ; 
		*/
		sum+=n ;
		}
		System.out.println("지금까지 입력한 값의 합계"+sum);
	}
}
