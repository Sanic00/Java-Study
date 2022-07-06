package study;

//Arrays.toString()
//toString () : 배열의 모든 요소[첫번째요소,~]와 같은 형식을 문자열 형식으로 만들어서 반환함.
import java.util.*;
 
//이 class에는 Stirng, Int, Char 포함하여 배열이 총 6개다.
public class ArrayEx02 {

	
	
	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr4 = {100,95,80,70,60};
		char[] chArr =  {'a', 'b', 'c', 'd'};
		
		
		//iArr1의 배열에 1~10까지 순서대로 저장함.
	for(int i =0 ; i<iArr1.length ; i++) {
		iArr1[i] = i+1  ;  // i++ 라고 할때는 값이 달라짐. 아직 원인은 모르곘음.
		System.out.print(iArr1[i]+"\t");
	}
	System.out.println();
	for(int i = 0 ; i< iArr2.length ; i++ ) {
		
		iArr2[i] = (int)(Math.random()*10)+1;
		System.out.print(iArr2[i]+"\t");
	}
	System.out.println();
	for(int i =0 ; i<iArr3.length ; i++) {
		System.out.print(iArr3[i]+"\t");
	}
	System.out.println();
	for(int i =0 ; i<iArr4.length ; i++) {
		System.out.print(iArr4[i]+"\t");
	}
	System.out.println();
	System.out.println(Arrays.toString(iArr2)); // 배열을 표시하면서 [] 쳐지면서 뽑힘
	System.out.println(Arrays.toString(iArr3)); 
	System.out.println(Arrays.toString(chArr)); 
	System.out.println(chArr); 
	
	
	
	
	
	
	
	
	
	
	}

}
