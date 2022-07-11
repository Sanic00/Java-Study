package com.multiEx;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class MultiChatClient implements Runnable, ActionListener {
	
	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	// 로그인 패널
	private JPanel loginPanel;
	// 로그인 버튼
	private JButton loginButton;
	// 대화명 
	private JLabel label1; 
	// 대화명 입력 텍스트 필드
	private JTextField idInput;
	
	// 로그아웃 패널
	private JPanel logoutPanel;
	// 로그아웃 버튼
	private JButton logoutButton;
	// 대화명 
	private JLabel label2;
	
	//입력 패널 구성
	private JPanel msgPanel;
	
	//입력 텍스트 필드
	private JTextField msgInput;
	
	//종료 버튼
	private JButton exitButton;
	
	//메인 윈도우 창 
	private JFrame jframe;
	
	//채팅 내용을 출력할 창
	private JTextArea msgOut;
	
	
	//카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	
	//상태 플래그
	boolean status;
	
	
	
	
	public MultiChatClient(String ip) {
		this.ip = ip;
		
		// 로그인 패널 구성
		loginPanel = new JPanel();
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		
		//대화명 라벨 
		label1 = new JLabel("대화명");
		
		//패널에 대한 레이아웃 설정
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		//로그아웃 패널 구성
		logoutPanel = new JPanel();
		
		//로그아웃 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		
		label2 = new JLabel();
		logoutButton = new JButton("로그 아웃");
		
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		// 입력 패널 구성
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
				
		exitButton = new JButton("종료");
		
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		// 로그인 / 로그아웃 패널 선택을 위한 카드 레이아웃
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "Login");
		tab.add(logoutPanel, "Logout");
	
		// 메인 프레임 구성
		jframe = new JFrame("멀티 채팅 프로그램"); //제목
		msgOut = new JTextArea("", 10, 30); //"" = null로 잡은것
		msgOut.setEditable(false); //사용자가 편집 수정 못하게 하는거
		
		// 수직 스크롤 바는 항상 나타태고, 수평 스크롤 바는 필요시에만 나타나기(내용이 많아지면 스크롤 바가 필요하다)
		JScrollPane jsp = new JScrollPane();
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	

	}

	@Override
	public void run() {


	}

}
