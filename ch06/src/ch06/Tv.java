package ch06;

public class Tv {
	// tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;

	// tv�� ���(�޼���)
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}
