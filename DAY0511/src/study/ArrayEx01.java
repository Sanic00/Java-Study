package study;

//배열을 만들떄는 반드시 타입(자료형)을 맞춰야함 ! 서로 다른 자료형이어도 배열을 만들수 있음 => 객체배열

public class ArrayEx01 {

	public static void main(String[] args) {

		// int[] score = new int [5];
		int[] score = { 10, 10, 10, 10, 10 };
		int j = 1; // 1은 상수값

		score[0] = 10;
		score[1] = 10;
		score[j + 1] = 10;
		score[j + 2] = 10;
		score[j + 3] = 10;

		// System.out.println(score);//타임@주소의 형식으로 출력됨.
		// =>배열은 값을 저장하는 것이 아니라, 메모리의 주소값(위치값)을 저장함. 메모리의 주소값은 16진수로 되어있음. int = 4byte ,
		// int자료형 5개 배열 => 20byte

		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
		System.out.println(sum);
		sum = 0; // sum 은 항상 초기화해야함 !!
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			// sum = sum+i; //옆의 방법처럼 i를 배열이 아닌값으로 하면 안됨!
		}
		System.out.println(score.length);
		System.out.println(sum);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("score[%2d]:%2d\n", i, score[i]); // 배열을 출력하는 부분
		}
	}

}
