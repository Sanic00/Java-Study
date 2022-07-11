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
		
		//��ȭ�� �� 
		label1 = new JLabel("��ȭ��");
		
		//�гο� ���� ���̾ƿ� ����
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		//�α׾ƿ� �г� ����
		logoutPanel = new JPanel();
		
		//�α׾ƿ� ���̾ƿ� ����
		logoutPanel.setLayout(new BorderLayout());
		
		label2 = new JLabel();
		logoutButton = new JButton("�α� �ƿ�");
		
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		// �Է� �г� ����
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
				
		exitButton = new JButton("����");
		
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		// �α��� / �α׾ƿ� �г� ������ ���� ī�� ���̾ƿ�
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "Login");
		tab.add(logoutPanel, "Logout");
	
		// ���� ������ ����
		jframe = new JFrame("��Ƽ ä�� ���α׷�"); //����
		msgOut = new JTextArea("", 10, 30); //"" = null�� ������
		msgOut.setEditable(false); //����ڰ� ���� ���� ���ϰ� �ϴ°�
		
		// ���� ��ũ�� �ٴ� �׻� ��Ÿ�°�, ���� ��ũ�� �ٴ� �ʿ�ÿ��� ��Ÿ����(������ �������� ��ũ�� �ٰ� �ʿ��ϴ�)
		JScrollPane jsp = new JScrollPane();
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	

	}

	@Override
	public void run() {


	}

}
