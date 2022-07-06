package study;



public class WhileExam03_1 {

	public static void main(String[] args) {

		int i = 1, simbol  =1 ,sum = 0 ;
		
		while(i<=100) {
			//if(i%2!=0)
			simbol = - simbol ; //기호를 바꾼다.
			sum+=simbol*(i*i) ;
			i ++ ;
		}
		System.out.println(sum);
		//-1+4-9+16
	}

}
