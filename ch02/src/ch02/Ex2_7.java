package ch02;

public class Ex2_7 {

	public static void main(String[] args) {
		char ch ='A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '°¡';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		

	}

}
