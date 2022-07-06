package com.DBex;

import java.sql.*;

public class jdbcEx06 {

	
	public static void main(String[] args) {
		
			StringBuffer sql = new StringBuffer();
			 
			sql.append("update professor "); // ���ٷ� �� �ᵵ �ȴ�
			sql.append("set sal = ?"); //������ ���⼭ ���ε� �Լ��� 
			sql.append("where name = ?");
			
			Connection con = null;
			PreparedStatement pstmt = null; // ���� ��ü ����
			
			  try {
				  // �����ͺ��̽� ����
				  con = ConnUtil.getConnection();
//				  System.out.println("������ ���̽� ���� ���� @");
				  pstmt = con.prepareStatement(sql.toString());
				  
				  
				  //������ �Ķ���͸� �����Ѵ�
				  // ������ ?(���ε� ����)�� ��ü�� �������� ������ 
				  pstmt.setInt(1, 500); //���� ������append �Ķ���� �ε����� ���� �޶���
				  pstmt.setString(2, "ȫ�浿");
				 
				  //���� ����
				  int i = pstmt.executeUpdate();
				  System.out.println(i+"���� ���� �Ǿ����ϴ�.");
				  
				  
			}catch (SQLException ss) {
			  ss.printStackTrace();
			}finally {
				try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
				try {if(con !=null)con.close();}catch(SQLException s) {}
			}


		}
}
