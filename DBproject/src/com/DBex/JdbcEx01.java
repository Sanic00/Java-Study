package com.DBex;

import java.sql.*;
/*
 * JDBC(Java data base connetion의 약자)를 이용한 데이터베이스 연결 방법
 *  
 * 총 6단계 이루어져있다. 
 * 1.단계 
 * - import java.sql.*;
 * 2.단계
 * - Driver 검색단계
 *   oracle : oracle.jdbc.driver.OracleDriver
 * 3.단계
 * - DataBase 연결
 *   Connection con = DriverManager.getConnetion(url, id, password);
 *   
 *   	oracle url 이란? 
 *   	jdbc:oracle:thin:@localhost:1521:SID(oracle의 SID)
 *        id : 오라클 사용자 계정 ex) scott
 *      password : 오라클 사용자 계정의 비밀번호
 * ------------------------------여기까지는 무조건 기본이다 --------------------------------------------
 * 4.단계
 *   -쿼리문 작성
 *   
 *   정적 -- 같이 정해져있는거
 *   statement Class(정적)
 *   -Statemen stmt = con.createSTatement();
  	ResultSet re = stmt.ecequteQuery);// select
 * 	ResultSet re = stmt.insert);//  insert, update, delete
 *   동적 -- 값이 상황에 따라 달름
 *   PreparedStatment(동적)
 *    -PreparedStatment pmst = con.prepareStatement(쿼리);
 *    
 *       ResultSet re = stmt.ecequteQuery); //select
 *  ResultSet re = stmt.ecequteQuery);insert, update, delete
 * 
 * 
 * 5.단계 : 쿼리 결과 저장
 * ResultSet re = stmt.ecequteQuery);//
 * ResultSet re = stmt.insert);// 
 *  ResultSet re = stmt.ecequteQuery); //
 *  ResultSet re = stmt.ecequteQuery);
 *  
 *  6단계 
 *  - 사용후 반드시 cloee() 메소드를 실행한다
 *     연결해제 
 * 123,6단계는 무조건 실행야한다.
 */

public class JdbcEx01 {

	public static void main(String[] args) {
	// db 연결 객체 선언	
	 Connection con = null;
	 Statement stmt = null;
	 
	 
	 try { 
		 // jdbc 드라이버 메모리에 로드하기
		 Class.forName("oracle.jdbc.driver.OracleDriver"); //orjdbc6 를 불러오는 명령어
		 // 연결객체 얻기
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	// System.out.println("데이터베이스 연결 성공");	연결이 성공했는지를 확인해볼려고 출력시킨거임
	
		//Statement 객체 얻기 (데이터베이스 연결후에)
		 stmt = con.createStatement();
		 
		 // sql문 작성
		 StringBuffer sql = new StringBuffer();
		 sql.append("insert into department");  //뛰어쓰기 중요 !
		 sql.append(" values(203, '제어계측공학과', 200,'7호관')"); //공백이 분명히 들어가야된다 db에서 select*from department를 하니 들어가있넹
		 
		 //쿼리 실행
		int result = stmt.executeUpdate(sql.toString()); //select를 제외한 나머지에 excuteupdate메소드를 사용 select를 제외한 나머지는 데이터베이스에 추가 삭제 수정등을 할때 값이 변경이 되기 떄문에
		// insert, update, delete 일 경우 executeUpdate(sql.toString())
		// select 일 경우 executeQuery();
		System.out.println(result+"개의 행이 추가되었습니다.");
		 
	 }catch(ClassNotFoundException cnfe) {
		 cnfe.printStackTrace();
	
	 }catch (SQLException se) {
		 se.printStackTrace();
	}finally {
		try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
		try {if(con !=null)con.close();}catch(SQLException s) {}
	}
	// 위에 DB를 연결할때는 무조건 위에처럼 쓴다 
	 
		

	}

}
