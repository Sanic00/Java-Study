package study;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		
		//2차원 배열의 선언과 초기화
		//방법 1
		int [][]arr1 = new int [3][3] ; // 자바는 기본적으로 1차원만 관리하기 때문에 행만 잡아줘도 오류가 나지않는다. / 배열의 크기 = 행(row)*열(column)

		arr1[0][0] = 1 ;
		arr1[0][1] = 2 ;
		arr1[0][2] = 3 ;
		
	
		//방법 2
		int [][]arr2 = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9} // 마지막에는 콤마가 붙지 않는다
	};

		int [][]arr3 = new int [5][5] ;
		int n = 1 ;
		
		for (int i = 0 ; i <arr3.length ; i++) {
			for(int j = 0 ; j<arr3[i].length ; j++){ 
				arr3[i][j] = n ;
				n++ ; 
			}
			n=i+2; // 왜 ㅑ+1이 아니라 i+2인지 ..
		System.out.println();
				
		}
		
		
		
		//출력
		for (int i = 0 ; i <arr3.length ; i++) {
			for(int j = 0 ; j<arr3[i].length ; j++){ //열을 가져갈 때는 행을 가져가야함.
				System.out.printf("%2d",arr3[i][j]);
			}
		System.out.println();
		n=i+2;				
		}
	}

}
