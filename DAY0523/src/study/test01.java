package study;
class Person{
	private String regnumer ;//���� �Ұ�
	private double weight ; //���� �Ұ�
	protected int age ; //���� ����
	
	
	public double getWeight () {
		return weight ;		
	}
}


class Student extends Person{ //Person��ӹ���.
	int id;
}

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.age = 2;
		//private ������ �ϴ� ������ ȣ��Ұ�
		//obj.regnumer,weight
	}

}
