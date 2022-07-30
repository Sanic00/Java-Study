package SemiProject;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.io.*;
import java.nio.channels.SelectableChannel;


public class HouseKeepingBook extends JFrame implements ActionListener {
	
	JMenuBar jmb = new JMenuBar(); //메뉴바 객체 생성

	JMenu jmenuSelect = new JMenu("기능(F)");
	JMenu jmenuSelect2 = new JMenu("계산기(C)");
	JMenu jmenuSelect3 = new JMenu("도움말(H)");
	JMenuItem mi1 = new JMenuItem("저장하기(S)");
	JMenuItem mi2 = new JMenuItem("불러오기(L)");
	JMenuItem mi3 = new JMenuItem("실행하기(O)");
	JMenuItem mi4 = new JMenuItem("정보(I)");
	
	JLabel la1 = new JLabel("수입");
	JLabel la2 = new JLabel("금액");
	JLabel la3 = new JLabel("Memo");
	JLabel la4 = new JLabel("지출");
	JLabel la5 = new JLabel("금액");
	JLabel la6 = new JLabel("Memo");
	JLabel la7 = new JLabel("현재잔액 : ", JLabel.CENTER);
	JLabel la8 = new JLabel("0", JLabel.CENTER);
	JLabel la9 = new JLabel("원", JLabel.CENTER);

	
	//combobox에 넣을 목록들
	String [] option1 ={"수입", "월급", "용돈"};
	String [] option2 ={"지출", "교통비", "문화생활", "식비", "통신비"};
	
	JTextField tf1 = new JTextField(20); //금액
	JTextField tf2 = new JTextField(35); //MEMO
	JTextField tf3 = new JTextField(20); //금액
	JTextField tf4 = new JTextField(35); //MEMO 칸
	
	JTextArea ta1 = new JTextArea(22, 20); //수입 textarea
	JTextArea ta2 = new JTextArea(22, 20); //지출 textarea
	
	JButton bt1 = new JButton("INCOME");
	JButton bt2 = new JButton("EXPENSE");
	
	JComboBox<String> combo;
	JComboBox<String> combo2;
	
	HouseKeepingBook() throws IOException{
		JFrame frame = new JFrame("가계부");
		
		Container contentPane = frame.getContentPane();
		//메뉴 저장
	
		jmenuSelect.add(mi1); //기능F에 저장
		jmenuSelect.add(mi2); //기능F에 불러오기
		jmenuSelect2.add(mi3); //계산기 -> 실행하기
		jmenuSelect3.add(mi4); // 도움말 -> 정보
		setJMenuBar(jmb);

		jmb.add(jmenuSelect);
		jmb.add(jmenuSelect2);
		jmb.add(jmenuSelect3);
//		contentPane.add(jmb, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		p1.add(la1); //수입 라벨
		//수입의 콤보박스
		combo = new JComboBox(option1);
		p1.add(combo);
		p1.add(la2); //금액 라벨
		p1.add(tf1); //금액 텍스트박스
		
		JPanel p2 = new JPanel();
		p2.add(la3);
		p2.add(tf2);
		
		JPanel p3 = new JPanel();
		p3.add(la4);
		combo2 = new JComboBox(option2);
		p3.add(combo2);
		p3.add(la5);
		p3.add(tf3);
		
		JPanel p4 = new JPanel();
		p4.add(la6);
		p4.add(tf4);
		
		JPanel p5 = new JPanel();
		p5.add(bt1);
		bt1.addActionListener(this);
		p5.add(bt2);
		bt2.addActionListener(this);
	
			
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(5, 1));
		p6.add(p1);	
		p6.add(p2);	
		p6.add(p3);	
		p6.add(p4);	
		p6.add(p5);	
		contentPane.setLayout(new BorderLayout());
		contentPane.add(p6);
		
		File file = new File("src/img/김해.jpg");
		BufferedImage img = ImageIO.read(file);
		JLabel imagLabel = new JLabel(new ImageIcon(img));
		
		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(2, 1));
		p7.add(imagLabel);
		p7.add(p6);
	
		contentPane.add(p7, BorderLayout.CENTER);
		
		
		//scrollbar 설정
		SoftBevelBorder ssb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		JScrollPane sp = new JScrollPane(ta1);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JScrollPane sp2 = new JScrollPane(ta2);
		sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		ta1.setBorder(ssb);
		ta1.setEditable(false);
		ta2.setBorder(ssb);
		ta2.setEditable(false);
	
		//수입 지출
		JPanel p8 = new JPanel();
		p8.add(sp);
		p8.add(sp2);		
		
		//금액추가 
		JPanel p9 = new JPanel();
		p9.add(la7);
		p9.add(la8);
		p9.add(la9);
		
		
		JPanel p10= new JPanel();
		p10.setLayout(new BorderLayout());
		p10.add(p8);
		p10.add(p9, BorderLayout.SOUTH);
		contentPane.add(p10, BorderLayout.EAST);
		
		contentPane.add(jmb, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.setVisible(true);
		
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
			String sel1 = null;
			String sel2 = null;
		if(e.getSource() == bt1) {
				
			if(tf1.getText().length() !=0 || tf2.getText().length() !=0) {
			
				sel1 = (String) combo.getSelectedItem();
				
				ta1.append(sel1 + "\t" + tf1.getText() + "원\n" + tf2.getText() + "\n\n");	
				
				try {
					//텍스트에 썻던 문자열 숫자들을 인트형으로 다 바꿔준다.
					int la8int = Integer.parseInt(la8.getText());
					int tf1int = Integer.parseInt(tf1.getText());

					la8.setText(la8int + tf1int + "");
				} catch (NumberFormatException ee) {
				}

				tf1.setText("");
				tf2.setText("");
				
			}
		}
			
		if(e.getSource() == bt2) {
			
			if(tf3.getText().length() !=0 || tf4.getText().length() !=0) {
				
				sel2 =(String) combo2.getSelectedItem();
				ta2.append(sel2 + "\t" + tf3.getText() + "원\n" + tf4.getText() + "\n\n");	
				
				try {
			
					int la8int = Integer.parseInt(la8.getText());
					int tf3int = Integer.parseInt(tf3.getText());
					la8.setText(la8int - tf3int + "");
				} catch (NumberFormatException ee) {
				}
				
				tf3.setText("");
				tf4.setText("");
			}

		}
			//메뉴바에 저장기능
		if(e.getSource() == mi1) {
			FileDialog fd = new FileDialog(this, "파일 저장", FileDialog.SAVE);
			fd.setVisible(true);
			String path = fd.getDirectory() + fd.getFile();

			try {
				FileWriter w = new FileWriter(path);
				w.write("■ 수입 ■\n" + ta1.getText() + "\n" + "■ 지출 ■ \n" + ta2.getText() + "\n");
				w.close();

			} catch (Exception e2) {

			}
		}
		
			
			//불러오기
			if (e.getSource() == mi2) {
			JFrame jf = new JFrame();
			jf.setPreferredSize(new Dimension(300, 150));
			Container contentPane = jf.getContentPane();

			JTextArea jtf = new JTextArea();
			jtf.setEditable(false); //수정불가로 만들

			// 새 창 스크롤 설정
			JScrollPane jsp = new JScrollPane(jtf);
			jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

			FileDialog fd = new FileDialog(this, "파일 불러오기", FileDialog.LOAD);
			fd.setVisible(true);
			String path = fd.getDirectory() + fd.getFile();

			String s = "";

			try {
				FileReader r = new FileReader(path);
				int k;
				for (;;) {

					k = r.read();
					if (k == -1)
						break;
					s += (char) k;
				}
				r.close();
			} catch (Exception ee) {

				System.out.println("오류" + ee);
			}
			jtf.append(s);

			contentPane.add(jsp);
			jf.setSize(300, 500);
			jf.setVisible(true);
		}
			//계산기 버튼 클릭시
			if (e.getSource() == mi3) {
				Calculatorimsi cal = new Calculatorimsi ();
				cal.main(option1);
				
			}
			
			//도움말 버튼 클릭시
			if (e.getSource() == mi4) {
			 JOptionPane.showMessageDialog(this, "(김)재연 + 배(해)인 가계부",sel2, JOptionPane.INFORMATION_MESSAGE);
			}
		
		
	}

	}

	

