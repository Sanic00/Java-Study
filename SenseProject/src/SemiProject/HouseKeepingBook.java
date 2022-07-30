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
	
	JMenuBar jmb = new JMenuBar(); //�޴��� ��ü ����

	JMenu jmenuSelect = new JMenu("���(F)");
	JMenu jmenuSelect2 = new JMenu("����(C)");
	JMenu jmenuSelect3 = new JMenu("����(H)");
	JMenuItem mi1 = new JMenuItem("�����ϱ�(S)");
	JMenuItem mi2 = new JMenuItem("�ҷ�����(L)");
	JMenuItem mi3 = new JMenuItem("�����ϱ�(O)");
	JMenuItem mi4 = new JMenuItem("����(I)");
	
	JLabel la1 = new JLabel("����");
	JLabel la2 = new JLabel("�ݾ�");
	JLabel la3 = new JLabel("Memo");
	JLabel la4 = new JLabel("����");
	JLabel la5 = new JLabel("�ݾ�");
	JLabel la6 = new JLabel("Memo");
	JLabel la7 = new JLabel("�����ܾ� : ", JLabel.CENTER);
	JLabel la8 = new JLabel("0", JLabel.CENTER);
	JLabel la9 = new JLabel("��", JLabel.CENTER);

	
	//combobox�� ���� ��ϵ�
	String [] option1 ={"����", "����", "�뵷"};
	String [] option2 ={"����", "�����", "��ȭ��Ȱ", "�ĺ�", "��ź�"};
	
	JTextField tf1 = new JTextField(20); //�ݾ�
	JTextField tf2 = new JTextField(35); //MEMO
	JTextField tf3 = new JTextField(20); //�ݾ�
	JTextField tf4 = new JTextField(35); //MEMO ĭ
	
	JTextArea ta1 = new JTextArea(22, 20); //���� textarea
	JTextArea ta2 = new JTextArea(22, 20); //���� textarea
	
	JButton bt1 = new JButton("INCOME");
	JButton bt2 = new JButton("EXPENSE");
	
	JComboBox<String> combo;
	JComboBox<String> combo2;
	
	HouseKeepingBook() throws IOException{
		JFrame frame = new JFrame("�����");
		
		Container contentPane = frame.getContentPane();
		//�޴� ����
	
		jmenuSelect.add(mi1); //���F�� ����
		jmenuSelect.add(mi2); //���F�� �ҷ�����
		jmenuSelect2.add(mi3); //���� -> �����ϱ�
		jmenuSelect3.add(mi4); // ���� -> ����
		setJMenuBar(jmb);

		jmb.add(jmenuSelect);
		jmb.add(jmenuSelect2);
		jmb.add(jmenuSelect3);
//		contentPane.add(jmb, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		p1.add(la1); //���� ��
		//������ �޺��ڽ�
		combo = new JComboBox(option1);
		p1.add(combo);
		p1.add(la2); //�ݾ� ��
		p1.add(tf1); //�ݾ� �ؽ�Ʈ�ڽ�
		
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
		
		File file = new File("src/img/����.jpg");
		BufferedImage img = ImageIO.read(file);
		JLabel imagLabel = new JLabel(new ImageIcon(img));
		
		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(2, 1));
		p7.add(imagLabel);
		p7.add(p6);
	
		contentPane.add(p7, BorderLayout.CENTER);
		
		
		//scrollbar ����
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
	
		//���� ����
		JPanel p8 = new JPanel();
		p8.add(sp);
		p8.add(sp2);		
		
		//�ݾ��߰� 
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
				
				ta1.append(sel1 + "\t" + tf1.getText() + "��\n" + tf2.getText() + "\n\n");	
				
				try {
					//�ؽ�Ʈ�� ���� ���ڿ� ���ڵ��� ��Ʈ������ �� �ٲ��ش�.
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
				ta2.append(sel2 + "\t" + tf3.getText() + "��\n" + tf4.getText() + "\n\n");	
				
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
			//�޴��ٿ� ������
		if(e.getSource() == mi1) {
			FileDialog fd = new FileDialog(this, "���� ����", FileDialog.SAVE);
			fd.setVisible(true);
			String path = fd.getDirectory() + fd.getFile();

			try {
				FileWriter w = new FileWriter(path);
				w.write("�� ���� ��\n" + ta1.getText() + "\n" + "�� ���� �� \n" + ta2.getText() + "\n");
				w.close();

			} catch (Exception e2) {

			}
		}
		
			
			//�ҷ�����
			if (e.getSource() == mi2) {
			JFrame jf = new JFrame();
			jf.setPreferredSize(new Dimension(300, 150));
			Container contentPane = jf.getContentPane();

			JTextArea jtf = new JTextArea();
			jtf.setEditable(false); //�����Ұ��� ����

			// �� â ��ũ�� ����
			JScrollPane jsp = new JScrollPane(jtf);
			jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

			FileDialog fd = new FileDialog(this, "���� �ҷ�����", FileDialog.LOAD);
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

				System.out.println("����" + ee);
			}
			jtf.append(s);

			contentPane.add(jsp);
			jf.setSize(300, 500);
			jf.setVisible(true);
		}
			//���� ��ư Ŭ����
			if (e.getSource() == mi3) {
				Calculatorimsi cal = new Calculatorimsi ();
				cal.main(option1);
				
			}
			
			//���� ��ư Ŭ����
			if (e.getSource() == mi4) {
			 JOptionPane.showMessageDialog(this, "(��)�翬 + ��(��)�� �����",sel2, JOptionPane.INFORMATION_MESSAGE);
			}
		
		
	}

	}

	

