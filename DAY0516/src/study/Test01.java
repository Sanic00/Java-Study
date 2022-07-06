package study;

/*클래스 : 
java는 완전한 객체지향 프로그래밍 언어
public 클래스와 클래스 차이 ! public은 파일명과 동일해야 붙일 수 있음.
+) private class는 많은 제약이 생김(상속 등 활용이 불가)
메인 클래스에 메소드는 한개만 됨 ! 
*/

class AAA{	
	int a ; // 클래스변수(속성) // 객체를 생성해야만한다.
	static int b ;// 객체를 생성하지 않아도 접근가능	
}

//자료형 앞에 static을 넣어야 다른 class에서도 사용가능.
//static이 없을시, instant 객체를 넣어서 사용할 수도 있음.
//class명의 첫글자는 대문자
//사칙연산(Add,Sub,Mul,Div) class만들시 -> ex ) class Add{기능 +}
//class의 변수를 쓰려면 ,member를 써야함(?)
//class = > instance(객체) ex) 자동차설계도(클래스) = > 자동차(인스턴스) / 붕어빵 기계도 동일 원리

public class Test01 {

	public static void main(String[] args) {

//메인 클래스에 메소드는 한개만 됨 ! 중복시 오류가 됨 ~
//클래스명 = 파일명이 메소드를 가지고 있으면됨.

		//AAA a = new AAA(); ///new : 생성자 , 모든 class에는 하나의 생성자가 존재한다.
							//기본생성자함수 =>	class명(고정) instace명(변동) =  new class명() ; ex) Car myCar1 = new Car{} ;
		//도트연산자 : 접근할 때 씀 ex) mycar1.color = "색깔" ;
		//매소드 호출 : 인스턴스이름.메소드이름() ; => ex)myCar1.upSpeed(30);
		//파라미트 = 매개변수
		//자바 처음 실행시, 메인으로 감 ~ 
		//동일 class명이 패키지가 같으면 오류, 다르면 오류가 안남 ! 
		// private 접근 제어수식어 -> 클래스 안의 메소드에서는 접근 가능하지만, 인스턴스를 통해 직접 필드에 접급할 수 없음.
	

		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();

		t1.a = 10 ;
		t2.a =20 ;
		Test01.a = 20;
	}

}
