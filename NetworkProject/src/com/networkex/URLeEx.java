package com.networkex;

import java.net.*;
import java.io.*;

public class URLeEx {

	public static void main(String[] args) {
		//URL (Uniform resource locator)에 대한 정보를 가지고 있는 클래스
		//URL로 얻을수 있는 정보는? 
		//프로토콜, 호스트명, 포트번호, 자원의 경로, 쿼리스트링을 정보를 얻는다.
		
		BufferedReader br = null;
		//트라이 캐치를 항상 잡고 간다.
		try {
		URL url = new URL("http://www.daum.net/index.html");
		System.out.println("프로토콜 :"+url.getProtocol());
		System.out.println("호스트명 :"+url.getHost());
		System.out.println("포트번호 :"+url.getPort());
		System.out.println("경로 :"+url.getPath());

		br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str = null;
		while((str =br.readLine())!= null) {
			System.out.println(str);
		}
			
			
		} catch (MalformedURLException e) { //잘못된 url이 발생했을때 
			e.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try { if(br != null) br.close();}catch(IOException io2) {}
		}

	}

}
