package SwingEx;

import javax.swing.*;
import java.awt.event.*;



//여태까지는 한클래스 안에서 구현 했지만 지금부터 하는거는 클래스를 분할해서 
public class ConfirmButtonActionListener implements ActionListener {

	JTextField text; //생성자를 이용해서 초기화 한다
	JLabel label;
	
	
	
	
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText(); 
		label.setText("Hello, " + name);

	}

}

