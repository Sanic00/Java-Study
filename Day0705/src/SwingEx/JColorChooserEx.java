package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JColorChooserEx extends JFrame implements ActionListener {

		JMenuBar mb = new JMenuBar();
		JMenu mnuselect = new JMenu("선택");
		JMenuItem mnucolor = new JMenuItem("색상");
		JLabel l = new JLabel("출력장");
		JTextArea ta = new JTextArea();
		
		
		public JColorChooserEx() {
			
			super("JColorChooser Test");
			mnuselect.add(mnucolor);	
			mb.add(mnuselect);
			setJMenuBar(mb);
			
			add("North" , l);
			add("Center", ta);
			
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setBounds(300, 300, 300, 200);
			setVisible(true);
			mnucolor.addActionListener(this);
		}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mnucolor) {
			JColorChooser chooser = new JColorChooser();
			Color col = chooser.showDialog(this, "색상을 고르세오", Color.blue);
			l.setText("선택한 색상은 " + col);
			ta.setBackground(col);
		}

	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}

}
