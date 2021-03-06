package SwingEx;

import java.awt.*;
import javax.swing.*;



public class WindowExam02 {


	
	public static void main(String[] args) {
	//프레임 상속 안받고 객체 만들기
		JFrame frame = new JFrame("참가자 명단 프로그램"); //타이틀
		
		//먼저 사이즈를 잡고 위치를 잡아야됨 순서 상관있음(근데 무조건 순서를 지켜야되는건 아님)
		frame.setPreferredSize(new Dimension(300, 150)); //프레임 사이즈
		frame.setLocation(500, 400); //프레임 위치
		
		//스윙은 컨테이너를 가져가야됨
		Container contentPane = frame.getContentPane();
		
		String [] colNames = {"이름", "나이", "성별"};
		
		Object data[][] = {
				{"홍길동", 24, "남자"},
				{"한찬규", 28, "여자"},
				{"마상", 28, "남자"}
				
		};
		
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		//어디다 위치 할꺼면 컨테이너에다 위치할꺼다
		contentPane.add(scrollpane, BorderLayout.CENTER);
		//버튼잡기
		JButton button = new JButton("출력");
		//버튼 위치를 contentpane으로 
		contentPane.add(button, BorderLayout.SOUTH);
		
		//버튼에 printActionListen를 넣음
		button.addActionListener(new PrintActionListener(table));
	
		
		//만들고 보여주는 역할을 하는 애들
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);
		

	}

}
