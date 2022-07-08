package com.UnicastEx;

import java.io.*;
import java.net.*;

//클라이언트는 스레드가 필요없다
public class UnicastClient {

	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	BufferedReader keyboard = null;
	
	
	public UnicastClient() {
		//서버를 찾을수 없는 경우와 서버가 연결 할수 없는 경우 2가지를 설정 
		try{
		//소켓 생성
			socket = new Socket("localhost", 5000);
			
		} catch (UnknownHostException ue) {
		//이건 서버를 찾을 수 없을때
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		} catch(IOException ii) {
		//서버와 연결 할 수 없을때
			System.out.println("서버와 연결 할 수 없습니다..");
			System.exit(0);
		}
		//Stream 연결
		try {
				//키보드를 이용해서 메시지를 쓸때 필요하기 떄문에
				keyboard = new BufferedReader(new InputStreamReader(System.in));
			
				br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));
				// 서버와 메시즈를 주고 받음 
			while(true) {
				//키보드로 부터 입력받은 내용을 읽어 와야 한다.
				System.out.print("전송 메시지 :");
				String msg = keyboard.readLine();
				
				// 받은 메시지를 서버로 전송
				bw.write(msg + "\n");
				bw.flush();
				
				String getMsg = br.readLine();
				System.out.println("수신된 메시지 :"+getMsg);
				
			}
				
			}catch(IOException e) {
			
				System.out.println("서버와 연결 할 수 없습니다..");
				System.exit(0);
					
				}
				
		
	
	}
	
	
	
	public static void main(String[] args) {
	new UnicastClient();
		
		
		
	}

}
