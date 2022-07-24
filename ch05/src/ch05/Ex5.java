package ch05;

public class Ex5 {

	public static void main(String[] args) {
		int sum = 0; // 총합을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // 길이가 5라서 5라도 나눠도 되지만 배열에 다른값이 추가 될수 있기 때문에 length사용.
		average = sum / (float) score.length; // 올바른 계산결과를 float로 얻기 위해서 형변환
		// 478 나누기 5 이기 때문에 int로 계산 하면 소숫점이 탈락됨
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + average);
	}

}
