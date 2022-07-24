package ch04;

public class Ex4_13 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수는 선언만 하는게 아니고 초기화도 해야된다.
		
		for(int i =1; i <= 10; i=i+2)
		{
			sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합:%2d%n",i , sum);
			
		}
	}
	

}
