package study;
/*
 * 배열
 * 
 * 1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여 공동의 집합 구조를 갖는 
 * 		자료의 집합체를 의미하는 것으로 동질적인 성격을 가진 자료들에 대해 
 * 		개별적으로 자료형을 부여하지 않고 하나의 이름을 가지고 처리할 목적으로 사용함.
 * 
 * 
 * 2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
 * 		1. 배열선언 --> 2. 배열에 메모리 할당(ex.new int [4]) ---> 3. 배열 요소의 이용(index(순서)로 이용) * index 초기값 : 0
 * 
 * 
 * 1 차원 배열 형식 및 구조
 * 
 * 		배열선언
 * 			자료형[]변수명(배열명) ex) int[]aa
 * 			변수명 = new 자료형[요소의 크기] ex) int[]aa = new int[4];
 * 			변수명[인덱스] = 값 ex) int aa[] = {100,200,300,400};
 */


public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열 선언
		int[] arr ; // int형 배열 선언
		
		//메모리 할당
		arr = new int[10] ; // 크기는 10개로 잡음 
				
		//int[]arr = new int[10] ; //선언과 동시에 메모리 할당.

		
		//1. 배열은 선언과 동시에 초기화가 가능하다.
		//메모리 할당할때도 초기화가 가능하다.
		
	//1. int arr[] = {1,2,3,4,5,6,7,8,9,0};  
	//    int[] arr = {1,2,3,4,5,6,7,8,9,0} ;
	//2. int[]arr = new int[] {1,2,3,4,5,6,7,8,9,0} ; // 배열선언과 동시에 new 연산자와 함께 초기값을 대입한다.
		 
		//배열 요소 사용(접근)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//초기화 하지않은 7개는 배열은 그 자료형에 의해서 무조건 0으로 초기화된다 ! ! ex) arr[3] = 0 으로 나온다.
		//값을 할당하지 않은 나머지 배열 공간은 자동으로 초기화된다.--> 0
		
		
		//배열에 저장되어 있는 데이터(요소)의 값 출력
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("arr[3]:"+arr[3]);
		
		//System.out.println("arr[10]:"+arr[10]); // 0~9 까지 가야하는데 배열의 크기가 초과하여 오류가 뜸. (index가 범위를 초과했다) => Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
																																						//		at study.ArrayExam01.main(ArrayExam01.java:56)

		//반복문을 활용하여 배열에 저장된 데이터들을 출력함. (1차원)
		for(int i = 0 ; i <10 ; i++)
			System.out.printf("%2d",arr[i]);	// 행 : row 열 : column 만나는 지점  :cell

		
		System.out.println();
		
		for(int temp : arr) // 무조건 왼쪽 변수는 새로운 변수와 동일한 자료형으로 넣어야함 : 배열의 변수 명 기입  !! 세미콜론이 아니라 콜론을 넣어야함 ! 
 		System.out.println(temp);
		
		
		
		
		
	}

}
