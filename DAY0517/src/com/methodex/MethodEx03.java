package com.methodex;
/*
 * 여러가지 기능 
 *1.최대수 2. 사이의 합계 3.수열 4.종료  
 *
 *계산기 프로그램 만들어보기~
 */


import java.io.*;
public class MethodEx03 {

	//최대값 구하는 메소드 작성
	public static int aaa()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 수 입력 :");
		int a= Integer.parseInt(br.readLine());
		System.out.println("두번째 수 입력 : ");
		int b= Integer.parseInt(br.readLine());
		//else 생략 가능한지 이해 안됨.
		if (a>b) {
		return  a;
		}else {
		return  b;	
		}
	}
		//return 0 ;
	
	// 두 수 사이의 합계를 구하는 메소드
	public static void bbb()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 수 입력 :");
		int a= Integer.parseInt(br.readLine());
		System.out.println("두번째 수 입력 : ");
		int b= Integer.parseInt(br.readLine());
		
		//누적 변수 선언
		int tot  = 0 ;
		
		if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
		}
		for(int i = a ; i<=b ; i++ ) {
			tot+=i;

		}
		
		System.out.println(a+"~~~"+b+"사이의 합계:"+tot);
		//return ;
		
		//마지막 코딩은 system.out.println()이 들어가면 안됨. return문 뒤에 아무것도 들어가면 안됨 ! 마지막으로 써야함 ~ 
	}// end bbb
	
	//큰 순서대로 나열하는 수열을 구현하는 메소드
	public static String ccc(int x, int y, int z) { //firstSu = x , SecondSu = y , ThirdSu= z
	
		if(y>=x && y>=z) {	// y가 제일 클때
			//swap 공식에 의거해서 두 개의 자리를 바꿔준다.
			int imsi = x ;
			x =  y ;
			y = imsi ;
			
		}else if(z>=x && z>=y) { // z가 제일 클때
			int imsi = x ;
			x =  z ;
			z = imsi ;
		
		}if(z>=y) {	// z와 y 중 큰 것
		
			int imsi = y ;
			y =  z ;
			z = imsi ;	
		
		}
		String abc = x+">="+y+">="+z ;
		return abc;
	}
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0; //메뉴를 입력 받은 변수
		
		while(true) {
			System.out.print("1:최대수 2:사이 합계 3:수열 4:종료");
			x = Integer.parseInt(br.readLine());
			
			if(x==1) { // return 값을 갖는다.
				int k = aaa(); 
				System.out.println("두 수중 최대값은"+k+"입니다");
			}else if(x==2) {//Call by Name(함수의 이름을 호출한다). return값이 없기 때문에 바로 호출 가능.
				 bbb();
			}else if(x==3) { // Call by Value(값의 호출 => 매개변수가 있음) 
				System.out.println("첫번째 수 입력 :");
				int firstSu = Integer.parseInt(br.readLine());
				System.out.println("두번째 수 입력 : ");
				int secondSu = Integer.parseInt(br.readLine());
				System.out.println("세번째 수 입력 : ");
				int thirdSu = Integer.parseInt(br.readLine());
				
				String str =  ccc(firstSu, secondSu, thirdSu);
				System.out.println("큰 순으로 나열은 "+str);
			}else if(x==4) {
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("수고 하셨습니다.");
		

	}

}
