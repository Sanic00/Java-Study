package ch05;

import java.util.Arrays;

public class Ex10_1 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 }; // 1���� �迭�� arr
		int[][] arr2D = { { 11, 12 }, { 21, 22 } }; // 2���� �迭�� arr2D

		System.out.println(Arrays.toString(arr)); // to String ���ڿ��� �ٲ㼭 ���
		System.out.println(Arrays.toString(arr2D)); // ������ �迭�϶��� toString�� �ƴ�
		System.out.println(Arrays.deepToString(arr2D)); // deepToString�� ����Ѵ�.

		String[][] str2D = { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(str2D == str2D2); // �̷��� �� �ϸ� false�� ��
		// ==���� ���� �� �� ���� �ٸ� �迭�̱� ������ ��ĥ���� ����.
		System.out.println(Arrays.deepEquals(str2D, str2D2));

		// ����
		int[] arr2 = Arrays.copyOf(arr, arr.length); // ���� �������� 3���� �Է��ϸ� 0,1,2�� �����
		System.out.println(Arrays.toString(arr2));// 7�� ������ 01234 ������ ��������� �������� 0���� ����
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4); // from to �� ���� to�� ������ �ȵ�
		System.out.println(Arrays.toString(arr3));

		// ����(sort) arr4�� ������������ ���� ����
		int[] arr4 = { 3, 4, 1, 0, 2 };

		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));

	}

}
