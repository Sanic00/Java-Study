package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class AddPane extends JPanel implements ActionListener, ItemListener{

	// 화면 관련 멤버 필드 정의 
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	
	private JButton okb; // ok버튼
	private JButton rsb; //리셋버튼
	
	private int department = 10;
	
	// 제목 
	String[] caption = {"이름:", "직책:","메일:","부서:"};
	
	public AddPane() {
		
		setLayout(new GridLayout(6,1));
		
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		//입력 받을 항목을 개수 
		
		
		
		// 텍스트 필드와 라벨을 패널에 묶어서 addPane에 추가
		int i ;
		for(i=0; i<size-1; i++){
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			
		}
		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);
		
		JComboBox combo = new JComboBox<>();
		combo.addItem("부서번호 선택 하세요.");
		for(int c = 1; c <=50; c++) {
			combo.addItem(c*10); // 돌아갈때마다 10씩 
		}
		
		jp[i].add(combo);
		
		combo.addItemListener(this);
		
		
		jp[size] = new JPanel();
		
		okb = new JButton("저장하기");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		
		add(jp[size]);
		
	
		
	}
	
	
	/*
	 * itemStateChanged(ItemEvent e)
	 * -comboBox의 내용을 선택할때 사용함
	 * 
	 */
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
	if(ie.getStateChange() == ItemEvent.SELECTED)
		department = Integer.parseInt(ie.getItem().toString()); //여기다 저장된다.
		
	}
	
	
	
	
	/*
	 *  actionPerformed(ActionEvent e)
	 *  저장하기 버튼을 누르면 텍스트 필드의 내용을 데이터베이스에 저장함
	 *  다시쓰기 버튼을 누르면 텍스트 필드를 초기화 함
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String ae_type = ae.getActionCommand(); //명령이 어떤건지
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		
		if(ae_type.equals(okb.getText())) {
			
			try {
				
				evo = new EmployeeVO( 0, tf[0].getText(),tf[1].getText(),
					department,	tf[2].getText());
				
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
				
				
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			}
			
			if(edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "님이 성공적으로 추가했습니다.");
				
			
		}else if(ae_type.equals(rsb.getText())) {
			int size = caption.length;
			for(int i =0; i < size-1; i++) {
				tf[i].setText("");
			}
		}
			
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
