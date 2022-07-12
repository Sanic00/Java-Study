package com.empex;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();
		
		
		tp.addTab("사원정보입력", ap);
		tp.addTab("사원정보조회", tp);
		tp.addTab("전체사원정보보기", tpa);
		
		getContentPane().add(tp);
		setTitle("사원관리프로그램");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);

	}

}
