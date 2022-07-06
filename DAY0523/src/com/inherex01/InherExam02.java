package com.inherex01;
import java.io.*;


class AClass 
{
	protected int x,y ; //�� ���� ���� // ��Ӱ���
	protected char ch ; // ������ // ��Ӱ���
	
	public AClass() {
		// TODO Auto-generated constructor stub
	}	

	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n",x,ch,y,result);
	} // ��Ӱ���

}

class BClass extends AClass {
	// ������ �Է� ���(�޼ҵ�)
	boolean input() throws IOException{ //�ν��Ͻ� �޼ҵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����): ");
		String temp = br.readLine();//"20 15"
		String[]str = temp.split("\\s"); //{"20","15" token������ �������´�.
		
		if(str.length != 2)
			return false ;
		
		x= Integer.parseInt(str[0]);
		y= Integer.parseInt(str[1]);
		
		
		System.out.print("������ �Է� [+-*/]:");
		ch = (char)System.in.read();
		if(ch =='+' ||ch =='-'||ch == '*' ||ch =='/')
		return true ;
	
	return false;
	}
	
	// ���� �� ó�� ���(�޼ҵ�)
	
	public double calc() {
		double result = 0 ;
		
		switch(ch) {
		case '+' : result = x+y ; break;
		case '-' : result = x-y ; break;
		case '*' : result = x*y ; break;
		case '/' : result = x/y ; break;
			
		}
		return result ;
		
	}
	

}

public class InherExam02 {

	public static void main(String[] args) throws IOException{
		BClass bc = new BClass();
		
		if(!bc.input()) {
			System.out.println("Error!!!");
			return;
		}
		double result = bc.calc();
		bc.write(result);
	}

}
