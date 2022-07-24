package ch05;

import java.util.Arrays;

public class Ex12_1 {

	public static void main(String[] args) {
		// index 의 범위는 0~3-1 = 0~2 이다.
		String[] strArr = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * 3);// 랜덤함수를 인덱스의 범위랑 맞춰준다
			System.out.println(strArr[temp]);
		}

	}

}
