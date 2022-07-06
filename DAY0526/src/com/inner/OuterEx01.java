package com.inner;

public class OuterEx01 { //외부

	
	public static class InnerEx01{ //내부 ( static class)
	
		static int x =  10;
		//main method를 내부 class안에 배치
		public static void main(String[] args) { // static method)
			OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
			
			//3개 다 동일한 값 결과로 나옴.
			System.out.println("oi : "+oi.x);
			System.out.println("ot : "+x);
			System.out.println("ot : "+OuterEx01.InnerEx01.x);
		}
	
	}
	
}
