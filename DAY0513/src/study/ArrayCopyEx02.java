package study;

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		
		int []arr = new int[5];
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = i+1 ;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("변경전 ... arr.length :"+arr.length);
		
		int[]temp = new int [arr.length*2] ;
		System.out.println("temp.length:"+temp.length);
		
		//for문을 이용하여 arr배열에 저장된 값을 temp 배열에 복사
		for(int i = 0 ;i<arr.length ; i++) {
			temp[i] = arr[i];
			System.out.print(temp[i]+"\t");
		}
			arr = temp ;  
			System.out.println();
			System.out.println("변경후 ...arr.length:"+arr.length);
			System.out.println();
			for(int i = 0 ; i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
		
		
		
		
		//하단은 내가 만든 식
//		System.arraycopy(arr, 0, temp, 5, arr.length);
//		
//		for(int temp2 : temp)
//			System.out.print(temp2);
//		
	}

}
