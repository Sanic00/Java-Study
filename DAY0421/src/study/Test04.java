package study;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*������ ������ �ݾ��� �Է¹޾� ��������, ������,õ����,�����
		 * ���¥������ ���ʿ�¥�� ���� �ʿ�¥�� ���� �Ͽ�¥�� ���� �� ��� ��ȯ�Ǵ���
		 * ����ϴ� ���α׷��� �����Ͻÿ� 
		 * �ݾ��� �Է��ϼ��� 
		 * �Է±ݾ�  : 65376
		*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int a= sc.nextInt();
		int ohman,man,chun,ohbak,bak,ohship,ship,il,b;
		ohman=a/50000;
		b=a%50000;
		man=b/10000;
		b=b%10000;
		chun=b/1000;
		b=b%1000;
		ohbak=b/500;
		b=b%500;
		bak=b/100;
		b=b%100;
		ohship=b/50;
		b=b%50;
		ship=b/10;
		b=b%10;
		il=b/1;
		
		System.out.println
		(ohman+","+man+","+chun+","+ohbak+","+bak+","+ohship+","+ship+","+il);
		
		
	}	

}
