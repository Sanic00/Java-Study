package SwingEx;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrintActionListener implements ActionListener {

	
	JTable table;
	
	//생성자에 인자값을 넣었다
	public PrintActionListener(JTable table) {
		this.table = table;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//테이블 모델을 가져와야한다 
		TableModel model = table.getModel();
		
		//모델에서 행과 열을 가져와야한다
		int rowNum = model.getColumnCount(); //갯수를 세서 가져옴
		int colNum = model.getColumnCount();
		// 컬럼의 이름 순 부터 출력
		for(int col=0; col<colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();//줄바꿈
		//2차원 배열
		for(int row=0; row<rowNum; row++) {
			for(int col=0; col<colNum; col++){
				Object obj = model.getValueAt(row, col); //행과 열을 가져다가
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		

	}

}
