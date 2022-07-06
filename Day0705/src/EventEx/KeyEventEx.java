package EventEx;

import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class KeyEventEx extends Frame implements KeyListener {

//	FlowLayout : 순서대로 배치 시킨다.
//	BorderLayout : 동서남북으로 배치시킨다.
//	GridLayout : x,y 로 배치시킨다.
//	CardLayout : 겹쳐 보이게 배치시킨다.
	
	Label la = new Label("주민번호", Label.RIGHT);
	Label la2 = new Label("-", Label.RIGHT);
	
	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);
	
	Button bt = new Button("확인");
	
	
	public KeyEventEx() {
		
		super("KeyEvent Test");
		setForm();
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setSize(350, 150);
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		pack(); //자동으로 크기 잡힘 
		setVisible(true);
	}
	
	public void setForm() { //레이아웃을 꾸미기
		                //보더 레이아웃은 상하좌우 west east north south
		setLayout(new BorderLayout());
		add("West", la);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(jumin1);p.add(la2); p.add(jumin2);
		add("Center", p);
		
		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("South", p1);
		
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		

	}

	@Override
	public void keyPressed(KeyEvent e) {
	

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource() == jumin1) {
			if(jumin1.getText().trim().length()==6)      //이건 공백제거 하기 위해 인식하는건 6자리
				jumin2.requestFocus();
		}
		if(e.getSource() == jumin2) {
			if(jumin2.getText().trim().length()==7)      //이건 공백제거 하기 위해 
			     bt.requestFocus();
		}
	
	}

	public static void main(String[] args) {
		new KeyEventEx(); //메인에서 생성자 호출해서 실행

	}

}
