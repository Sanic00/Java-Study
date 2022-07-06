package study;
/*
 *임의의 5개 과목을 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램 구현
 * switch ~case 문과 BufferedReader를 이용하여 구현 하시오.
 *  
 */
import java.io.*;
public class Score {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		char rank ;
		
		System.out.print("국어점수는? :");
		int a=Integer.parseInt(br.readLine());

		System.out.print("수학점수는? :");
		int b=Integer.parseInt(br.readLine());
	
		System.out.println("영어점수는? :");	
		int c=Integer.parseInt(br.readLine());
		
		System.out.println("사회점수는? :");
		int d=Integer.parseInt(br.readLine());
		
		System.out.println("과학점수는? :");
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
		
		System.out.println("당신의 총점은"+sum+"이고, 평균점수는 "+avg+"이며,");		
		System.out.println("당신의 학점은"+rank+" 입니다");
			
	}

}
