package ch05;

public class Ex7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 10);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
		for (int i = 0; i < numArr.length; i++)
			System.out.println(numArr[i]);
	}

}
