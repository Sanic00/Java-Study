package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //swing�� javax�� �ִ�.



public class WindowExam01 {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Swing Programming");
		frame.setPreferredSize(new Dimension(200, 70)); //�迭�� ���� ����
		frame.setLocation(500, 400);
		Container contentpane = frame.getContentPane(); //����ٰ� Ȱ��
		JTextField text = new JTextField();
		JButton button = new JButton("Ȯ�ι�ư");
		JLabel label = new JLabel("Hello Java Swing");
		contentpane.add(text, BorderLayout.CENTER);
		contentpane.add(button, BorderLayout.EAST);
		contentpane.add(label, BorderLayout.SOUTH);
		
		//��� �������̽��� �������� �̿�
		ActionListener listener = new ConfirmButtonActionListener(text, label); 
		
		button.addActionListener(listener);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����ư
		frame.pack();    // �ڵ����� ũ�� �����
		frame.setVisible(true);
		
		
		
		
		
		
	}

}
