package ch04;



public class Ex4_24 {

	public static void main(String[] args) {
	
		int i=11;
		
		System.out.println("ī��Ʈ �ٿ��� �����Ѵ� �̰�.");
		
		while(i--!=0)
		{
			System.out.println(i);
			for(int j=0; j<2_000_000_000; j++) {
				;
			}
		}
			System.out.println("GAME OVER!");
			
			
			
			
	}

}