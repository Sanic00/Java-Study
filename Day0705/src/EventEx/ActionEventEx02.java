package EventEx;

import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class ActionEventEx02 extends Frame implements ActionListener {

	private Button bt = new Button("????");
	
	public ActionEventEx02 () {
		
		super("ActionEvent2");
		setLayout(new FlowLayout());
		add(bt);
		bt.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionEventEx02();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
}
