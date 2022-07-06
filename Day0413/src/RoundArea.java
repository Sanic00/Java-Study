


//import.java.lang.*;

public class RoundArea {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. 변수선언 및 초기화
		double area = 0 , area1 = 0 ; // 원의 넓이 , 원의 둘레
		int r = 5; // 반지름
		//System.out.println(area);
		// PI : 원주율
		//2. 연산 및 처리
		area = r*r* (Math.PI);
		
		  //원의 둘레
		area1 = 2*r*(Math.PI);
		
		
		//System.out.printin("원의 넓이는 "+area+"입니다.");
		System.out.printf("원의 넓이는 %.3f 입니다.\n",area);
		System.out.printf("원의 둘레는 %.3f 입니다.\n",area1);
		
		
		

		
		//int r=5;
		double d; 
		//r = 5;
		d = r*r*Math.PI;
		
		System.out.println(d);
		
		int r1 = 5 ;
		double d1 ;
		//r1 = 5 ;
		d1 = r1*2*Math.PI;
		
		System.out.println(d1);
		
		
		
		
		
		
	}

}
