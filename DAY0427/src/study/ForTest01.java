package study;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0 ;
		int even = 0, odd =0;
		
		System.out.println("for���� ���");
		
		
		for(i=1;i<=10;i++) 
		{
		if (i%2==0) { // ¦���϶�
		//if(i%2!=0){// Ȧ���϶�
			even = even + i ;
		//System.out.println(i+","+even);
		}else {
			odd = odd + i ;
		//System.out.println(i+","+odd);
	
		//	continue ;}
		}
		
	}
	System.out.println("¦���� �հ� : "+even);
	System.out.println("Ȧ���� �հ� : "+odd);
	sum = even + odd ;
	System.out.println("���հ� : "+sum);

	}
+}
