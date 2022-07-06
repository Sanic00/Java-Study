package com.DBex;

import java.sql.*;

public class jdbcEx04 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		 
		sql.append("select deptno, dname, colleage, loc "); // ���ٷ� �� �ᵵ �ȴ�
		sql.append("from department");
		//sql.append("select *"); ���� �÷������� *�� ��ü �Ҽ��ִ�.
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * select ������ ���� ��� ���հ� ������տ��� �����͸� ������ �� �ִ� �޼ҵ带 
		 * ������ �ִ� ��ü�� ResultSet ��ü��
		 */
		
		 try {
			  // ����̹� �˻�
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  
			  String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			  String id = "scott";
			  String password = "tiger";
			  
			  // DB����
			  con = DriverManager.getConnection(url, id, password);
			  stmt = con.createStatement(); 
			
			  /*
			   * ���� �ϰ��� �ϴ� SQL�� select �� ���
			   * ���� ������ ��������� ���� ���� �� �ִ�
			   * executeQuery()�� �����
			   *  
			   */
			  rs = stmt.executeQuery(sql.toString());
			  
			  /*
			   *  ResultSet ��ü�� ���� ������ ����
			   *  ResultSet �� next() �޼ҵ�� Ŀ���� �������� �̵���Ŵ
			   *  �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ�� 
			   *  
			   *  rs.next()�� ���� ����, �� ��� ���տ� ���� �����ϴ� ���� ResultSet���κ���
			   *  �����͸� ��� ������
			   *  
			   *  while(rs.next()){
			   *  
			   *  
			   *  }
			   */
			  
			  while(rs.next()){
				  //Ŀ���� ��ġ�� row �� Column���� ���� �����ϱ�
				  //ResultSet �� getXXX(�÷�����ġ), getXXX("�÷� �̸�")
				  //�޼ҵ带 �̿��ؼ� column ���� ������
				  int i = rs.getInt(1); //�̰� �÷��� ��ȣ
			   // int i = rs.getInt("deptno"); // �̰� �÷��� �̸�
				  String s1 =rs.getString(2);
				  
				  int j = rs.getInt("colleage");
				  String s2 = rs.getString("loc");
				  System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2 );
				  
				  
			  }
			  
			  
		} catch (ClassNotFoundException cnfe) {
	     cnfe.printStackTrace();
		}catch (SQLException ss) {
		  ss.printStackTrace();
		}finally {
			try {if(rs !=null)rs.close();}catch(SQLException s) {}
			try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
			try {if(con !=null)con.close();}catch(SQLException s) {}
		}


	}

}
