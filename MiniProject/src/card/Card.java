package card;

class Deck {
	String deck; // = new String[52] ; // ���� ���� �������//static String [] deck = new String [52];
	String[] shape = { "Ŭ��", "���̾Ƹ��", "��Ʈ", "�����̵�" };
	String[] number = { "���̽�", "2", "3", "4", "5", "6", "7", "8", "9", "10", "��", "��", "ŷ" };

	public void card() {
		System.out.print("[");
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < number.length; j++) {
				deck = shape[i] + number[j] + ",";
				System.out.print(deck);

			}
			System.out.println();
		}
		System.out.println("]");
	}

}

public class Card {
	public void main(String[] args) {
		Deck d = new Deck();
		d.card();
	}
}

//			for(int i =0 ; i<c.shape.length ; i++ ) {
//			for(int j = 0 ; j<c.number.length ; j ++) {
//				System.out.println(c.deck[i*j]);}

//		Public String toString() {
//			return shape + " " + number;			
//���� ����� �ȵ�.