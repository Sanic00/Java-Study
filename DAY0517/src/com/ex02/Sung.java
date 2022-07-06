package com.ex02;

/*Sung 클래스
 * 	-인원수를 입력받아, 입력받은 인수 만큼 이름, 국어, 영어, 수학점수를 입력 받고
 * 	 총점과 평균, 석차를 구하는 프로그램을 작성하시오.  (클래스 설계)
 * 
 * 	속성 : 인원수, Record 배열
 * 	기능 : 1. 인원수 입력하는 기능
 * 		  2. 상세 데이터 입력하는 기능
 * 		  3. 연산 처리하는 기능
 *		  4. 결과를 출력하는 기능
 */

import java.util.*;

public class Sung {
	
	//주요변수 선언(속성)
	int inwon ; //인원수
	Record [] rec ;// Record[] 배열
	int rank ;
	
	//기능 (메소드)
	//1. 인원수 입력
	public void set() {

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("인원 수 입력(1~100):");
			inwon = sc.nextInt();
		} while(inwon<1 || inwon>100);
		
		
		//Record 클래스의 배열 변수를 inwon만큼 생성.
		//Record 클래스의 인스턴스를 생성한 것은 아니다.
		
		rec = new Record[inwon];			
	}
	
	//2. 상세 데이터 입력 및 연산 처리하는 기능
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		String[] title = {"국어점수:", "영어점수:", "수학점수:"};
		
		for(int i=0 ; i<inwon ; i++) {
			//인스턴스 생성(*****)
			 rec[i] = new Record();
			 
			 System.out.print((i+1)+"번째 이름 입력:");
			 rec[i].name = sc.next();
			 //next()와 nextLine()의 차이점은 ?
			 //next() : 토근단위로 입력값 인식 (하나의 토근만 인식) => 띄어쓰기와 같은 공백이나 (,/-) 같은 기호로도 다 분류.
			 //nextLine() : 줄라인 입력값 모두 인식
			 
			 for(int j=0 ; j<title.length ; j++) { // 과목 
				 
				 // 안내 메시지 출력
				 System.out.print(title[j]);
				
				 // 입력받은 점수를 score 배열에 저장한다.
				 rec[i].score[j] = sc.nextInt();
				 
				 //정수를 반복적으로 입력받아 총점을 누적시켜 총점을 구한다.
				 rec[i].tot += rec[i].score[j] ;
				 
			 }
			 	rec[i].avg = rec[i].tot/3.0;
			 	rec[i].rank = 1 ;
		
		}	
	}

	public void display() {
		ranking();
		System.out.println("======= 학생 성적표 =======");
		//System.out.println("이름  국어   영어   수학  총합  평균");
		for(int i=0 ; i<inwon ; i++) {
			//이름 출력
			System.out.printf("%8s",rec[i].name);
			//국어,영어,수학점수를 반복 출력
			for(int j=0 ; j<3 ; j++) {
				 System.out.printf("%5d",rec[i].score[j]);
				//총점, 평균 출력
			System.out.printf("%7d %10.2f %2d",rec[i].tot,rec[i].avg,rec[i].rank);
				System.out.println();
			}	
			System.out.println("======================");
			}}
		

//석차 계산 매소드 추가
	public void ranking() {
		int i, j ;
		
		//모든 학생의 등수를 1로 초기화
		//System.out.println("학생들의 석차를 구하시오 ");
		for(i=0 ; i<inwon ; i++) 
			rec[i].rank=1; // 1로 초기화하는 위치 잘 기억할 것 ! 
			
			//등수 계산
			//60 50 70 2 3 1 
			
			for(i=0 ; i<inwon-1 ; i++) {//0 1 
				for(j=i+1; j<inwon ; j++) {// 1 2
					if(rec[i].avg>rec[j].avg)
						rec[j].rank++ ;
					else if(rec[i].avg<rec[j].avg)
						rec[i].rank++ ;
			
			}	
		}
		}
		}

/*for(int j=0 ; j<inwon ; j++) {
if(rec[j].tot > rec[i].tot) {
	rec[i].rank ++;
*/			
