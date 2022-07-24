package mini.project;

import java.util.Scanner;

public class Sprite {

	Scanner sc = new Scanner(System.in);
	int x, y; // 몬스터 변수 설정
	static int a; // hero 변수 설정
	static int b;
	String move;

	public void monster() {
		x = (int) (Math.random() * 9) - 1;
		y = (int) (Math.random() * 18) - 1;
	}

	public void Hero() {
		System.out.println("주인공의 좌표값을 설정하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	public void Hero(String move) {
		String str;
		System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l):");
		move = sc.next();
		if (move.equals("h")) {
			--a;
		} else if (move.equals("j")) {
			--b;
		} else if (move.equals("k")) {
			++a;
		} else if (move.equals("h")) {
			++b;
		}

	}

} // end of Monster
