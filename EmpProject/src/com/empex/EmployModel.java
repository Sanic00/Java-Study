package com.empex;

import java.util.*; 
import javax.swing.table.*;



//사원 전체를 보기 위한 객체
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	public EmployModel() {
		
		/*
		 * 열의 개수와 행의 개수를 알아야 2차원 배열을 선언함 
		 * 테이블에서 컬럼을 이름을 얻어와서 1차원배열로 선언
		 */
		
		title= emDao.getColumnName(); //emdao에서 컬럼이름을 가져온다
		columnName = title.toArray(); 
		
		int columnCount = title.size(); // 타이틀에 사이즈만큼 컬럼갯수를 만듬
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
