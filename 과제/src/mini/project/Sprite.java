package mini.project;

import java.util.Scanner;

public class Sprite {

	Scanner sc = new Scanner(System.in);
	int x, y; // ���� ���� ����
	static int a; // hero ���� ����
	static int b;
	String move;

	public void monster() {
		x = (int) (Math.random() * 9) - 1;
		y = (int) (Math.random() * 18) - 1;
	}

	public void Hero() {
		System.out.println("���ΰ��� ��ǥ���� �����ϼ���.");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	public void Hero(String move) {
		String str;
		System.out.print("����(h), ����(j), �Ʒ���(k), ������(l):");
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
