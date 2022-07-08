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
	
	// �α��� �г�
	private JPanel loginPanel;
	// �α��� ��ư
	private JButton loginButton;
	// ��ȭ�� 
	private JLabel label1; 
	// ��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	private JTextField idInput;
	
	// �α׾ƿ� �г�
	private JPanel logoutPanel;
	// �α׾ƿ� ��ư
	private JButton logoutButton;
	// ��ȭ�� 
	private JLabel label2;
	
	//�Է� �г� ����
	private JPanel msgPanel;
	
	//�Է� �ؽ�Ʈ �ʵ�
	private JTextField msgInput;
	
	//���� ��ư
	private JButton exitButton;
	
	//���� ������ â 
	private JFrame jframe;
	
	//ä�� ������ ����� â
	private JTextArea msgOut;
	
	
	//ī�� ���̾ƿ�
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	
	//���� �÷���
	boolean status;
	
	
	
	
	public MultiChatClient(String ip) {
		this.ip = ip;
		
		// �α��� �г� ����
		loginPanel = new JPanel();
		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("�α���");
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	

	}

	@Override
	public void run() {


	}

}
