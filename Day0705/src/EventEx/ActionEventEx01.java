package EventEx;

import java.awt.*;
import java.awt.event.*;


public class ActionEventEx01 extends Frame implements ActionListener{

	
	//text 필드 생성
	private TextField tf = new TextField(10);
	
	
	public ActionEventEx01() {
		super("ActionEvent Test");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == tf) {
			String imsi = tf.getText();
			System.out.println("메시지 :" + imsi);
			tf.setText("");//메시지를 초기화 시킨다 null로 잡는다.
		}
	}
	
	public static void main(String[] args) {
		
		new ActionEventEx01();
		

	}
	
}
