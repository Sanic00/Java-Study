package com.hw;
//�߻� Ŭ������ ��ӹ޾� �����ϴ� ����ü(����Ŭ����) p723��

public class Piano extends Instrument {

	public static void main(String[] args) {
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
		
	
		
	}

	@Override
	void play() { //�ν��Ͻ� �޼ҵ�
		// TODO Auto-generated method stub
		System.out.println("Piano : play()ȣ���");
	}

	@Override
	void volumeUp() { 
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeUp()ȣ���");
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeDown()ȣ���");
	}

}
