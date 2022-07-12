package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	
	private JButton okb; // ok버튼
	private JButton rsb; //리셋버튼
	

	// 제목 
	String[] caption = {"번호:","이름:", "직책:","메일:","부서:"};
	
	
	
	public FindPane() {
		//레이아웃 설정
		setLayout(new GridLayout(7,1)); //caption이 한개 더 늘어나서 6 -> 7로 바꾼다
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		//입력 받을 항목을 개수 
		
		int i ;
		for(i=0; i<size; i++){ //등록하는게 아니고 조회하는거라 size -1 을 하지않는다.
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			
			//텍스트 필드를 입력 불가능한 상태로 만듬
			tf[i].setEditable(false); 
			
			//사원 번호 와 사원 이름은 검색해야 하므로 입력가능한 상태로 만든다.
			if(i == 0 || i == 1)
				tf[i].setEditable(true); 
			
			
		}
		

		jp[size] = new JPanel();
		
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		
		add(jp[size]);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트가 발생한 버튼의 캡션 값을 얻어 옴
		String ae_type = ae.getActionCommand(); 
		
		//검색한 사원정보를 저장한 VO객체 
		EmployeeVO evo = null;
		//DataBase 처리를 위한 DAO객체 
		EmployeeDAO edvo = null;
		
		
		if(ae_type.equals(okb.getText())) {//조회버튼을 누를 경우
			
			try {
				edvo = new EmployeeDAO();
				
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if( !sno.equals("") && !sname.equals("")) { // 사원 번호 와 이름
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				
				}else if(!sno.equals("") && sname.equals("")) { // 사원번호만
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
					
				}else if(sno.equals("") && !sname.equals("")) { // 이름만
				
					evo = edvo.getEmployeeName(sname);
				}
				
				
				
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			}
			
			if(evo != null) { // 해당 사원이 존재 하지 않는다면 필드를 초기화를 해줘야된다.
				tf[0].setText(evo.getNo()+"");
				tf[1].setText(evo.getName()+"");
				tf[2].setText(evo.getJobGrade()+"");
				tf[3].setText(evo.getDepartment()+"");
				tf[4].setText(evo.getEmail());
			}else {
				JOptionPane.showMessageDialog(this, 
						"검색 실패 !!!!");
			}
			
			
			
		}else if(ae_type.equals(rsb.getText())) { // 다시 쓰기 버튼을 누를경우
			int size = caption.length;
			for(int i =0; i < size; i++) {
				tf[i].setText("");
			}
		}
		
		
		
		
		
		
		
		

	}

}
