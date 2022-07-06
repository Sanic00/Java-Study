package SwingEx;

import javax.swing.*;
import java.awt.event.*;



//���±����� ��Ŭ���� �ȿ��� ���� ������ ���ݺ��� �ϴ°Ŵ� Ŭ������ �����ؼ� 
public class ConfirmButtonActionListener implements ActionListener {

	JTextField text; //�����ڸ� �̿��ؼ� �ʱ�ȭ �Ѵ�
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

