package study;

public class AccountEx {

	public static void main(String[] args) {
		
		// �ν��Ͻ�(��ü) ����
		Account ac = new Account();//������
		ac.setMoney(10000,"1234");  // �޼ҵ�
		int myPay = ac.getMoney(); //return
		System.out.println("���� �����ܿ�:"+myPay);
	}

}
//getter & setter�� private���� ������ �� ���� ������
//setter�� �̿��ؼ� �� ���� ����
//getter