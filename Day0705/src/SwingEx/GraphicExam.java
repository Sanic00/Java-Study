package SwingEx;

import java.awt.*;
import javax.swing.*;

public class GraphicExam {

	public static void main(String[] args) {
		JFrame frame = new JFrame("���� �׷��� ���α׷�");
		
		
		frame.setPreferredSize(new Dimension(400, 350));
		frame.setLocation(500, 200);
		
		Container contentPane = frame.getContentPane();
		//drawingpanel ��ü ����
		DrawingPanel drawingpanel = new DrawingPanel();
		
		contentPane.add(drawingpanel, BorderLayout.CENTER);	
		
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3); // ���� ���� ����
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("�׷��� �׸���");
		
		
		//Ư�� �г� 
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text3);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new DrawActionListene(text1, text2, text3, drawingpanel));
	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);

	}

}