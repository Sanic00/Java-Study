package com.DBex;
import java.sql.*;

public class ConnUtil {

	static {// ���뿵�� ��ü ���̵� ����!
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      }catch (ClassNotFoundException cnfe) {
	         cnfe.printStackTrace();
	      }
	      
	   }
	   public static Connection getConnection() throws SQLException {
	      return DriverManager.getConnection(
	            "jdbc:oracle:thin:@localhost:1521:orcl",
	            "scott", "tiger"); // �����ϴ°� 

	       
	   }
	
}
