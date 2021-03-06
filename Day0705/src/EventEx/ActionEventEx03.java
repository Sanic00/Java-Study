package EventEx;

import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class ActionEventEx03 extends Frame implements ActionListener{

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Exit");
	
	public ActionEventEx03() {
		super("ActionEvent03");
		
		setMenuBar(mb);
		file.add(file);
		file.add(now);
		file.addSeparator();
		file.add(exit);
		
		exit.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
	new ActionEventEx03();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
