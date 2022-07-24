package ch06;

public class TvTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7; // Tv객체에 멤버변수 channel 을 7로 저장시킨다.
		t.channelDown(); // 채널 다운 메서드 호출 한거
		System.out.println("현재의 채널은" + t.channel + "입니다.");

	}

}
