package com.test;

import java.util.*;

public class Test04 {
	/*
	 * 문] 컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듦. 사용자가 먼저 3가지 중 하나를 입력하고 실행함 컴퓨터는 랜덤으로 하나를 선택하여
	 * 사용자와 비교함 누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료함.
	 * 
	 * 문자열 배열 선언 String [] str = {"가위","바위","보"};
	 * 
	 * 컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 int n = (int)(Math.random()*3);
	 * 
	 * 컴퓨터가 낸 것이 바위 인지 비교 if(str[n].equals("바
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = (int) (Math.random() * 3);
		String[] str = { "가위", "바위", "보" };
		String com = " ";
		String user = " ";
		// 컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는

		// String[i]str =

//		int i = 0 ;
		while (true) {
			System.out.println("가위,바위,보 중 하나를 입력하세요");
			user = sc.next();
			// i++;
			if (str.equals("바위")) {
				com = "바위";
				//user = "가위";
				System.out.println("com:" + com + " ,user:" + user + " com: " + com + " 이겼습니다");
			}

			else if (str.equals("바위")) {
				//user = "바위";
				com = "바위 ";
				System.out.println("com:" + com + " ,user:" + user + "   비겼습니다.");
				;
			}

			else if (str.equals("바위")) {
				com = "가위";
				//user = "바위";
				System.out.println("com:" + com + " ,user:" + user + "user : " + user + "가 이겼습니다.");
			}

			 if (str.equals("가위")) {
				com = "가위";
				//user = "보";
				System.out.println("com:" + com + " ,user:" + user + "com: " + com + "가 이겼습니다");
			}

			else if (str.equals("가위")) {
				user = com;
				System.out.println("com:" + com + " ,user:" + user + "   비겼습니다.");
			}

			else if (str.equals("가위")) {
				com = "보";
			//	user = "가위";
				System.out.println("com:" + com + " ,user:" + user + " user: " + user + "가 이겼습니다.");
			}

			 if (str.equals("보")) {
				com = "보";
			//	user = "바위";
				System.out.println("com:" + com + " ,user:" + user + "com : " + com + "가 이겼습니다");
			}

			else if (str.equals("보")) {
				user = com;
				System.out.println("com:" + com + " ,user:" + user + "   비겼습니다.");
			}

			else if (str.equals("보")) {
				com = "바위";
				//user = "보";
				System.out.println("com:" + com + " ,user:" + user + " user: " + user + "가 이겼습니다.");
			}

			System.out.println("계속 게임을 진행 하시겠습니까(y/n)");
			if (sc.next().equals("n"))
				break;
		}

	}

}
