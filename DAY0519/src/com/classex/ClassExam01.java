package com.classex;

import java.io.*;

public class ClassExam01 {

	public static void main(String[] args) throws IOException{ // 버퍼드리드 사용시 클래스 옆에 throws IOException을 안 넣을시 오류가 날수도 있으니 주의해야함!

		ClassExam ce = new ClassExam();
		ce.setName();
		ce.setJumin();
		ce.Display();
	}

}
