package mini.project;

import java.util.Scanner;

public class Map extends Sprite {

	Scanner sc = new Scanner(System.in); // ���� Scanner
	String[][] map = new String[10][19]; // ���� ũ�� �迭�� ����

	public void map() { // �� �޼���
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = " ";
			}
		}
		map[5][13] = "G"; // ����� ��ġ����
		Sprite ob = new Sprite(); // ���� Ŭ���� ��ü ����
		map[ob.x][ob.y] = "M"; // ���� ��ġ ����
		map[ob.a][ob.b] = "@"; // ����� ��ġ

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
			if (ob.x < 10 && ob.x < 19) { // ���� �����Լ��� �迭�� ������ ����� �ʱ� ����
				map[ob.a][ob.b] = "@";
				map[ob.x][ob.y] = "M";
			} else {
				map[ob.a][ob.b] = "@";
				map[ob.x][ob.y] = "M";
			}

			if (ob.a == 5 && ob.b == 13) { // ����� ��ġ �� ����� ��ġ�� ���� �Ҷ� �����Ű��
				System.out.println("��带 ������ϴ�.");
				break;
			}

			if (ob.x == ob.a && ob.y == ob.b) { // ������ ��ġ�� ������� ��ġ�� ���Ͻ� ����
				System.out.println("���͸� ��ҽ��ϴ�.");
				break;
			} // ������ ���⼭ �� �̻� ���ϰڽ��ϴ�.. ������ �ڵ� �ؼ� ���ּ���.... ���� ������ �� �����ϴٴ°� �������ϴ�.

		} // and of while
	} // end of void method

}
// end of Map
