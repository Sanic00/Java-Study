package com.UnicastEx;

import java.net.*;
import java.io.*;
//이 클래스의 목적은
//클라이언트와 연결된 socket객체를 가지고 있으며, 접속을 유지하고 통신을 담당하는 클래스이다.
public class UnicastServerThread extends Thread {
	
	
	//서버로 부터 전달된 socket을 저장함
	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	
	//객체 생성시 socket을 전달 받아서 멤버 변수 저장함
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		
		//Stream 연결
		try {
		br = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		// 클라이언트와 메시지를 송수신 함 
		while(true) {
			//클라이언트가 서버에게 보낸 메세지를 수신함
			String msg = br.readLine();
			System.out.println(msg);
			
			// 클라이언트로 메시지를 보냄
			bw.write(msg+"\n");
			bw.flush(); //버퍼를 채움
		}
		
		}catch(IOException e) {
			//클라이언트와 연결이 끊어진 경우 예외가 발생함 
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress(); //주소를 읽어온다
			System.out.println("["+address+"]와의 연결이 끊어졌습니다.");
			
		}
		
	}
	
	
}
