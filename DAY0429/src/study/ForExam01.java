package study;

public class ForExam01 {
//코딩할때 변수가 몇개 필요할지 먼저 설정~
	
	public static void main(String[] args) {

		// 변수 선언
		int i , j ; //i : 단 , j :내부에서 1~9까지 반복처리
		//int k =1 ;
		
/*//		for (i=1 ; i<=4 ;i++) {
//			for(j=1;j<=4;j++) {
//			//	System.out.printf("%d x %d = %d", i,j,i*j);
//				System.out.print(k++);
//			}
//			System.out.println();
//		}
*/		
	
	for (i=2 ; i<=9 ;i++) {
	for(j=1;j<=9;j++) {
		System.out.printf("%2d x %2d = %2d\t", j,i,i*j);	
	}
	System.out.println();

	}
}
}