package SwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

//windowexam�� �ִ°� ������ ��ü�� ���� ������ �̹����� jframe�� ��ӹ޾Ƽ� ��
//��ư 6�� �����
public class BorderEx01 extends JFrame{
	
	private JButton [] jb = new JButton[6]; //swing�� j�� �� �ٿ��� 
	
	
	
	
	

	public BorderEx01() {
		
		super("Border Test");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i = 0; i<6; i++) {
			jb[i] = new JButton(i+"�� ��ư");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10 , 10, 10);
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red, 5); // 5�� �β� 
		jb[1].setBorder(lb);
		
//		LineBorder lb1 = new LineBorder(Color.green, 5); // 5�� �β� 
//		jb[2].setBorder(lb1);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.BLUE);
		jb[2].setBorder(mb);
		
		EtchedBorder eeb = new EtchedBorder();
		jb[3].setBorder(eeb);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[4].setBorder(bb);//��ư�� ��¦ �ö���ִ� ���� 
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[5].setBorder(sbb);// �� �������ִ� ���� 
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new BorderEx01();

	}

}