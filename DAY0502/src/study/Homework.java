package study;
/*����~!
(5/3���� ����)

for�� 2���� �̿��ؼ�
������ �ܸ��� 3/3/2�� �����ؼ� �����

ex )
2�� 3�� 4��
5�� 6�� 7��
8�� 9��

+ n���� �̿��Ͽ� �����ϱ�
ex) n = 2 / 2���� �ɰ��� !
n =3 / 3���� �ɰ���
 */
public class Homework {

	public static void main(String[] args) {
		
		 		int i,j,kok;
		 		kok = 0;

		 		//int count = 1;

		 		for (i=2 ; i<=9 ;i++) {
		 			System.out.println();
		 			for(j=1 ; j<=9 ; j++) {
		 				System.out.println();
		 				switch(i) {
		 				case 2 : case 3 : case 4: // 2�� ,3�� ,4�� �� �� ���� �� ����
		 				//System.out.printf(case2+case3+case4);
				 		case 5 : case 6 : case 7: // 5�� ,6�� ,7�� �� �� ���� �� ����
				 		System.out.println();	
				 			//System.out.printf("%2dx%2d=%2d\n",i,j,i*j);
		 				case 8 : case 9 : // 8�� ,9�� �� �� ���� �� ����.
		 				//	System.out.printf("%2dx%2d=%2d\n",i,j,i*j);
		 				}	
		 					kok = i*j ;
		 					System.out.println(i+"x"+j+"="+kok);
		 				//System.out.printf("%2dx%2d=%2d%c",i,j,i*j,(count%3!=0)? ' ' : '\n');
		 				
		 		}
		 	}
	}}
/*
 * int i,j,sum ; sum = 0 ; for (i=2 ; i<=9 ;i++) { for(j=1 ; j<=9 ; j++) sum =
 * i*j System.out.println();
 */


