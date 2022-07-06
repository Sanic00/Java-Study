package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderEx extends JFrame {
							//방향 수평이냐 수직  초기값 0 최댓값 255
	JSlider red = new JSlider(JSlider.HORIZONTAL , 0, 255, 0);
	JSlider green = new JSlider(JSlider.HORIZONTAL , 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL , 0, 255, 0);
	
	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0, 1));
	JPanel center = new JPanel(new GridLayout(0, 1));
	JPanel p2 = new JPanel();
	
	
	JLabel rlabel = new JLabel("RED");
	JLabel glabel = new JLabel("GREEN");
	JLabel blabel = new JLabel("BLUE");
	
	int r,g,b;
	
	
	
	
	public JSliderEx() {
		
		super("JSlider Test");
		
		red.setMajorTickSpacing(50);  //주 눈금 50단위로 끊는다 50 100 150 200 이렇게 
		red.setMinorTickSpacing(5);   //보조 눈금 5씩 단위로 끊음 
		red.setPaintTicks(true);
		red.setPaintLabels(true);
		
		green.setMajorTickSpacing(50);  //주 눈금 50단위로 끊는다 50 100 150 200 이렇게 
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		
		blue.setMajorTickSpacing(50);  //주 눈금 50단위로 끊는다 50 100 150 200 이렇게 
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		
		rlabel.setForeground(Color.red); // 이걸 추가하기전까지 red green blue 색이 검은색이였음
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);
		
		
		
		rgb.setFont(new Font("궁서체", Font.BOLD, 25));
		
		
		west.add(rlabel);  west.add(glabel); west.add(blabel);
		center.add(red); center.add(green); center.add(blue);
		
		
		p1.add("West", west); p1.add("Center", center);
		add("North", rgb);
		add("South", p1);
		add("Center", p2);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 400, 300);
		setVisible(true);
			
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
	}
	
		class Sevent implements ChangeListener{
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(e.getSource() == red) {
					r = source.getValue();
				}
				
				if(e.getSource() == green) {
					g = source.getValue();
				}
				
				if(e.getSource() == blue) {
					b = source.getValue();
				}
				
				p2.setBackground(new Color(r,g,b));
				rgb.setText("RGB ("+ r +","+ g + ","+ b + ")");
			}
			
		}
	
	
	
	public static void main(String[] args) {
		new JSliderEx();

		
		
		
		
		
	}

}
