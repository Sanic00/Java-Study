package study;

import java.io.*;
public class ArrayEx05 {
/*
 * ��]
 * �迭�� �̿��Ͽ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
 * 
 * ���� ��, ���� ��
 * �̸��� �Է�
 * 
 * �̸�, �����, ����, ���, ����
 * 
 */

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		/*if(ar.length==0) {
			System.out.println("���� ���� �����ϴ�.");
			System.exit(0);
		} *///ar.length : �����
		//�̸� �Է� ����.
		String name = br.readLine();
		//String[]subject = new String[ar.length];
		String [] subject = {"����","����","����"};
		/*
		for(int i =0 ; i<ar.length ; i++) { //Ŀ�ǵ� �迭 ���� �־���
			//subject[i] = ar[i];
			System.out.print(subject[i]+" ");
		}
		*/
		int jumsu[] = new int[subject.length+1]; //������ �����ϱ� ���� ���� 
		
		for(int i =0 ; i<subject.length ;i ++) { // ���� ���� ����
			System.out.print(subject[i]+"����:");
			jumsu [i] = Integer.parseInt(br.readLine()); // ���� �Է¹���.
			//������
			
			jumsu[jumsu.length-1] += jumsu[i];
			//System.out.println("����:"+jumsu[jumsu.length-1]);
		}
		
		float avg = jumsu[jumsu.length-1]/(float)subject.length;
		//�Ҽ��� 3�ڸ����� �ݿø� �ݿ�
		avg =(int)((avg+0.005)*100) / 100.f;
		
		//int�� �ʿ��� ���� ã�ƶ� ???
	
		char grade = 0;
		
		switch((int)avg/10) {
		case 10:  
		case 9 :grade = 'A' ; break;
		case 8:grade = 'B' ; break;
		case 7 :grade = 'C' ; break;
		case 6:grade = 'D' ; break;
		default :grade = 'F' ; break;	
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("--------"+name+"���� ��  ��  ǥ---------------------");
		System.out.println("----------------------------------------------");
		
	}	
		
	}

