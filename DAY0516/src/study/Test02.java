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

//get : 값 갖고옴 / set : 새로운 값으로 설정
//private class / / this : 자기 자신(이 class) , 자기 클래스의 필드를 의미함. -> 결국 this (클래스가 갖고 있는 필드의 값을 초기화하겠다 ! ) = this (class) ex) this.color = color ;
//아무것도 없으면 지역변수 / 파라미터 변수가 우선됨. *전역변수: 클래스 전체에서 씀. / 지역변수:지역에서만 씀. 
//getter & setter 만드는 법 : 마우스 우클릭 = > souce => generate getters and setters
//상속시, 부모필드를 자식필드가 사용가능.변수명이 동일하기 때문에 구분하기 위해서는 Super유무 (Super유 => 부모변수)
//public 접근 제어 수식어 : public은 누구나 접근 가능.(필드 : private / 메소드 : public)
//default와 protected 접근 제어 수식어 
//default : 하위 클래스 접근 못함 / protect : 서브클래스에서 접근 가능. *하위클래스 : 상속받을때.  / 외부클래스 : 패키지가 다 다를때
//생성자 : 객체를 만들 때사용(클래스의 이름과 동일한 메소드를 말함. 주로 클래스 변수를 초기화 할 때 사용.)
//오버로딩: 동일한 이름의 메소드가 여러번 사용되는데,조건이 있음.(파라미터의 개수와 형식 상관없이 매소드의 이름만 같으면 된다)
//static이 붙어있다면 클래스 변수,객체를 만들지 않아도 됨 !! (만들어도 되긴함) ㅋㅋ !  / 없다면 instance(객체)변수 ! 

public String getColor() {
	return color;
}

public int getSpeed() {
	return speed;
}
	
public static void main(String[] args) {

	Car car1 = new Car();
	car1.color = "보라색" ; // car 클래스 멤버변수에 값을 설정
	car1.speed = 0 ;

	//car 클래스의 upSpeed(30) 메소드에 30을 매개변수에 값을 대입했다.
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


