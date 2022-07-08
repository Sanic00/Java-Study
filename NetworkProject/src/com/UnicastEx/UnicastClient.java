package com.UnicastEx;

import java.io.*;
import java.net.*;

//Ŭ���̾�Ʈ�� �����尡 �ʿ����
public class UnicastClient {

	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	BufferedReader keyboard = null;
	
	
	public UnicastClient() {
		//������ ã���� ���� ���� ������ ���� �Ҽ� ���� ��� 2������ ���� 
		try{
		//���� ����
			socket = new Socket("localhost", 5000);
			
		} catch (UnknownHostException ue) {
		//�̰� ������ ã�� �� ������
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		} catch(IOException ii) {
		//������ ���� �� �� ������
			System.out.println("������ ���� �� �� �����ϴ�..");
			System.exit(0);
		}
		//Stream ����
		try {
				//Ű���带 �̿��ؼ� �޽����� ���� �ʿ��ϱ� ������
				keyboard = new BufferedReader(new InputStreamReader(System.in));
			
				br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));
				// ������ �޽�� �ְ� ���� 
			while(true) {
				//Ű����� ���� �Է¹��� ������ �о� �;� �Ѵ�.
				System.out.print("���� �޽��� :");
				String msg = keyboard.readLine();
				
				// ���� �޽����� ������ ����
				bw.write(msg + "\n");
				bw.flush();
				
				String getMsg = br.readLine();
				System.out.println("���ŵ� �޽��� :"+getMsg);
				
			}
				
			}catch(IOException e) {
			
				System.out.println("������ ���� �� �� �����ϴ�..");
				System.exit(0);
					
				}
				
		
	
	}
	
	
	
	public static void main(String[] args) {
	new UnicastClient();
		
		
		
	}

}
