package study;

public class ForExam01 {

	/*��]
	 * 1~100������ ���� �߿��� 2,3,5,7�� ����� ������ ���� ���࿡ 
	 * 10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * (���� ���� ���)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, cnt =1 ;
		
		for (i=1 ; i<=100 ; i++) {
			if((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0)) 
				System.out.printf("%2d%c",i,(cnt++%10 !=0)? ' ' : '\n');
			
			//System.out.printf("%d %c",i, (cnt%10 != 0)? ' ' : '\n') ;
				
	}

}
}