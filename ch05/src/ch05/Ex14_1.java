package ch05;

public class Ex14_1 {

	public static void main(String[] args) {
		// 01234
		String str = "ABCDE"; // str.length()�� 5��

		char ch = str.charAt(4);
		System.out.println(ch); // ���� E�� ���;ߵ�

		String str2 = str.substring(1, 4); // substring�� to�� = str.length()(���ڿ��� ����)�� �Ȱ���.
		String str3 = str.substring(1);// <-�̷��� to�� �����ع����� index 1���� ���ڿ� ������ ����� ��
		System.out.println(str2); // ����� B,C,D �� ���;ߵ�
	}

}
