package EventEx;

import java.awt.*;
import java.awt.event.*;


public class WindowEventEx03 extends Frame{
//내부 클래스
	public WindowEventEx03() {
	super("WinEvent2");
	addWindowListener(new WinEventEx());
	setSize(300, 200);
	setVisible(true);
	}
	
	class WinEventEx extends WindowAdapter{
	  @Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	
	}
		
	}
	
	public static void main(String[] args) {
		new WindowEventEx03();

	}

}
