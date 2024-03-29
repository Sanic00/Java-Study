package SemiProject;

import java.util.*; // Array list 사용할려고
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Calculatorimsi extends JFrame implements ActionListener, KeyListener {
	private ArrayList<JButton> btnList;
	private JLabel label;
	private JPanel panel;

	double num1, num2;
	String func = "";
	String nInput = "";
	double result;
	boolean state = false;

	Calculatorimsi() {

	    view();

	}

	public JComponent getView() {  // 컴퍼넌트 base
	    return panel;              // 메인 패널 반환
	}

	public void view() {

	    panel = new JPanel(new BorderLayout());  // 메인 페널
	    btnList = new ArrayList<JButton>();

	    JPanel view = new JPanel(new BorderLayout());  // 연산 및 결과창 설정

	    panel.add(view, BorderLayout.CENTER);
	    label = new JLabel("0");
	    label.setHorizontalAlignment(SwingConstants.RIGHT);
	    label.setFont(new Font("Serif", Font.BOLD, 50));

	    view.setBackground(Color.WHITE); 
	    view.add(label);

	    JPanel btnView = new JPanel(new GridLayout(5, 4, 2, 2)); //버튼 설정
	    panel.add(btnView, BorderLayout.SOUTH);
	    String[] buttons = { "←", "C", "%", "x²", "7", "8", "9", "÷", "4", "5", "6", "×", "1", "2", "3", "-", ".", "0",
	            "=", "+" };

	    for (String btn : buttons) {
	        buttonFunc(btnView, btn);

	    }

	}

	private void buttonFunc(JComponent cp, String btn) {
	    JButton jb = new JButton(btn);

	    jb.setFont(new Font("Serif", Font.BOLD, 20));
	    jb.addActionListener(this); //버튼 이벤트 추가
	    jb.addKeyListener(this);    //key 이벤트 추가
	    btnList.add(jb);            //리스트에 저장
	    cp.add(jb);                 //base에 저장

	    if (btn == "←" || btn == "C" || btn == "=") // 기능별 색 지정
	        jb.setForeground(Color.RED);
	    if (btn == "%" || btn == "x²" || btn == "÷" || btn == "×" || btn == "-" || btn == "+")
	        jb.setForeground(Color.BLUE);

	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent ke) {

	    switch (ke.getKeyCode()) {
	    case KeyEvent.VK_0:              //가상 키 코드
	    case KeyEvent.VK_NUMPAD0:
	        btnList.get(17).doClick();   // 리스트 index 번호를 가져옴
	        break;

	    case KeyEvent.VK_NUMPAD1:
	    case KeyEvent.VK_1:
	        btnList.get(12).doClick();
	        break;

	    case KeyEvent.VK_2:
	    case KeyEvent.VK_NUMPAD2:
	        btnList.get(13).doClick();
	        break;

	    case KeyEvent.VK_3:
	    case KeyEvent.VK_NUMPAD3:
	        btnList.get(14).doClick();
	        break;

	    case KeyEvent.VK_4:
	    case KeyEvent.VK_NUMPAD4:
	        btnList.get(8).doClick();
	        break;

	    case KeyEvent.VK_5:
	    case KeyEvent.VK_NUMPAD5:
	        btnList.get(9).doClick();
	        break;

	    case KeyEvent.VK_6:
	    case KeyEvent.VK_NUMPAD6:
	        btnList.get(10).doClick();
	        break;

	    case KeyEvent.VK_7:
	    case KeyEvent.VK_NUMPAD7:
	        btnList.get(4).doClick();
	        break;

	    case KeyEvent.VK_8:
	    case KeyEvent.VK_NUMPAD8:
	        btnList.get(5).doClick();
	        break;

	    case KeyEvent.VK_9:
	    case KeyEvent.VK_NUMPAD9:
	        btnList.get(6).doClick();
	        break;

	    case KeyEvent.VK_PERIOD :
	    case KeyEvent.VK_DECIMAL : 
	        btnList.get(16).doClick();
	        break;

	    case KeyEvent.VK_ENTER : 
	        btnList.get(18).doClick();
	    break;

	    case KeyEvent.VK_MINUS :
	    case KeyEvent.VK_SUBTRACT : 
	        btnList.get(15).doClick();
	    break;

	    case KeyEvent.VK_ESCAPE : 
	        btnList.get(1).doClick();
	    break;

	    case KeyEvent.VK_ADD : 
	        btnList.get(19).doClick();
	    break;

	    case KeyEvent.VK_MULTIPLY : 
	        btnList.get(11).doClick();
	    break;

	    case KeyEvent.VK_DIVIDE :
	    case KeyEvent.VK_SLASH : 
	        btnList.get(7).doClick();
	    break;

	    case KeyEvent.VK_BACK_SPACE : 
	        btnList.get(0).doClick();
	    break;
	    }

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    String input = e.getActionCommand(); // 이벤트를 발생시킨 객체의 문자열을 가져와서 input에 저장

	    if (input.equals("+")) {
	        num1 = num2;
	        func = "+";
	        nInput = ""; // 마지막에 누른 연산자 저장

	    } else if (input.equals("-")) {
	        num1 = num2;
	        func = "-";
	        nInput = "";

	    } else if (input.equals("×")) {
	        num1 = num2;
	        func = "×";
	        nInput = "";

	    } else if (input.equals("÷")) {
	        num1 = num2;
	        func = "÷";
	        nInput = "";

	    } else if (input.equals("%")) {
	        num1 = num2;
	        func = "%";
	        nInput = "";
	        result = num1 / 100;
	        label.setText(String.valueOf(result)); // 결과값을 문자열로 반환하여 결과창에 출력
	    }

	    else if (input.equals("x²")) {
	        num1 = num2;
	        func = "x²";
	        nInput = "";
	        result = num1 * num1;
	        label.setText(String.valueOf(result));
	        state = true;

	    } else if (input.equals("C")) { // Clear
	        nInput = "";
	        num2 = 0;
	        num1 = 0;
	        label.setText("0");

	        // substring(start, end) - start부터 end 전까지 문자열 자르기
	    } else if (input.equals("←")) { // 왼쪽부터 순차적으로 지워지도록 함
	        setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

	        if (getBackSpace().length() < 1) { // 더 이상 지울 숫자가 없으면, 0으로 clear
	            nInput = "";
	            num2 = 0;
	            num1 = 0;
	            label.setText("0");
	        }

	    } else if (input.equals("=")) {
	        if (func.equals("+")) {
	            result = num1 + num2;
	            label.setText(String.valueOf(result)); // 결과값을 문자열로 반환하여 결과창에 출력
	            state = true; // 결과 값이 나온 후 다음 입력이 들어왔을 때 화면에 표시된 결과 값을 지운다.

	        } else if (func.equals("-")) {
	            result = num1 - num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        } else if (func.equals("×")) {
	            result = num1 * num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        } else if (func.equals("÷")) {
	            result = num1 / num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        }

	    } else {
	        if (state) {
	            label.setText("0");
	            state = false;
	            num1 = 0;
	            num2 = 0;
	            nInput = "";
	        }

	        nInput += e.getActionCommand();
	        label.setText(nInput);
	        num2 = (int) Double.parseDouble(nInput); // 문자열에서 double형 변

	    }

	}

	private void setBackSpace(String bs) {
	    label.setText(bs);
	}

	private String getBackSpace() {
	    return label.getText();
	}

	public static void main(String[] args) {

	    Calculatorimsi calc = new Calculatorimsi();
	    JFrame frame = new JFrame("계산기");

	    frame.setResizable(true);  // 프레임 크기 사용자 지정
	    frame.setContentPane(calc.getView()); // 프레임에 컴포넌트 삽입
	    frame.setBounds(100, 100, 300, 350); // 프레임의 크기 지정
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼을 누르면 닫히는 설정
	    frame.setVisible(true);

	    }
}