package study;

/*Ŭ���� : 
java�� ������ ��ü���� ���α׷��� ���
public Ŭ������ Ŭ���� ���� ! public�� ���ϸ��� �����ؾ� ���� �� ����.
+) private class�� ���� ������ ����(��� �� Ȱ���� �Ұ�)
���� Ŭ������ �޼ҵ�� �Ѱ��� �� ! 
*/

class AAA{	
	int a ; // Ŭ��������(�Ӽ�) // ��ü�� �����ؾ߸��Ѵ�.
	static int b ;// ��ü�� �������� �ʾƵ� ���ٰ���	
}

//�ڷ��� �տ� static�� �־�� �ٸ� class������ ��밡��.
//static�� ������, instant ��ü�� �־ ����� ���� ����.
//class���� ù���ڴ� �빮��
//��Ģ����(Add,Sub,Mul,Div) class����� -> ex ) class Add{��� +}
//class�� ������ ������ ,member�� �����(?)
//class = > instance(��ü) ex) �ڵ������赵(Ŭ����) = > �ڵ���(�ν��Ͻ�) / �ؾ ��赵 ���� ����

public class Test01 {

	public static void main(String[] args) {

//���� Ŭ������ �޼ҵ�� �Ѱ��� �� ! �ߺ��� ������ �� ~
//Ŭ������ = ���ϸ��� �޼ҵ带 ������ �������.

		//AAA a = new AAA(); ///new : ������ , ��� class���� �ϳ��� �����ڰ� �����Ѵ�.
							//�⺻�������Լ� =>	class��(����) instace��(����) =  new class��() ; ex) Car myCar1 = new Car{} ;
		//��Ʈ������ : ������ �� �� ex) mycar1.color = "����" ;
		//�żҵ� ȣ�� : �ν��Ͻ��̸�.�޼ҵ��̸�() ; => ex)myCar1.upSpeed(30);
		//�Ķ��Ʈ = �Ű�����
		//�ڹ� ó�� �����, �������� �� ~ 
		//���� class���� ��Ű���� ������ ����, �ٸ��� ������ �ȳ� ! 
		// private ���� ������ľ� -> Ŭ���� ���� �޼ҵ忡���� ���� ����������, �ν��Ͻ��� ���� ���� �ʵ忡 ������ �� ����.
	

		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();

		t1.a = 10 ;
		t2.a =20 ;
		Test01.a = 20;
	}

}