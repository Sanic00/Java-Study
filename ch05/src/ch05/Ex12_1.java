package ch05;

import java.util.Arrays;

public class Ex12_1 {

	public static void main(String[] args) {
		// index �� ������ 0~3-1 = 0~2 �̴�.
		String[] strArr = { "����", "����", "��" };
		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * 3);// �����Լ��� �ε����� ������ �����ش�
			System.out.println(strArr[temp]);
		}

	}

}
