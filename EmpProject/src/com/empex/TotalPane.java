package com.empex;

import java.util.Vector;

import javax.swing.*;

public class TotalPane extends JPanel {

		public TotalPane() {
			
			setLayout(null);
			JTable table = new JTable(new EmployModel());
			JScrollPane jp = new JScrollPane(table);
			jp.setBounds(10, 100, 500, 400);
			
			
			
			
			
		}
}
