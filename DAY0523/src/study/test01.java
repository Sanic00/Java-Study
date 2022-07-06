package study;
class Person{
	private String regnumer ;//접근 불가
	private double weight ; //접근 불가
	protected int age ; //접근 가능
	
	
	public double getWeight () {
		return weight ;		
	}
}


class Student extends Person{ //Person상속받음.
	int id;
}

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.age = 2;
		//private 지정한 하단 변수는 호출불가
		//obj.regnumer,weight
	}

}
