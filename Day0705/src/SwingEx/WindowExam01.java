package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //swing은 javax에 있다.



public class WindowExam01 {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Swing Programming");
		frame.setPreferredSize(new Dimension(200, 70)); //배열의 영어 디멘션
		frame.setLocation(500, 400);
		Container contentpane = frame.getContentPane(); //여기다가 활용
		JTextField text = new JTextField();
		JButton button = new JButton("확인버튼");
		JLabel label = new JLabel("Hello Java Swing");
		contentpane.add(text, BorderLayout.CENTER);
		contentpane.add(button, BorderLayout.EAST);
		contentpane.add(label, BorderLayout.SOUTH);
		
		//얘는 인터페이스의 다형성을 이용
		ActionListener listener = new ConfirmButtonActionListener(text, label); 
		
		button.addActionListener(listener);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼
		frame.pack();    // 자동으로 크기 잡아줌
		frame.setVisible(true);
		
		
		
		
		
		
	}

}
