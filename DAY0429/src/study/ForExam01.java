package study;

public class ForExam01 {
//�ڵ��Ҷ� ������ � �ʿ����� ���� ����~
	
	public static void main(String[] args) {

		// ���� ����
		int i , j ; //i : �� , j :���ο��� 1~9���� �ݺ�ó��
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