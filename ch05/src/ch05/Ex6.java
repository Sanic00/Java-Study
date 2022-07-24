package ch05;

public class Ex6 {

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 95, 100, 55, 95 };

		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화 한다.

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) { // i=1 부터 시작이 score[1] =88임 88>79 조건이 참이라서
				max = score[i]; // max 값에 최대값이 저장됨
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end of for

		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}

}
