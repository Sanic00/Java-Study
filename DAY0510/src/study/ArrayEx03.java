package study;

/* [char] �ڷ��� �迭�� ���ĺ� �빮�ڸ� ä���,
 * ä���� �迭�� ��ü ��Ҹ� ���
 * 
 * 
 * 	��, char �ڷ����� �迭�� �ʱ�ȭ�� �ݺ����� �̿���.
 * 
 */



public class ArrayEx03 {

	public static void main(String[] args) {
//���ĺ� �빮�� ����
		//1.
		/*
		char aa[] = new char[26] ;
		aa [0] = 'A' ;
		aa [1] = 'B' ;
		
		aa [25] = 'Z' ;
		*/
		
		//2.3[
		//char aa[] =  {'A','B','C','Z'};
		
		//3.
		char aa[] = new char[26];
		for (int i =0, b=65 ; i<aa.length ; i++,b++) { // A : 65 , a :97 ( ���ĺ� ���ڴ� 26�� => �ƽ�Ű�ڵ尪 �̿�)
		aa[i] = (char)b;
		System.out.printf("%c",aa[i]);
	}
	
		System.out.println();
		
		char[] arpha = new char [26];
		for(int i = 0 ;  i< arpha.length ; i++) {
			arpha[i] = (char)('a'+i);
			System.out.print(arpha[i]+"");
		}
		
		
		
		
		
	}

}
