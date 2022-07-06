package study;
/* �����͸� ��� ����Ұ��� --> �ڵ��� �߿��� ���� 
 *  Member Inner class 
 *  ��ü�� �����ؾ߸� ����� �� �ִ� ������ ���� ��ġ�� ���� �Ǵ� Ŭ���� 
 *  �̳� Ŭ������ ��ü�� �����Ϸ��� �ܺ� Ŭ���� ��ü�� ������ �Ŀ� ������ �� �ִ�.
 *  
 *  �̳� Ŭ���� ���ο��� static�� ���� �� �� ����. 
 *  
 *  Local Inner class 
 *  Ŭ���� ������ Ư�� �޼ҵ� �ȿ� ���� �Ǵ� Ŭ���� - ���������� ���� ������ �Ѵ�. 
 *  �޼ҵ尡 ȣ��ɶ� ������ �� ������ �޼ҵ��� ������� �������� ������ ��������
 *  �� ���� �ڵ����� �Ҹ�ȴ�. 
 *  
 *   �� �� ��������� �ʴ´�.
 *   - Ŭ���� ���ο� Ŭ������ ���� �޼ҵ� ����ÿ��� ����ȴ�. 
 *   class Outer{
 *   	Public void aa(){// Ŭ������ ��� �޼ҵ� 
 *   
 *   class Inner{ // �޼ҵ� �ȿ� ���������� ���� ���� ��ġ 
 *   			}
 *   		}
 *   	}
 */
public class LocalInner {
	
	int a =100; // �ܺ� Ŭ������ ��� ���� Local Inner�� ������� 
	public void innerExam01(int k) { // ��� �޼ҵ� 
		int b =200; // �������� (�޼ҵ� �������� ������)
		final int c =k; // ��� .  �޼ҵ� ȣ���Ҷ� �Ű� ���� ���? 
		class Inner{// ���� �̳� Ŭ���� 
			// ���� �̳� Ŭ������ �ܺ� Ŭ������ ��� ������ ���� ��ġ�� ����
			// ��� ������ ����鸸 ������ �����ϴ�
			public void getData() {
			System.out.println("int a :"+a);
			System.out.println("int b"+b);
			System.out.println("final int c:"+c);
			}
		}// InnerŬ������ ��
		//�޼ҵ� ������ LocalInnerclass �� ��ü ������ �����ϴ�
		Inner i = new Inner();
		// ������ ��ü�� ���ؼ� �޼ҵ带 ȣ���Ѵ�. 
		i.getData();
	}// �޼ҵ��� �� 

	public static void main(String[] args) {
		
		LocalInner li = new LocalInner();
		li.innerExam01(1000);
	}

}
