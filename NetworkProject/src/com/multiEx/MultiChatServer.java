package com.multiEx;

import java.net.*;
import java.io.*;
import java.util.*; // ��̸���Ʈ�� ������ 


public class MultiChatServer {
	
	private ServerSocket ss = null;
	private Socket s  = null;
	
	// ����� Ŭ���̾�Ʈ �����带 �����ϴ� ArrayList
	ArrayList<ChatThread>chatlist = new ArrayList<>();
	
	
	
	// ��Ƽ ä�� ���� ���α׷� 
	public void start() {
		// ���� ���� ���� �Ѵ�.
		
		try {
		// ���� ���� ����
			ss = new ServerSocket(4000);
			System.out.println("Server start...............");
		
		 //���� ������ ���鼭 Ŭ���̾�Ʈ�� ������ ��ٸ�............
			while(true){
				s = ss.accept();
				
				//����� Ŭ���̾�Ʈ���� ������ ����
				ChatThread chat = new ChatThread();
				
				// Ŭ���̾�Ʈ ����Ʈ�� ������ �߰�
				chatlist.add(chat);
				//������ ����
				chat.start();
				
				
			}
				
			}catch(Exception e) {
				System.out.println("[MulitChatServer]start() Exception �߻��ߴ�...........");
			}
		
		
		
	
		
		
	}
	
	// �� Ŭ���̾�Ʈ ������ ���� ������ Ŭ����  ����
	class ChatThread extends Thread{
			
	// ���Ÿ޽��� �� �Ľ� ����� ó���ϴ� ������ ����
	String msg;
	String [] rmsg;
		
	// ����� ��Ʈ�� ����
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
		
		
		@Override
		public void run() {
			
			boolean status = true;
			System.out.println("##ChatThread start ...........");
			
			try {
				
				inMsg = new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);
				
				//���� ������ ture�̸� ������ ���鼭 ��������׼� ���ŵ� �޽����� ó���Ѵ�
				while(status) {
					//���ŵ� �޽����� msg ������ �����Դϴ�
				 msg = inMsg.readLine();
				 // '/'�� �����ڸ� �������� �޽����� ���ڿ� �迭�� �Ľ���
				 rmsg = msg.split("/");
				 	
				 //�Ľ̵� ���ڿ� �迭�� �ι�° ��Ұ��� ���� ó��
				 
				 //�α׾ƿ� �޽����϶�
				 if(rmsg[1].equals("logout")) {
					chatlist.remove(this);
					msgSendAll("server/"+ rmsg[0]+ "���� ���� �߽��ϴ�.");
					// �ش� Ŭ���̾�Ʈ ������ ����� ���� status�� false�� ������
					status = false;
				 }
				 
				 //�α��� �޽��� �϶�
				 else if(rmsg[1].equals("login")) {
					 msgSendAll("server/"+ rmsg[0]+ "���� �α��� �߽��ϴ�."); 
				 }
				 //�׿��� �޽��� �϶�
				 else {
				  msgSendAll(msg);
				  
				 }
				}
				
				//������ ����� Ŭ���̾�Ʈ ������ ���� ������ �������� ���ͷ�Ʈ �� �߻�
				this.interrupt();
				System.out.println("##" + this.getName()+"STOP!!!");
				
				
			} catch (IOException ii) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException �߻�.........");
			}
			
		}
	}
	
	//����� ��� Ŭ���̾�Ʈ���� �޼����� �����ϴ� ���
	public void msgSendAll(String msg) {
		for(ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
		}
	}
	
	public MultiChatServer() {
	
		
		
	}
	
	public static void main(String[] args) {
		 MultiChatServer ser = new MultiChatServer();
		 ser.start();
		

	}

}
