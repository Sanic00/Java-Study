package card;

class Deck {
	String deck; // = new String[52] ; // 값을 담을 저장공간//static String [] deck = new String [52];
	String[] shape = { "클럽", "다이아몬드", "하트", "스페이드" };
	String[] number = { "에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹" };

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
//값이 출력이 안됨.