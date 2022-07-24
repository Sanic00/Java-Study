package ch05;

import java.util.Arrays;

public class Ex7_1 {

	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) { // 100번 두 요소 값 바꾸기
			int n = (int) (Math.random() * 10); // 0~9 중의 한값을 임의로 받는다. index값으로 맞춘거임 난수
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp; // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
		}
		System.out.println(Arrays.toString(numArr)); // 중복된값이 안나오는 이유가 0~9까지 중복이 되는 숫자가 없음.
	}

}
