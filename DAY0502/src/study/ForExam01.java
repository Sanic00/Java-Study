package study;

public class ForExam01 {

	/*문]
	 * 1~100까지의 정수 중에서 2,3,5,7의 배수를 제외한 수를 한행에 
	 * 10개씩 출력하는 프로그램을 작성하시오.
	 * (조건 삼항 사용)
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