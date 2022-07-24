package ch05;

public class Ex14_1 {

	public static void main(String[] args) {
		// 01234
		String str = "ABCDE"; // str.length()는 5임

		char ch = str.charAt(4);
		System.out.println(ch); // 값이 E가 나와야됨

		String str2 = str.substring(1, 4); // substring에 to는 = str.length()(문자열의 길이)랑 똑같다.
		String str3 = str.substring(1);// <-이렇게 to를 생략해버리면 index 1부터 문자열 끝까지 찍어라는 뜻
		System.out.println(str2); // 결과값 B,C,D 가 나와야됨
	}

}
