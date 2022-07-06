package study;

public class AccountEx {

	public static void main(String[] args) {
		
		// 인스턴스(객체) 생성
		Account ac = new Account();//생성자
		ac.setMoney(10000,"1234");  // 메소드
		int myPay = ac.getMoney(); //return
		System.out.println("현재 나의잔엑:"+myPay);
	}

}
//getter & setter는 private값을 변경할 수 없기 때문에
//setter를 이용해서 그 값을 변경
//getter