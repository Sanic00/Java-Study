package study;

public class ForExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ABS 절대값 (MATH에서 활용.)
		
		/*
		 * int i,j ; for(i=1;i<=5;i++) { System.out.println(); for(j=1 ; j<=i;j++)
		 * System.out.print(j);}
		 * 
		 * 
		 * //for(i=-1;i>=-5;i--) { //System.out.println(); //for(j=i;j>=-5;j--) { //
		 * System.out.print("a");} //for(j=-1;j>=i;j--) {
		 * //System.out.print(Math.abs(j));}
		 */
	
		int i, j ;
		final int MAX = 5 ;
		
		for (i=0;i<=MAX;i++)
		{
			for(j=MAX ; j>=-MAX ; j--) 
			{
				if(Math.abs(j)>i)System.out.print("");
				else System.out.printf("%d",Math.abs(j));
			}
			System.out.println();
		}
			}
		}
		
		



