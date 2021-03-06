package SwingEx;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

		int korean, english, math;
		
		//무언가를 그릴때? 칠할때? paint라는 메소드 
		@Override
		public void paint(Graphics g) {
			
			g.clearRect(0, 0, getWidth(), getHeight());
			//x축이 50 에서 350까지 
			g.drawLine(50, 250, 350, 250);
			
			for(int cnt = 1; cnt<11; cnt++) {
				g.drawString(cnt*10+"", 25, 255 - 20 * cnt);
				g.drawLine(50, 250-20*cnt, 350, 250-20*cnt);
				}
				
				g.drawLine(50, 20, 50, 250);
				//y측
				g.drawString("국어", 100, 270);
				g.drawString("영어", 200, 270);
				g.drawString("수학", 300, 270);
				
				g.setColor(Color.red);
				
				if(korean >0)
					g.fillRect(110, 250- korean*2,10,korean*2);
				if(english >0)
					g.fillRect(210, 250- english*2,10,english*2);
				if(math >0)
					g.fillRect(310, 250- math*2,10,math*2);
		}
		
		public void setScores(int korean, int english, int math){
		this.korean = korean;
		this.english = english;
		this.math = math;
		}
	
		
	
	
	
}
