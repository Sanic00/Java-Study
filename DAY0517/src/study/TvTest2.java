package study;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); 
		Tv t2 = new Tv(); 
		
		
		System.out.println("t1의 현재 채널 값은"+t1.channel+"번 이다.");
		System.out.println("t1의 현재 채널 값은"+t2.channel+"번 이다.");		
		
		t2 = t1 ; //
		//t1이 저장하고 있는 주소값을 t2에 저장한다.(효율적인 코딩) ? / t1은 참조변수
		
		t1.channel = 7 ;
		System.out.println("t1의 현재 채널 값은 7번으로 변경 되었음");
		System.out.println("t2의 현재 채널 값은"+t2.channel+"번 이다.");
			
	}

}
