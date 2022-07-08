package com.socketex;

import java.net.*;


public class SeverSocketEx {

	public static void main(String[] args)throws Exception{
		// 사용자들을 받아들이기 위해 severSocket이 필요함
		ServerSocket ss = new ServerSocket(3000);
		
		//서버 소켓이 생성되면 클라이언트가 올때까지 무한정 대기 해야된다.
		while(true){
			
			Socket s = ss.accept();
			
			
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip+"님이 접속하셨습니다.");
			
		//순서 서버소켓에서 서버 먼저 실행 ->  소켓ex 실행 한다.
		}
		
	}

}
