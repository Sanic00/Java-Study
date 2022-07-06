package study;
/*
 * 믄)
 * -1^2+2^2-3^2+4^2-5^2+......+100^2의 합계를 구하시는 프로그램을 작성하시오
 * 
 * 
 */
public class WhileExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  i ,sum1, sum2 ;
		sum1 = sum2 = 0 ;
		
		for (i=1 ; i<=100; i++) {
			if(i%2==0) 
				sum1 += i*i ;
				else 
					sum2 += i*i ;
		}
			System.out.println("값은 :"+(sum1-sum2));

	
	
	}

}
