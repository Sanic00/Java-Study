package ch06;

public class Tvtest04 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 객체배열 또는 참조변수배열이라고 함

		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출 채널이 1씩증가
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}

}
