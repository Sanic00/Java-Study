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
		//�ϴ� ���� �����´� �׷����� ������ �����ϴϱ�
	    int row = table.getSelectedRow();
		if(row == -1) 
			return; //row�� -1�϶� return�Ѵ�.
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
		

	}

}
