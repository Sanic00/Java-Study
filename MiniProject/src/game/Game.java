package game;

import java.util.*;

class Set {
	String key = ""; // 입력받은 방향키
	static int x, y, a, b, c, d; 
	void character(int x, int y) {
		 System.out.println("@");
		x = (int) Math.random() * 17 + 1;
		y = (int) Math.random() * 8 + 1;
	
	String[][]outline = new String [x][y];}//캐릭터의 위치
	// String outline[x][y] = {"@"};

	Void move() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하시오");
		while (true) {
			key = sc.next();

			switch (key) {
			case "h":
				y++;
				if(y<0) y = 0 ; break;

			case "j":
				y--;
				if (y < 0)
					y = 0;
				break;

			case "k":
				x--;
				if (x < 0)
					x = 0;
				break;

			case "i":
				x++;
				if (x < 0)
					x = 0;
				break;
			}
		}
	}

	void monster(int c, int d) {
		System.out.println("M");
		c = (int) Math.random() * 17 + 1;
		d = (int) Math.random() * 8 + 1;
		int[][] outline = new int[c][d];// 몬스터의 위치
	}

	void gold(int a, int b) {
		System.out.println("G");
		int[][] outline = new int[a][b]; // 골드의 위치
	}
}

public class Game {
public static void main(String[] args) {
	Set s = new Set();
	String[][] outline = new String[10][19] ;
	

		for(int i = 0 ; i<outline.length ; i++) {
			System.out.println();
			for(int j = 0 ; j<outline[i].length ;j++) {
				outline[i][j] = "#" ;
				System.out.print(outline[i][j]);}}
				
		for(int i = 1 ; i<outline.length-1 ; i++) {
			System.out.println();
			for(int j = 1 ; j<outline[i].length-1 ;j++) {
				outline[i][j] = "s" ;
				System.out.print(outline[i][j]);

			}}

System.out.println();
s.gold(3,5);
s.monster(2,3);
s.character(1, 2);
s.move();
}
}