package com.empex;

import java.util.*; 
import javax.swing.table.*;



//��� ��ü�� ���� ���� ��ü
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	public EmployModel() {
		
		/*
		 * ���� ������ ���� ������ �˾ƾ� 2���� �迭�� ������ 
		 * ���̺��� �÷��� �̸��� ���ͼ� 1�����迭�� ����
		 */
		
		title= emDao.getColumnName(); //emdao���� �÷��̸��� �����´�
		columnName = title.toArray(); 
		
		int columnCount = title.size(); // Ÿ��Ʋ�� �����ŭ �÷������� ����
		list = emDao.getEmployeetotal(); 
		
		int rowCount = list.size(); 
		data = new Object[rowCount][columnCount];
		
		for(int ) {
			
		}
		
		
		
		
	}
	
	@Override
	public int getRowCount() {
		
		return 0;
	}

	@Override
	public int getColumnCount() {
		
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return null;
	}

	
	
	
	
	
	
}
