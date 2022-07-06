package study;
/*
 * 문]
 * while문을 이용하여 구구단을 출력하시오.
 */
public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*int i=2 , j ;
		while (i<=9) {
		j=1;	// j값 초기화가 제일 중요하다 !!!!!
		while (j<=9) {		
			System.out.printf("%dx%d=%d\n",i,j,i*j) ;
			j++ ;
		}
		System.out.println();
		i++ ;
	}*/
		
		
	int i =2 , j ;
	do { 
		System.out.print();
	i++ ;}
	while (i<=9);
	
	int j =1 ;
	do { 
		System.out.printf("%dx%d=%d\n",i,j,i*j) ;
	j++ ;}
	while (j<=9);
	
	}
}
