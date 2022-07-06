package study;
/*
 * 문)
 * -50에서 1까지의 수를 출력하는 프로그램.
 * 단 ,한줄에 5개씩만 출력시키고, 이 수를 사이를 탭 간격으로 띄우시오.
 * 
 */
public class WhileExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = -50 ;
		int cnt =1; 
		while(i<=1) {
		System.out.printf ("%2d\t%c",i,(cnt++%5 !=0)? ' '  : '\n') ; 
		i++;}
	
	}

}
