package study;

/*점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 * 단 4학년의 경우 70점 이상이어야 합격
 */
import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		int score, grade ;
		
		System.out.println("점수는?");
		score = sc.nextInt() ;
		
		System.out.println("학년은?");
		grade = sc.nextInt() ;
				
		if (score >= 60) {
			if (grade != 4)
				System.out.println("합격");
			else if (grade == 4 && score >=70) 
				System.out.println("합격");
			else  System.out.println("불합격");
	}
		else System.out.println("불합격");
	}
}