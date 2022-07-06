package com.DBex;
import java.sql.*;

public class JdbcEx02 {

	
	
// update : 하과명 : 컴퓨터공학과 변경 조건  학과번호=203	
	
public static void main(String[] args) {
    
	StringBuffer sql = new StringBuffer();
 
	sql.append("update department "); // 한줄로 쭉 써도 된다 뛰어쓰기 꼭 해라 
	sql.append("set dname = '컴퓨터공학' ");
	sql.append("where deptno = 203");
	
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
		  
		  stmt = con.createStatement(); 
		  int reult = stmt.executeUpdate(sql.toString());
		  System.out.println(reult + " 개의 행이 수정되었습니다.");
		  
		  
		  
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


