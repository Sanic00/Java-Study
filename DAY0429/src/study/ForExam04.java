package study;

public class ForExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i , j ;
	String c = "" ;
	+ 
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			c=	(i==j)? "("+i+","+j+")" : " " ; // 삼항 연산자로 나타날때
	System.out.print(c);	}
	}
	System.out.println();
	}
	
}

/*
 * if(i==j) {System.out.printf("(%d,%d)",i,j);} else {System.out.printf(" ");}
 */
	//공백을 표현해주는식: System.out.printf("(%c)", ' ')
			
		