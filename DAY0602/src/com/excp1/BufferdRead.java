package com.excp1;
import java.io.*;
public class BufferdRead {
//�� ������ ����~
	public static void main(String[]ar) {
	try {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�л��� �Է� : ");
	int human=Integer.parseInt(br.readLine()); // ��� �� ���ϱ�
	
	String[] name = new String[human] ;
	//String[] subject = new String[ar.length-1] ; //����� �ʱ�ȭ
	String[] subject = {"����","����","����"};
	//������ ���� ó�� �迭����
	
	int[][] jumsu = new int [human][subject.length] ;
	float[]avg = new float[human] ; 
	char[]grade = new char[human] ;
	int []rank = new int [human] ;
	
	/*for(int i = 0 ; i<subject.length ; i++) {
		//subject[i] = ar[i+1]; 
		System.out.println(subject[i]);}
	*/	
	
	for (int i=0 ; i < human ; i++) { // ��� ����ŭ �ݺ�
 		System.out.print((i+1)+"��° �л� �̸� : ");
 		name[i] = br.readLine();
 		System.out.println(name[i]+":�л� ���� �Է� : ");
 		
 		for(int j =0 ; j<subject.length; j++) {
 			System.out.print(subject[j]+"����");
 			jumsu[i][j] = Integer.parseInt(br.readLine());}
 		
		}catch (Exception e) {
		e.getMessage();
		}
	}	
}
}
