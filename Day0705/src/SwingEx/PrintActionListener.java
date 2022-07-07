package SwingEx;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrintActionListener implements ActionListener {

	
	JTable table;
	
	//�����ڿ� ���ڰ��� �־���
	public PrintActionListener(JTable table) {
		this.table = table;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//���̺� ���� �����;��Ѵ� 
		TableModel model = table.getModel();
		
		//�𵨿��� ��� ���� �����;��Ѵ�
		int rowNum = model.getColumnCount(); //������ ���� ������
		int colNum = model.getColumnCount();
		// �÷��� �̸� �� ���� ���
		for(int col=0; col<colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();//�ٹٲ�
		//2���� �迭
		for(int row=0; row<rowNum; row++) {
			for(int col=0; col<colNum; col++){
				Object obj = model.getValueAt(row, col); //��� ���� �����ٰ�
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		

	}

}
