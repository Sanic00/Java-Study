package com.ex1;

import java.util.*;

public class Sunglmpl implements Sung {
	
	Scanner sc = new Scanner(System.in);
	int in; //�ο�
	Record re[]; //��ü �迭
	
	
	@Override
	public void set() { //�ο��� �Է¹޴� ���
		do {
			System.out.print("�ο� �� �Է�(1~100) : ");
			in = sc.nextInt();
		}while(in<1||in>100);
		re = new Record[in];
		
			}

	@Override
	public void input() { //�й�, �̸�, ���� ���� �Է±��, ����.
		
	
		//String [] title = {"��������:","��������","��������"};
		
		for(int i = 0 ; i<re.length ; i++) {
			
			re[i] = new Record(); //re = new Record[in]; �� ���� �迭 ����
			System.out.printf("%d��° �л��� �й� �̸��� �Է�(���鱸��) : ",(i+1));
			re[i].number =sc.nextInt();
			re[i].name = sc.next();
			
			
			System.out.printf("����  ����  ����  ����  �Է�(���� ����):");
			re[i].sco[0] = sc.nextInt();//���� ����
			re[i].sco[1] = sc.nextInt();//���� ����
			re[i].sco[2] = sc.nextInt();//���� ����
			
			
			//�� ���� ���� : ��:90���̻�, ��:80���̻�, ��:70���̻�, ��:60���̻�, ��:60�� ����(0~59)
			for(int j = 0 ; j <re[i].sco.length ; j++) {
				if(re[i].sco[j] >=90) 
					re[i].scor[j]="��";
					else if( re[i].sco[j]>=80)
						re[i].scor[j]="��";
					else if( re[i].sco[j]>=70)
						re[i].scor[j]="��";
					else if( re[i].sco[j]>=60)
						re[i].scor[j]="��";
					else 
						re[i].scor[j]="��";
			}// end for
			
			// ���� 
			re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2];
			// ���
			re[i].avg =re[i].sum/3;
								
						
			}
			
		}

	@Override
	public void print() { //��� ��� 
		
		
		for(int i = 0 ; i<re.length ; i++) {
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d\n",
				re[i].number,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],
				re[i].sum,re[i].avg);
			System.out.printf("\t\t\t %s %s %s\n",re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
		
		
//	System.out.println("=============�� �� �� �� ǥ ===============");
//	for(int i =0 ;i<in ; i++) {
//		System.out.printf("%d %s",re[i].number,re[i].name);
//		for(int j = 0 ; j<3 ; j++ ) {
//			System.out.printf("%5d",re[i].sco[j]);
//			System.out.printf("%5d %5d",re[i].sum,re[i].avg);
//			System.out.println();
//		}
//		System.out.println("========================================");
	}
	
			
	}



