package SwingEx;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WindowExam3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램"); //타이틀
		
		//먼저 사이즈를 잡고 위치를 잡아야됨 순서 상관있음(근데 무조건 순서를 지켜야되는건 아님)
		frame.setPreferredSize(new Dimension(400, 200)); //프레임 사이즈
		frame.setLocation(500, 400); //프레임 위치
		
		//스윙은 컨테이너를 가져가야됨
		Container contentPane = frame.getContentPane();
		
		String [] colNames = {"이름", "나이", "성별"};

		//컬럼의 이름하고 카운트 등이
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JTextField text1 = new JTextField(6); //이름
		JTextField text2 = new JTextField(3); //나이
		JTextField text3 = new JTextField(2); //성별
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		//패널에다 추가
		panel.add(new JLabel("이름"));
		panel.add(text1); 
		panel.add(new JLabel("나이"));
		panel.add(text2); 
		panel.add(new JLabel("성별"));
		panel.add(text3);
		
		panel.add(button1); panel.add(button2);
		
		//위 패널을 컨텐트페인에 추가
		contentPane.add(panel, BorderLayout.SOUTH);
		
		//추가
		button1.addActionListener(new AddActionListener(table, text1, text2, text3));
		
		//삭제
		button2.addActionListener(new RemoveActionListener(table));
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
