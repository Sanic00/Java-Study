package study;
/*
 * ��)
 * -1^2+2^2-3^2+4^2-5^2+......+100^2�� �հ踦 ���Ͻô� ���α׷��� �ۼ��Ͻÿ�
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
			System.out.println("���� :"+(sum1-sum2));

	
	
	}

}
