package com.inher.ec;

public class ECar {
	
	private int batteryPercentage = 100;
	private int distance  = 0;
	
	
	public static ECar getInstance() {
		//객체 반환
		ECar car = new ECar();
		return car ;
		//return new ECar(); //객체 리턴
 	}
	
	public void dispDistance(){
		System.out.println(distance+"킬로미터 주행...");
	}

	public void dispBattery(){
		if(this.batteryPercentage==0) {
			System.out.println("배터리가 동이 났습니다. 충전하세요.");
			return ;
		}
		System.out.println("Battery : "+batteryPercentage);
	}

	public void drive(){
		if(this.batteryPercentage!=0) {
			this.distance +=1 ;
			this.batteryPercentage -= 10;
		}
	}

	public static void main(String[] args) {
		//ECar car = new ECar();
		ECar car = ECar.getInstance() ;
		
		car.drive();
		car.drive();
		car.drive();
		
		car.dispDistance();
		car.dispBattery();
	
	}

}
