package ch05;

public class Ex5 {

	public static void main(String[] args) {
		int sum = 0; // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // ���̰� 5�� 5�� ������ ������ �迭�� �ٸ����� �߰� �ɼ� �ֱ� ������ length���.
		average = sum / (float) score.length; // �ùٸ� ������� float�� ��� ���ؼ� ����ȯ
		// 478 ������ 5 �̱� ������ int�� ��� �ϸ� �Ҽ����� Ż����
		System.out.println("���� :" + sum);
		System.out.println("��� :" + average);
	}

}
