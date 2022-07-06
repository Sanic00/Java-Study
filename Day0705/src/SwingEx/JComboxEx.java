package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComboxEx extends JFrame {

	
	public JComboxEx() {
		super("JCombox Test");
		setLayout(new FlowLayout());
		
		String [] citems = {"One", "Two","Three", "Four"};
		
		JComboBox<String>combo = new JComboBox(citems);
		add(combo);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
			new JComboxEx();

	}

}
