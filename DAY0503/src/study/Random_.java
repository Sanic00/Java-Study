package study;
/*
������ ī�� ���� ���ߴ� ����

0���� ���� 99���� ������ ���� ���� ī�带 ���� �����
�� ī�� ���� ���ߴ� ������.
ī����Ǽ��� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ�
�� ���� �ٽ� 70�� �Է��ϸ� �� ���� ��� ������ ������ �������鼭
������ ���ߴ� ����.
������ �ݺ��ϱ� ���� y/n�� ���� , n�� ���� ������.

��ǻ�Ͱ� ���� ���� ���Ƿ� �����ϱ� ���� Random Ŭ������ �����.
Random Ŭ���� ������ 
1.import java.util.*;
2. Random r =new Random();(main()�޼ҵ� �ȿ� �ۼ�)
int i = r.nextInt(100): �� �ǹ̴� 0~99������ ������ ������ ����
 */

import java.util.*;
public class Random_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r =  new Random();
		
		//��������
		// low, high, card
		int low,high,card ;
		
		//y/n  ���ڿ��� ������ ������ �ݺ����� ���θ� ���� 
		while (true) {
			int i = 0 ;//������� ���� Ƚ��
			low = 0 ;//ī�� ���� �ּ� ����
			high = 99 ; // ī�� ���� �ִ� ����
			
			// 0�� 99 ������ ����(����) ���� ����(���谪)
			card = r.nextInt(100);
			System.out.println("������ �ִ� ī�� ���� ���߾� ������.");
			
			while(true) {
				System.out.println("�Է��Ͻ� �� �ִ� ���� ����"+low+"~~"+high);
				
				int n = 0;
				n = sc.nextInt();// ���� �Է¹���.
				//�Է��� ���� ������ ��� ���� �������� ��� ����.
				if(n>high||n<low) { // ���� ������ ��� ��� 
					System.out.println("�Է��ϴ� ���� ������ �ʰ��ϼ̽��ϴ�.");
				}else {		//���� �������� ���
					if(n==card) {
						System.out.println("���߼̽��ϴ�. ���ϵ帳�ϴ�.");
						break;
					}else if(n>card) { // �Էµ� ���� ������ ī�尪���� ū ���
						System.out.println("�� ���� ���� �Է��Ͻÿ�.");
						high = n;
					}else { // �Էµ� ���� ������ ī�尪���� ���� ���
						System.out.println("�� ū ���� �Է��Ͻÿ�.");
						low = n ;
					}			
				}
				i++; //���� Ƚ�� ����				
			}//���� end while
			System.out.println("��� ������ ���� �Ͻðڽ��ϱ�(y/n)");
			if(sc.next().equals("n"))
				break;				
		}//�ٱ��� end while

}
}