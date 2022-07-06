package study;

/* [char] 자료형 배열에 알파벳 대문자를 채우고,
 * 채워진 배열에 전체 요소를 출력
 * 
 * 
 * 	단, char 자료형의 배열에 초기화는 반복문을 이용함.
 * 
 */



public class ArrayEx03 {

	public static void main(String[] args) {
//알파벳 대문자 구성
		//1.
		/*
		char aa[] = new char[26] ;
		aa [0] = 'A' ;
		aa [1] = 'B' ;
		
		aa [25] = 'Z' ;
		*/
		
		//2.3[
		//char aa[] =  {'A','B','C','Z'};
		
		//3.
		char aa[] = new char[26];
		for (int i =0, b=65 ; i<aa.length ; i++,b++) { // A : 65 , a :97 ( 알파벳 숫자는 26개 => 아스키코드값 이용)
		aa[i] = (char)b;
		System.out.printf("%c",aa[i]);
	}
	
		System.out.println();
		
		char[] arpha = new char [26];
		for(int i = 0 ;  i< arpha.length ; i++) {
			arpha[i] = (char)('a'+i);
			System.out.print(arpha[i]+"");
		}
		
		
		
		
		
	}

}
