package study;

class Car{
static String color ;
//int speed ;
static int speed ;

void upSpeed(int value) {
	speed = speed + value ;
	}

void downSpeed(int value) {
	speed = speed - value ;
	}

//get : �� ����� / set : ���ο� ������ ����
//private class / / this : �ڱ� �ڽ�(�� class) , �ڱ� Ŭ������ �ʵ带 �ǹ���. -> �ᱹ this (Ŭ������ ���� �ִ� �ʵ��� ���� �ʱ�ȭ�ϰڴ� ! ) = this (class) ex) this.color = color ;
//�ƹ��͵� ������ �������� / �Ķ���� ������ �켱��. *��������: Ŭ���� ��ü���� ��. / ��������:���������� ��. 
//getter & setter ����� �� : ���콺 ��Ŭ�� = > souce => generate getters and setters
//��ӽ�, �θ��ʵ带 �ڽ��ʵ尡 ��밡��.�������� �����ϱ� ������ �����ϱ� ���ؼ��� Super���� (Super�� => �θ𺯼�)
//public ���� ���� ���ľ� : public�� ������ ���� ����.(�ʵ� : private / �޼ҵ� : public)
//default�� protected ���� ���� ���ľ� 
//default : ���� Ŭ���� ���� ���� / protect : ����Ŭ�������� ���� ����. *����Ŭ���� : ��ӹ�����.  / �ܺ�Ŭ���� : ��Ű���� �� �ٸ���
//������ : ��ü�� ���� �����(Ŭ������ �̸��� ������ �޼ҵ带 ����. �ַ� Ŭ���� ������ �ʱ�ȭ �� �� ���.)
//�����ε�: ������ �̸��� �޼ҵ尡 ������ ���Ǵµ�,������ ����.(�Ķ������ ������ ���� ������� �żҵ��� �̸��� ������ �ȴ�)
//static�� �پ��ִٸ� Ŭ���� ����,��ü�� ������ �ʾƵ� �� !! (���� �Ǳ���) ���� !  / ���ٸ� instance(��ü)���� ! 

public String getColor() {
	return color;
}

public int getSpeed() {
	return speed;
}
	
public static void main(String[] args) {

	Car car1 = new Car();
	car1.color = "�����" ; // car Ŭ���� ��������� ���� ����
	car1.speed = 0 ;

	//car Ŭ������ upSpeed(30) �޼ҵ忡 30�� �Ű������� ���� �����ߴ�.
	//car1.upSpeed(30);
	
	System.out.println(car1.getColor());
	System.out.println(car1.getSpeed());
	
	System.out.println(car.speed);
	System.out.println(car.color);
	System.out.println(car.);
	
	//car1.color ;
	//car1.speed ;

	}
}


