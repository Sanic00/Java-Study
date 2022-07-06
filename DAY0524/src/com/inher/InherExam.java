//메소드 => 부모   / 변수 => 자녀

package com.inher;

class SuperExam{

	private int a = 5 ;
	protected int b = 10 ;
	public int c = 20 ;
	
	public void write() {
		System.out.println("super write 메소드 : "+a+":"+b+":"+c);
	}

}
class SubExam extends SuperExam{

	protected int b = 100 ;
	
	public void print() {
		System.out.println("sub print 메소드 : "+super.b+" : "+c); //b는 부모
	}
	
@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("sub write 메소드 : "+b+" : "+c); // b는 자식
	}	
}


public class InherExam {

	public static void main(String[] args) {
		SubExam se = new SubExam();
		se.write();
		se.print();
		
		((SuperExam)se).write(); // 메소드는 항상 자식것을 호출하기 때문에 형태가 부모의 것을 호출하는 것 처럼 보여도 자식의 것을 호출당함.
		System.out.println("se.b : "+se.b);
		System.out.println("se.b : "+((SuperExam)se).b);

	}

}
