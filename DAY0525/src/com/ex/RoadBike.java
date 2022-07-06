package com.ex;

//하단 RoadBike 클래스는 구현체가 된다.
public class RoadBike extends AbstractBicycle {

	public static void main(String[] args) {
		RoadBike rb = new RoadBike();
		rb.id = 300;
		rb.brand = "LOOK";
		rb.prtInfo();		
		
	}
	@Override
	void prtInfo() {
		System.out.println("ID : "+id);
		System.out.println("Brand : "+brand);
	}
	
	
}
