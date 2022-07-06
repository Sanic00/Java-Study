package com.DBex;

import java.sql.*;
/*
 * JDBC(Java data base connetion�� ����)�� �̿��� �����ͺ��̽� ���� ���
 *  
 * �� 6�ܰ� �̷�����ִ�. 
 * 1.�ܰ� 
 * - import java.sql.*;
 * 2.�ܰ�
 * - Driver �˻��ܰ�
 *   oracle : oracle.jdbc.driver.OracleDriver
 * 3.�ܰ�
 * - DataBase ����
 *   Connection con = DriverManager.getConnetion(url, id, password);
 *   
 *   	oracle url �̶�? 
 *   	jdbc:oracle:thin:@localhost:1521:SID(oracle�� SID)
 *        id : ����Ŭ ����� ���� ex) scott
 *      password : ����Ŭ ����� ������ ��й�ȣ
 * ------------------------------��������� ������ �⺻�̴� --------------------------------------------
 * 4.�ܰ�
 *   -������ �ۼ�
 *   
 *   ���� -- ���� �������ִ°�
 *   statement Class(����)
 *   -Statemen stmt = con.createSTatement();
  	ResultSet re = stmt.ecequteQuery);// select
 * 	ResultSet re = stmt.insert);//  insert, update, delete
 *   ���� -- ���� ��Ȳ�� ���� �޸�
 *   PreparedStatment(����)
 *    -PreparedStatment pmst = con.prepareStatement(����);
 *    
 *       ResultSet re = stmt.ecequteQuery); //select
 *  ResultSet re = stmt.ecequteQuery);insert, update, delete
 * 
 * 
 * 5.�ܰ� : ���� ��� ����
 * ResultSet re = stmt.ecequteQuery);//
 * ResultSet re = stmt.insert);// 
 *  ResultSet re = stmt.ecequteQuery); //
 *  ResultSet re = stmt.ecequteQuery);
 *  
 *  6�ܰ� 
 *  - ����� �ݵ�� cloee() �޼ҵ带 �����Ѵ�
 *     �������� 
 * 123,6�ܰ�� ������ ������Ѵ�.
 */

public class JdbcEx01 {

	public static void main(String[] args) {
	// db ���� ��ü ����	
	 Connection con = null;
	 Statement stmt = null;
	 
	 
	 try { 
		 // jdbc ����̹� �޸𸮿� �ε��ϱ�
		 Class.forName("oracle.jdbc.driver.OracleDriver"); //orjdbc6 �� �ҷ����� ��ɾ�
		 // ���ᰴü ���
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	// System.out.println("�����ͺ��̽� ���� ����");	������ �����ߴ����� Ȯ���غ����� ��½�Ų����
	
		//Statement ��ü ��� (�����ͺ��̽� �����Ŀ�)
		 stmt = con.createStatement();
		 
		 // sql�� �ۼ�
		 StringBuffer sql = new StringBuffer();
		 sql.append("insert into department");  //�پ�� �߿� !
		 sql.append(" values(203, '����������а�', 200,'7ȣ��')"); //������ �и��� ���ߵȴ� db���� select*from department�� �ϴ� ���ֳ�
		 
		 //���� ����
		int result = stmt.executeUpdate(sql.toString()); //select�� ������ �������� excuteupdate�޼ҵ带 ��� select�� ������ �������� �����ͺ��̽��� �߰� ���� �������� �Ҷ� ���� ������ �Ǳ� ������
		// insert, update, delete �� ��� executeUpdate(sql.toString())
		// select �� ��� executeQuery();
		System.out.println(result+"���� ���� �߰��Ǿ����ϴ�.");
		 
	 }catch(ClassNotFoundException cnfe) {
		 cnfe.printStackTrace();
	
	 }catch (SQLException se) {
		 se.printStackTrace();
	}finally {
		try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
		try {if(con !=null)con.close();}catch(SQLException s) {}
	}
	// ���� DB�� �����Ҷ��� ������ ����ó�� ���� 
	 
		

	}

}
