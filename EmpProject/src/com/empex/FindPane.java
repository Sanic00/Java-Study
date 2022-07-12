package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	
	private JButton okb; // ok��ư
	private JButton rsb; //���¹�ư
	

	// ���� 
	String[] caption = {"��ȣ:","�̸�:", "��å:","����:","�μ�:"};
	
	
	
	public FindPane() {
		//���̾ƿ� ����
		setLayout(new GridLayout(7,1)); //caption�� �Ѱ� �� �þ�� 6 -> 7�� �ٲ۴�
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		//�Է� ���� �׸��� ���� 
		
		int i ;
		for(i=0; i<size; i++){ //����ϴ°� �ƴϰ� ��ȸ�ϴ°Ŷ� size -1 �� �����ʴ´�.
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			
			//�ؽ�Ʈ �ʵ带 �Է� �Ұ����� ���·� ����
			tf[i].setEditable(false); 
			
			//��� ��ȣ �� ��� �̸��� �˻��ؾ� �ϹǷ� �Է°����� ���·� �����.
			if(i == 0 || i == 1)
				tf[i].setEditable(true); 
			
			
		}
		

		jp[size] = new JPanel();
		
		okb = new JButton("���������ȸ");
		okb.addActionListener(this);
		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		
		add(jp[size]);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ�� �߻��� ��ư�� ĸ�� ���� ��� ��
		String ae_type = ae.getActionCommand(); 
		
		//�˻��� ��������� ������ VO��ü 
		EmployeeVO evo = null;
		//DataBase ó���� ���� DAO��ü 
		EmployeeDAO edvo = null;
		
		
		if(ae_type.equals(okb.getText())) {//��ȸ��ư�� ���� ���
			
			try {
				edvo = new EmployeeDAO();
				
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if( !sno.equals("") && !sname.equals("")) { // ��� ��ȣ �� �̸�
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				
				}else if(!sno.equals("") && sname.equals("")) { // �����ȣ��
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
					
				}else if(sno.equals("") && !sname.equals("")) { // �̸���
				
					evo = edvo.getEmployeeName(sname);
				}
				
				
				
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			}
			
			if(evo != null) { // �ش� ����� ���� ���� �ʴ´ٸ� �ʵ带 �ʱ�ȭ�� ����ߵȴ�.
				tf[0].setText(evo.getNo()+"");
				tf[1].setText(evo.getName()+"");
				tf[2].setText(evo.getJobGrade()+"");
				tf[3].setText(evo.getDepartment()+"");
				tf[4].setText(evo.getEmail());
			}else {
				JOptionPane.showMessageDialog(this, 
						"�˻� ���� !!!!");
			}
			
			
			
		}else if(ae_type.equals(rsb.getText())) { // �ٽ� ���� ��ư�� �������
			int size = caption.length;
			for(int i =0; i < size; i++) {
				tf[i].setText("");
			}
		}
		
		
		
		
		
		
		
		

	}

}
