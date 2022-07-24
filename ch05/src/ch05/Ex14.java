package ch05;

public class Ex14 {

	public static void main(String[] args) {
		String String = "ABCDE";

		for (int i = 0; i < String.length(); i++) {
			char ch = String.charAt(i); // String의 i번째 문자를 출력
			System.out.println("String.charAt(" + i + "):" + ch);
		}

	}

}
