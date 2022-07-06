package com.DBex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Template {
 // DB 연결의 기본 !!!!!!!!!!!!!!!!!!!!!!!!! 저장해서 쓰거라 
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		 
		sql.append(""); // 한줄로 쭉 써도 된다
		sql.append("");
		sql.append("");
		
		Connection con = null;
		Statement stmt = null;
		
		  try {
			  // 드라이버 검색
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  
			  String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			  String id = "scott";
			  String password = "tiger";
			  
			  // DB연결
			  con = DriverManager.getConnection(url, id, password);
			  
			  
		} catch (ClassNotFoundException cnfe) {
	     cnfe.printStackTrace();
		}catch (SQLException ss) {
		  ss.printStackTrace();
		}finally {
			try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
			try {if(con !=null)con.close();}catch(SQLException s) {}
		}

		}

	}


