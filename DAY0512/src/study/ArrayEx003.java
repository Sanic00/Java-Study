package study;
import java.io.*;

//��� avg�� �̿��Ͽ� ������ ���϶�...�ѤФ�


public class ArrayEx003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int kor = 0 , eng = 0 , mat = 0 , sum = 0 ; 
		String []subname = {"��������", "��������", "��������"};
		int[][]sub= new int[3][subname.length+1]; // 0: ���� 1: ���� 2: ����, 3: ����
		float[] avg =  new float[3];
		
		/*
		 * do { System.out.print(subname[0]+":"); sub[0] =
		 * Integer.parseInt(br.readLine()); } while(sub[0] <0 || sub[0] >100);
		 * 
		 * do { System.out.print(subname[1]+":"); sub[1] =
		 * Integer.parseInt(br.readLine()); } while(sub[1] <0 || sub[1] >100);
		 * 
		 */
		
		for(int k =0; k <sub.length;k++) {
		for(int i = 0 ; i<sub[k].length-1 ; i++) {
			do {
		System.out.print(subname[i]+":");
		sub[k][i] = Integer.parseInt(br.readLine());
		} while(sub[k][i] <0 || sub[k][i] >100);
		//����
		sub[k][sub.length-1] +=  sub[k][i] ; // �̰��� �� ���Գ�
		}
		avg[k] = sub[k][sub.length-1] /(float)(sub[k].length-1) ;
		}
		
		System.out.println();
		System.out.println("���� :"+sub[sub.length-1]);
		System.out.println("��� :"+avg);
		

	}

}
