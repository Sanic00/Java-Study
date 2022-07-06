package com.classex;
import java.io.*;
public class Banking {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Account na = new Account("홍길동"); // 예금주 이름은 홍길동
		
		String strWork ; 
		
		do {
			System.out.println("\n 작업을 선택하세요");
			System.out.println("=====================================");
			System.out.println("입        금 =======================> 1");
			System.out.println("출        금 =======================> 2");
			System.out.println("잔  액 확  인 =======================> 3");
			System.out.println("종        료 =======================> 0");
			System.out.println("=====================================");
				
			System.out.print("작업 내용을 선택하세요 : ");
			strWork = br.readLine();

			
			int switchInt = 0 ;
			
			if(strWork != null) { // null이 아닐 때, 메뉴가 선택 되었을 경우.
				switchInt = Integer.parseInt(strWork);//문자형을 숫자형으로 변환.
				
			}else { //null일 때, 메뉴가 선택되지 않았을 경우.
				System.out.println("작업 내용을 입력하지 않으셨습니다.");
				System.exit(0);
			}
			
			
			switch (switchInt) {
				
				case 0 :
					System.out.println("프로그램을 종료 합니다.");	
					break;
				case 1 : //입금
					System.out.println("\n===========================");
					System.out.print("입금하실 금액을 입력하세요.");
					String strdepositIn = br.readLine();
					long depositLong = Long.parseLong(strdepositIn); //
					na.deposit(depositLong);
					break ;
					
					
				case 2 : //출금
					System.out.println("\n===========================");
					System.out.print("출금하실 금액을 입력하세요.");
					String strwithdrawIn = br.readLine();
					long withdrawLong = Long.parseLong(strwithdrawIn); //
					na.withdraw(withdrawLong);
					break ;
				
				case 3 : //잔고확인
					System.out.println(na.getName()+"님의 잔고는 "+na.getBalance()+"원 입니다");
				break;
				
				
				default : 
					System.out.println("0 ~ 3 사이 숫자를 입력하세요.\n");
					break ; //break문은 생략가능.
			}
			
			
			
		}while (!strWork.equals("0"));//0이 아닐때 사용
		
		
		
		
		
		
	}

}
