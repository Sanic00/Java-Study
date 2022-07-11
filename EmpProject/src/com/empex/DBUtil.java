package com.empex;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	
	static final String Driver ="oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static Connection getConnection() throws Exception{
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url, "scott", "tiger");		
		return con;
		
	}
	
	
	
	
}
