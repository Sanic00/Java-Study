package com.socketex;

import java.net.*;


public class SeverSocketEx {

	public static void main(String[] args)throws Exception{
		// ����ڵ��� �޾Ƶ��̱� ���� severSocket�� �ʿ���
		ServerSocket ss = new ServerSocket(3000);
		
		//���� ������ �����Ǹ� Ŭ���̾�Ʈ�� �ö����� ������ ��� �ؾߵȴ�.
		while(true){
			
			Socket s = ss.accept();
			
			
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip+"���� �����ϼ̽��ϴ�.");
			
		//���� �������Ͽ��� ���� ���� ���� ->  ����ex ���� �Ѵ�.
		}
		
	}

}
