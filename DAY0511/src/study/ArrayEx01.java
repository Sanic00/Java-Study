package study;

//�迭�� ���鋚�� �ݵ�� Ÿ��(�ڷ���)�� ������� ! ���� �ٸ� �ڷ����̾ �迭�� ����� ���� => ��ü�迭

public class ArrayEx01 {

	public static void main(String[] args) {

		// int[] score = new int [5];
		int[] score = { 10, 10, 10, 10, 10 };
		int j = 1; // 1�� �����

		score[0] = 10;
		score[1] = 10;
		score[j + 1] = 10;
		score[j + 2] = 10;
		score[j + 3] = 10;

		// System.out.println(score);//Ÿ��@�ּ��� �������� ��µ�.
		// =>�迭�� ���� �����ϴ� ���� �ƴ϶�, �޸��� �ּҰ�(��ġ��)�� ������. �޸��� �ּҰ��� 16������ �Ǿ�����. int = 4byte ,
		// int�ڷ��� 5�� �迭 => 20byte

		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
		System.out.println(sum);
		sum = 0; // sum �� �׻� �ʱ�ȭ�ؾ��� !!
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			// sum = sum+i; //���� ���ó�� i�� �迭�� �ƴѰ����� �ϸ� �ȵ�!
		}
		System.out.println(score.length);
		System.out.println(sum);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("score[%2d]:%2d\n", i, score[i]); // �迭�� ����ϴ� �κ�
		}
	}

}
