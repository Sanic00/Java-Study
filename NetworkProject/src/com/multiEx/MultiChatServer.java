package com.multiEx;

import java.net.*;
import java.io.*;
import java.util.*; // 어레이리스트를 쓸려고 


public class MultiChatServer {
	
	private ServerSocket ss = null;
	private Socket s  = null;
	
	// 연결된 클라이언트 스레드를 관리하는 ArrayList
	ArrayList<ChatThread>chatlist = new ArrayList<>();
	
	
	
	// 멀티 채팅 메인 프로그램 
	public void start() {
		// 서버 소켓 생성 한다.
		
		try {
		// 서버 소켓 생성
			ss = new ServerSocket(4000);
			System.out.println("Server start...............");
		
		 //무한 루프를 돌면서 클라이언트의 접속을 기다림............
			while(true){
				s = ss.accept();
				
				//연결된 클라이언트에서 스레드 생성
				ChatThread chat = new ChatThread();
				
				// 클라이언트 리스트에 스레드 추가
				chatlist.add(chat);
				//스레드 시작
				chat.start();
				
				
			}
				
			}catch(Exception e) {
				System.out.println("[MulitChatServer]start() Exception 발생했다...........");
			}
		
		
		
	
		
		
	}
	
	// 각 클라이언트 관리를 위한 스레드 클래스  구현
	class ChatThread extends Thread{
			
	// 수신메시지 와 파싱 페시지 처리하는 변수를 선언
	String msg;
	String [] rmsg;
		
	// 입출력 스트림 생성
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
				
				//상태 정보가 ture이면 루프를 돌면서 사용자한테서 수신된 메시지를 처리한다
				while(status) {
					//수신된 메시지를 msg 변수에 저장함니다
				 msg = inMsg.readLine();
				 // '/'로 구분자를 기준으로 메시지를 문자열 배열로 파싱함
				 rmsg = msg.split("/");
				 	
				 //파싱된 문자열 배열의 두번째 요소값에 따라 처리
				 
				 //로그아웃 메시지일때
				 if(rmsg[1].equals("logout")) {
					chatlist.remove(this);
					msgSendAll("server/"+ rmsg[0]+ "님이 종료 했습니다.");
					// 해당 클라이언트 스레드 종료로 인해 status를 false로 설정함
					status = false;
				 }
				 
				 //로그인 메시지 일때
				 else if(rmsg[1].equals("login")) {
					 msgSendAll("server/"+ rmsg[0]+ "님이 로그인 했습니다."); 
				 }
				 //그외의 메시지 일때
				 else {
				  msgSendAll(msg);
				  
				 }
				}
				
				//루프를 벗어나면 클라이언트 연결이 종료 됨으로 스레드의 인터럽트 가 발생
				this.interrupt();
				System.out.println("##" + this.getName()+"STOP!!!");
				
				
			} catch (IOException ii) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException 발생.........");
			}
			
		}
	}
	
	//연결된 모든 클라이언트에게 메세지를 전달하는 기능
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
