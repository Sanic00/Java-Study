package com.study;

public class OverRoadingTest2 {
	public int area(int w,int h) {
		return w*h;
	}
	public double area(int r) {
		return (double)r*r*3.141592;
	} // ���� �ε�
	public void write(int result) {
		System.out.println("�簢���� ���̴�:" +result);	
	}
	public void write(double result) {
		System.out.println("���� ���̴�:" +result);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRoadingTest2 ot = new OverRoadingTest2();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		ot.write(res);
		ot.write(cc);
		
	}

}
