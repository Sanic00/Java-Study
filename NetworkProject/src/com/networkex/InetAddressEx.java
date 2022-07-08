package com.networkex;

import java.net.*;


public class InetAddressEx {

	public static void main(String[] args) {
		
		
		//InetAddress ��ü�� �����ڰ� �ƴ� static �޼ҵ带 �̿��ؼ� ��ü�� �����մϴ�.
		try {
			
			InetAddress ipinfo1 = 
					InetAddress.getByName("www.daum.net"); 
			//ip �ּ� ��� 
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip �ּ� :" +ip);
			
			//��� ip�ּҸ� �˰������
			InetAddress[] ipArray = 
					InetAddress.getAllByName("www.naver.com"); 
				for(InetAddress tempip : ipArray) {
					System.out.println(tempip);
				}
			
			// ���� ���� ��ǻ�� ip ����             ����ȣ��Ʈ�� �ڱ��ڽ��� �ǹ��Ѵ�.
			InetAddress myHost = InetAddress.getLocalHost();	
			System.out.println("host�� �̸� :" + myHost.getHostName());
			System.out.println("my ip :" + myHost.getHostAddress());
			
			
			
		} catch (UnknownHostException e) { //ȣ��Ʈ�� ������ ã�� ���Ҷ�?
			e.printStackTrace();
		}
		

	}

}
