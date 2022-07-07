package SwingEx;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class RemoveActionListener implements ActionListener {

	
	JTable table;
	
	public RemoveActionListener(JTable table) {
		this.table = table;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//일단 행을 가져온다 그래야지 삭제가 가능하니깐
	    int row = table.getSelectedRow();
		if(row == -1) 
			return; //row가 -1일때 return한다.
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
		

	}

}
