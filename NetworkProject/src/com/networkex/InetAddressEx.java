package com.networkex;

import java.net.*;


public class InetAddressEx {

	public static void main(String[] args) {
		
		
		//InetAddress 객체는 생성자가 아닌 static 메소드를 이용해서 객체를 생성합니다.
		try {
			
			InetAddress ipinfo1 = 
					InetAddress.getByName("www.daum.net"); 
			//ip 주소 얻기 
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip 주소 :" +ip);
			
			//모든 ip주소를 알고싶을때
			InetAddress[] ipArray = 
					InetAddress.getAllByName("www.naver.com"); 
				for(InetAddress tempip : ipArray) {
					System.out.println(tempip);
				}
			
			// 현재 본인 컴퓨터 ip 정보             로컬호스트는 자기자신을 의미한다.
			InetAddress myHost = InetAddress.getLocalHost();	
			System.out.println("host의 이름 :" + myHost.getHostName());
			System.out.println("my ip :" + myHost.getHostAddress());
			
			
			
		} catch (UnknownHostException e) { //호스트의 언노운을 찾지 못할때?
			e.printStackTrace();
		}
		

	}

}
