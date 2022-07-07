package SwingEx;

import java.applet.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public class HorseMain extends JFrame implements Runnable {

	private Canvas can;
	private Image buffer;
	private Image [] horse; 
	
	//말이 움직엿다 안움직였다 
	private boolean bRepeat = true; 
	
	
	
	public HorseMain() {
		
		 intiHores();
		//현재의 객체를 가리키는건 this
		 this.add(can = new Canvas() {
			 @Override
			public void paint(Graphics g) {
				g.drawImage(buffer, 0, 0, this);
				
			}
			 @Override
			public void update(Graphics g) {
			
				paint(g);
			}
			 
		 });
	
		 can.addKeyListener(new KeyAdapter() {
			 
			 @Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch(code) {
				case KeyEvent.VK_SPACE : 
					bRepeat = !bRepeat;
					if(bRepeat)
						makeThread();
					break;
				}
			 }
		 });
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(300, 100, 400, 400);
		setVisible(true);
		
		makeThread(); // 생성자에다 호출시킨다. 
		
	}
	
	
	
	
	@Override
	public void run() {
		while(true) {
			for(int i = 0; i < horse.length; i++) {
				if(!bRepeat) return; //true를 false로 
				
				try {
				  Thread.sleep(50);
				}catch(InterruptedException ex) {}
				bufferPaint(i);// 계속 돌게 반복 
			}
		}
		

	}

	//스레드 구현
	public void makeThread() {
		new Thread(this).start();
		
		
		
	}
	
	//초기화 시킬 스레드 구현(말 이미지를 불러들어올 메소드)
	public void intiHores() {
		horse = new Image[11];
		
		for(int i=0; i<horse.length; i++) {
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("src/image/black%02d.png", i+1));//toolkit 이미지를 불러오는 메소드
		}
	}
	
	//버퍼 
	public void bufferPaint(int n) {
		buffer = createImage(can.getWidth(), can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		buffer_g.drawImage(horse[n],50, 50, this);
		can.repaint();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new HorseMain();

	}

}
