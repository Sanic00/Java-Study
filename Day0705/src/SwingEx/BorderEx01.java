package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

//windowexam에 있는건 프레임 객체를 만들어서 했지만 이번에는 jframe을 상속받아서 함
//버튼 6개 만들기
public class BorderEx01 extends JFrame{
	
	private JButton [] jb = new JButton[6]; //swing은 j를 꼭 붙여라 
	
	
	
	
	

	public BorderEx01() {
		
		super("Border Test");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i = 0; i<6; i++) {
			jb[i] = new JButton(i+"번 버튼");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10 , 10, 10);
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red, 5); // 5는 두께 
		jb[1].setBorder(lb);
		
//		LineBorder lb1 = new LineBorder(Color.green, 5); // 5는 두께 
//		jb[2].setBorder(lb1);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.BLUE);
		jb[2].setBorder(mb);
		
		EtchedBorder eeb = new EtchedBorder();
		jb[3].setBorder(eeb);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[4].setBorder(bb);//버튼이 살짝 올라와있는 느낌 
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[5].setBorder(sbb);// 꾹 눌러져있는 느낌 
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new BorderEx01();

	}

}
