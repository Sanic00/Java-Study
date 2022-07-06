package com.ex1;

import java.util.*;

public class Sunglmpl implements Sung {
	
	Scanner sc = new Scanner(System.in);
	int in; //인원
	Record re[]; //객체 배열
	
	
	@Override
	public void set() { //인원수 입력받는 기능
		do {
			System.out.print("인원 수 입력(1~100) : ");
			in = sc.nextInt();
		}while(in<1||in>100);
		re = new Record[in];
		
			}

	@Override
	public void input() { //학번, 이름, 과목별 점수 입력기능, 판정.
		
	
		//String [] title = {"국어점수:","영어점수","수학점수"};
		
		for(int i = 0 ; i<re.length ; i++) {
			
			re[i] = new Record(); //re = new Record[in]; 에 대한 배열 생성
			System.out.printf("%d번째 학생의 학번 이름을 입력(공백구분) : ",(i+1));
			re[i].number =sc.nextInt();
			re[i].name = sc.next();
			
			
			System.out.printf("국어  영어  수학  점수  입력(공백 구분):");
			re[i].sco[0] = sc.nextInt();//국어 점수
			re[i].sco[1] = sc.nextInt();//영어 점수
			re[i].sco[2] = sc.nextInt();//수학 점수
			
			
			//각 과목별 판정 : 수:90점이상, 우:80점이상, 미:70점이상, 양:60점이상, 가:60점 이하(0~59)
			for(int j = 0 ; j <re[i].sco.length ; j++) {
				if(re[i].sco[j] >=90) 
					re[i].scor[j]="수";
					else if( re[i].sco[j]>=80)
						re[i].scor[j]="우";
					else if( re[i].sco[j]>=70)
						re[i].scor[j]="미";
					else if( re[i].sco[j]>=60)
						re[i].scor[j]="양";
					else 
						re[i].scor[j]="가";
			}// end for
			
			// 총점 
			re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2];
			// 평균
			re[i].avg =re[i].sum/3;
								
						
			}
			
		}

	@Override
	public void print() { //결과 출력 
		
		
		for(int i = 0 ; i<re.length ; i++) {
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d\n",
				re[i].number,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],
				re[i].sum,re[i].avg);
			System.out.printf("\t\t\t %s %s %s\n",re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
		
		
//	System.out.println("=============학 생 성 적 표 ===============");
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



