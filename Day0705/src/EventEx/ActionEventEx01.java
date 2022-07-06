package EventEx;

import java.awt.*;
import java.awt.event.*;


public class ActionEventEx01 extends Frame implements ActionListener{

	
	//text �ʵ� ����
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
			System.out.println("�޽��� :" + imsi);
			tf.setText("");//�޽����� �ʱ�ȭ ��Ų�� null�� ��´�.
		}
	}
	
	public static void main(String[] args) {
		
		new ActionEventEx01();
		

	}
	
}
