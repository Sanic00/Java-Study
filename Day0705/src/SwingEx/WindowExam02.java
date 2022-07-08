package SwingEx;

import java.awt.*;
import javax.swing.*;



public class WindowExam02 {


	
	public static void main(String[] args) {
	//������ ��� �ȹް� ��ü �����
		JFrame frame = new JFrame("������ ���� ���α׷�"); //Ÿ��Ʋ
		
		//���� ����� ��� ��ġ�� ��ƾߵ� ���� �������(�ٵ� ������ ������ ���ѾߵǴ°� �ƴ�)
		frame.setPreferredSize(new Dimension(300, 150)); //������ ������
		frame.setLocation(500, 400); //������ ��ġ
		
		//������ �����̳ʸ� �������ߵ�
		Container contentPane = frame.getContentPane();
		
		String [] colNames = {"�̸�", "����", "����"};
		
		Object data[][] = {
				{"ȫ�浿", 24, "����"},
				{"������", 28, "����"},
				{"����", 28, "����"}
				
		};
		
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		//���� ��ġ �Ҳ��� �����̳ʿ��� ��ġ�Ҳ���
		contentPane.add(scrollpane, BorderLayout.CENTER);
		//��ư���
		JButton button = new JButton("���");
		//��ư ��ġ�� contentpane���� 
		contentPane.add(button, BorderLayout.SOUTH);
		
		//��ư�� printActionListen�� ����
		button.addActionListener(new PrintActionListener(table));
	
		
		//����� �����ִ� ������ �ϴ� �ֵ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);
		

	}

}