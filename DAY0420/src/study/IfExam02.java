package study;

/*
 * ��) ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ�������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *��, ���ǻ��׿����ڸ� �̿��Ͽ� ó���Ͻÿ�. 
 */
import java.util.Scanner ;
public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
			
		int a ; //����ڷκ��� �Է¹޴� ����
		String b ; // Ȧ������ ¦������ �Ǻ��ϴ� ����
		
		System.out.println("�Է��� ������ ? : "); // �ȳ��޽��� �� �Է¹��� ���� ����
		a = sc.nextInt();
				
		b = a%2==0? "¦��" : "Ȧ��" ;
		//if(a%2==0) a ="¦��" ; else a="Ȧ��" ; // ���׿����ڸ� if�� ��ȯ������ !
	
		System.out.println("�Է��� ������ "+b+"�Դϴ�");
	}

}
