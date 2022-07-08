package com.UnicastEx;

import java.net.*;
import java.io.*;
//�� Ŭ������ ������
//Ŭ���̾�Ʈ�� ����� socket��ü�� ������ ������, ������ �����ϰ� ����� ����ϴ� Ŭ�����̴�.
public class UnicastServerThread extends Thread {
	
	
	//������ ���� ���޵� socket�� ������
	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	
	//��ü ������ socket�� ���� �޾Ƽ� ��� ���� ������
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		
		//Stream ����
		try {
		br = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		// Ŭ���̾�Ʈ�� �޽����� �ۼ��� �� 
		while(true) {
			//Ŭ���̾�Ʈ�� �������� ���� �޼����� ������
			String msg = br.readLine();
			System.out.println(msg);
			
			// Ŭ���̾�Ʈ�� �޽����� ����
			bw.write(msg+"\n");
			bw.flush(); //���۸� ä��
		}
		
		}catch(IOException e) {
			//Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻��� 
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress(); //�ּҸ� �о�´�
			System.out.println("["+address+"]���� ������ ���������ϴ�.");
			
		}
		
	}
	
	
}
