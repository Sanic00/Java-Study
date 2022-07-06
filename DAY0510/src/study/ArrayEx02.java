package study;

public class ArrayEx02 {

	public static void main(String[] ar) { // String[] ar << 은 변수 이름이기 때문에 변경해도 됨. (args = > ar로  변경)
		
		for(String s : ar)
			System.out.printf("%3s\n",s);
		System.out.println();
		
		String[] subject = {"국어점수","영어점수","수학점수"};
		for(String ss : subject)
			System.out.printf("%3s\n",ss);
		
		System.out.println();
		String[] score = {"화학점수", "과학점수", "물리점수"} ;
		for(String sss : score)
			System.out.printf("%3s\n",sss);
				
		System.out.println();
		
		char ch[] = new char[4];
		ch[0] = 'J' ;
		ch[1] = 'A' ;
		ch[2] = 'V' ;
		ch[3] = 'A' ;
		char cha[] = {'J','A','V','A'};
		char cha1[] = new char [] {'J','A','V','A'};
		
		for(int i = 0 ; i<ch.length ; i++)
			System.out.println("ch["+i+"]:"+ch[i]);
		System.out.println();
			
		for(int i = 0 ; i<cha.length ; i++)
			System.out.println("cha["+i+"]:"+cha[i]);
		System.out.println();
		
		for(int i = 0 ; i<cha1.length ; i++)
			System.out.println("cha1["+i+"]:"+cha1[i]);

		char cha2[] = char.System.in ;
 		for(int i = 0 ; i<cha2 ; i++)
 			System.out.println(ch2[i]);
	}

}
