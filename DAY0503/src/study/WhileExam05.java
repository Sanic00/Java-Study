package study;
/*
 * ��)
 * -50���� 1������ ���� ����ϴ� ���α׷�.
 * �� ,���ٿ� 5������ ��½�Ű��, �� ���� ���̸� �� �������� ���ÿ�.
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
