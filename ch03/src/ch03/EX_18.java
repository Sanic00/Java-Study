package ch03;

public class EX_18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);		//3.142가 나오지만 int 형이라서 답이 3 뒤에 소수점은 버려짐
		System.out.println((double)Math.round(pi*1000)/1000.0); 
		System.out.println((int)(pi*1000));	// 3141로 만들고 싶을때 일부로 값손실을 내는 int형으로 변환 시킨다.
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);

	}

}
