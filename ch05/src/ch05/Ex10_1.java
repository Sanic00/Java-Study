package ch05;

import java.util.Arrays;

public class Ex10_1 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 }; // 1차원 배열의 arr
		int[][] arr2D = { { 11, 12 }, { 21, 22 } }; // 2차원 배열의 arr2D

		System.out.println(Arrays.toString(arr)); // to String 문자열로 바꿔서 출력
		System.out.println(Arrays.toString(arr2D)); // 다차원 배열일때는 toString이 아닌
		System.out.println(Arrays.deepToString(arr2D)); // deepToString을 써야한다.

		String[][] str2D = { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(str2D == str2D2); // 이렇게 비교 하면 false가 뜸
		// ==참조 변수 값 비교 서로 다른 배열이기 때문에 겹칠수가 없다.
		System.out.println(Arrays.deepEquals(str2D, str2D2));

		// 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 만약 랭스말고 3으로 입력하면 0,1,2만 복사됨
		System.out.println(Arrays.toString(arr2));// 7을 넣으면 01234 까지는 복사되지만 나머지는 0으로 나옴
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4); // from to 와 같음 to는 포함이 안됨
		System.out.println(Arrays.toString(arr3));

		// 정열(sort) arr4를 오름차순으로 정렬 해줌
		int[] arr4 = { 3, 4, 1, 0, 2 };

		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));

	}

}
