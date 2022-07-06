package study;
/*과제~!
(5/3까지 제출)

for문 2개를 이용해서
구구단 단마다 3/3/2로 분할해서 만들기

ex )
2단 3단 4단
5단 6단 7단
8단 9단

+ n값을 이용하여 분할하기
ex) n = 2 / 2개씩 쪼개기 !
n =3 / 3개씩 쪼개기
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
		 				case 2 : case 3 : case 4: // 2단 ,3단 ,4단 일 때 같은 줄 나열
		 				//System.out.printf(case2+case3+case4);
				 		case 5 : case 6 : case 7: // 5단 ,6단 ,7단 일 때 같은 줄 나열
				 		System.out.println();	
				 			//System.out.printf("%2dx%2d=%2d\n",i,j,i*j);
		 				case 8 : case 9 : // 8단 ,9단 일 때 같은 줄 나열.
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


