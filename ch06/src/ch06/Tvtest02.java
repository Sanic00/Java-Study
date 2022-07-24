package ch06;

public class Tvtest02 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 현재 채널은" + t1.channel + "입니다");
		System.out.println("t2의 현재 채널은" + t2.channel + "입니다");
		t1.channel = 7;
		System.out.println("t1의 현재 채널은" + t1.channel + "입니다");
		t2 = t1;
		System.out.println("t2의 현재 채널은" + t2.channel + "입니다");
	}

}
