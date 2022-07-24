package ch02;

public class EX02 {

	public static void main(String[] args) {
		
		float pi = 3.14f;
		double rate = 1.618;
		float a = 10f;
		double b =10.;
		double c =.10;
//		float d = 3.14; // 에러. float 타입보다 double 타입이 더 크다
//		int e = 0x123456789; //에러 int타입의 범위를 넘는 값이여서 오류
		
		byte f = 65; //ok byte -128~127까지의 범위여서 65는 담김;
		short g = 0x1234; 	// ok, short 타입에 저장 가능한 범위의 int 타입의 리터럴.
		
		char h = 'h'; // char h = "Java"; 이건안댐
		String temp = "java"; //ok 스트링 타입의 temp라는 변수에 "Java"를 저장
		String str = ""; //ok 내용이 없는 빈 문자열
//		char ch =''; //에러 ' '안에 반드시 하나의 문자는 필요하다
		char chh = ' '; // ok 가능 '' 안에 공백이 있어서 ok
		String name = "Ja"+"va"; // ok 연산자 + 를 사용해서 문자열을 붙여준다. name 에 "Java"들어감
		String str1 = name + 8.0; // str1은 "Java"+8.0 = "Java8.0"으로 됨
		
		// 문자열 + any type ->문자열 + 문자열 -> 문자열
		/* anytype + 문자열 -> 문자열 + 문자열 -> 문자열
		 * 산술 연산자는 왼쪽에서 오른쪽으로 진행방향 대입 단항연산자만 오 -> 왼 나머지는 죄다 왼 ->오 이동
		 * 
		 * 
		 */
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
