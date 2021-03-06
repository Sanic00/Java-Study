package SwingEx;
import javax.swing.*;
import java.awt.event.*;

public class DrawActionListene implements ActionListener {

	JTextField text1, text2, text3;
	DrawingPanel drawingPanel;
	
	
	public DrawActionListene(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			
			drawingPanel.setScores(korean, english, math);
			
			drawingPanel.repaint(); // 다시 칠하는거 
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(drawingPanel, "잘못된 숫자형식입니다.",
					"에러 메시지", JOptionPane.ERROR_MESSAGE);
			
		}

	}

}
