package mini.project;

public class Card {
	static String[] CardName = { "'Ŭ�ι�", "'���̾Ƹ��", "'��Ʈ", "'�����̵�" };
	static String[] CardNumber = { "���̽�'", "2'", "3'", "4'", "5'", "6'", "7'", "8'", "9'", "10'", "11'", "12'", "��'",
			"��'", "ŷ'" };

	static void _str_() {

		System.out.print("[");
		for (int i = 0; i < CardName.length; i++) {
			for (int j = 0; j < CardNumber.length; j++) {
				System.out.print(CardName[i] + CardNumber[j]);
				if (i == 0) {
					System.out.print(", ");
				} else if (i == 1) {
					System.out.print(", ");
				} else if (i == 2) {
					System.out.print(", ");
				} else if (i == 3) {
					System.out.print(", ");
				}
			} // intside for��
			System.out.println();
		} // outside of for
		System.out.print("]");
	}// end of Method
}// end of class