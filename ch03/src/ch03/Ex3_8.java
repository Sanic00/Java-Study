package ch03;

public class Ex3_8 {

	public static void main(String[] args) {
		int a = 1_000_000; 	// 1백만	
		int b = 2_000_000;	// 2백만
		
//		long c = a * b;
		long c = (long)a*b;
		
		System.out.println(c);
		

	}

}
