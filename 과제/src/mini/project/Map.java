package mini.project;

import java.util.Scanner;

public class Map extends Sprite {

	Scanner sc = new Scanner(System.in); // 전역 Scanner
	String[][] map = new String[10][19]; // 멥의 크기 배열로 설정

	public void map() { // 맵 메서드
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = " ";
			}
		}
		map[5][13] = "G"; // 골드의 위치고정
		Sprite ob = new Sprite(); // 몬스터 클래스 객체 생성
		map[ob.x][ob.y] = "M"; // 몬스터 위치 랜덤
		map[ob.a][ob.b] = "@"; // 히어로 위치

		while (true) {
			System.out.print("#####################\n");
			for (int i = 0; i < map.length; i++) {
				System.out.print("#");
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.print("#\n");

			}
			System.out.print("#####################\n");
			Hero(move);
			if (ob.x < 10 && ob.x < 19) { // 몬스터 랜덤함수가 배열의 범위를 벗어나지 않기 위해
				map[ob.a][ob.b] = "@";
				map[ob.x][ob.y] = "M";
			} else {
				map[ob.a][ob.b] = "@";
				map[ob.x][ob.y] = "M";
			}

			if (ob.a == 5 && ob.b == 13) { // 히어로 위치 와 골드의 위치가 동일 할때 종료시키게
				System.out.println("골드를 얻었습니다.");
				break;
			}

			if (ob.x == ob.a && ob.y == ob.b) { // 몬스터의 위치와 히어로의 위치가 동일시 종료
				System.out.println("몬스터를 잡았습니다.");
				break;
			} // 선생님 여기서 더 이상 못하겠습니다.. 수업때 코드 해설 해주세요.... 저의 복습이 더 부족하다는걸 느꼇습니다.

		} // and of while
	} // end of void method

}
// end of Map
