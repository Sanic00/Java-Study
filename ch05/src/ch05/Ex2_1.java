package ch05;

import java.util.Arrays; // 컨트롤 쉬프트 O 자동으로 import문 추가

public class Ex2_1 {

	public static void main(String[] args) {
		int[] iArr = { 100, 95, 80, 70, 60 }; // 길이가 5인 int 배열
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println(Arrays.toString(iArr)); // Arrays.toString은 문자열로 반환 하는 메서드임

	}

}
