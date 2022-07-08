package com.networkex;

import java.net.*;
import java.io.*;

public class URLeEx {

	public static void main(String[] args) {
		//URL (Uniform resource locator)�� ���� ������ ������ �ִ� Ŭ����
		//URL�� ������ �ִ� ������? 
		//��������, ȣ��Ʈ��, ��Ʈ��ȣ, �ڿ��� ���, ������Ʈ���� ������ ��´�.
		
		BufferedReader br = null;
		//Ʈ���� ĳġ�� �׻� ��� ����.
		try {
		URL url = new URL("http://www.daum.net/index.html");
		System.out.println("�������� :"+url.getProtocol());
		System.out.println("ȣ��Ʈ�� :"+url.getHost());
		System.out.println("��Ʈ��ȣ :"+url.getPort());
		System.out.println("��� :"+url.getPath());

		br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str = null;
		while((str =br.readLine())!= null) {
			System.out.println(str);
		}
			
			
		} catch (MalformedURLException e) { //�߸��� url�� �߻������� 
			e.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try { if(br != null) br.close();}catch(IOException io2) {}
		}

	}

}
