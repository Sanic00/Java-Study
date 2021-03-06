package com.DBex;

import java.sql.*;
/*
 * 트랜잭션(Transaction)
 * - 트랜잭션은 여러개의 작업을 하나의 논리적인 작업단위로 묶어주는 것 을 말함
 * 하나의 작업단위 내에 전체 작업들이 모두 올바르게 수행되거나 전체 작업이
 * 모두 수행되지 않도록 한다.
 * 
 * 트랜잭션 메소드 종류
 * 전부다 반환형은 void 
 * commit(), rollback(), rollback(SavePoint), setSavepoin(String name)
 * setSavepoint(String name), setAutoCommit(boolean value)
 * 
 */

public class jdbcEx08 {
	
	public static void main(String[] args) {
		/*
		 * Transaction : 논리적인 작업단위
		 * insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로 묶어서
		 * 쿼리 실행시 모든 작업이 정상처리 된 경우에는 commit을 실행해서 DB에 반영하고,
		 * 쿼리 실행중 하나라도 정상처리되지 않은 경우 rollback을 실행해서
		 * 작업단위내의 모든 작업을 취소한다.
		 *  
		 */
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department "); 
		sql1.append("values(?,?,?,?)"); 
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc = ? ");
		sql2.append("where deptno=?");
		
		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언

		 
		try {
			
			//////////////Transaction 시작///////////////
			//하나의 논리적인 작업단위 시작 
			 
			  // 데이터베이스 연결
			  con = ConnUtil.getConnection();
//			  autoCommit 기능 비활성화 시킴
			  //---------------첫번째 작업시작-----------------
//			  pstmt = con.prepareStatement(sql1.toString());
//		 	  
//			  pstmt.setInt(1, 255);
//		 	  pstmt.setString(2, "핵물리학과");
//			  pstmt.setInt(3, 200);
//			  pstmt.setString(4, "9호");
//			  pstmt.executeUpdate();
			  //----------------첫번째 작업종류----------------
			  
			  //---------------두번째 작업시작-----------------
			  pstmt = con.prepareStatement(sql2.toString());
		 	  pstmt.setString(1, "생명공학과");
		 	  pstmt.setString(2, "8호관");
		 	  pstmt.setInt(3, 255);
		 	  pstmt.executeUpdate();
			  
			  //---------------두번째 작업종류-----------------
			  // 쿼리가 정상적으로 실행된 경우 db에반영
			  con.commit();
			  System.out.println("db에 정상적으로 반영되었습니다.");
			 
			  
		
			 
		}catch (SQLException ss) {
			//커리가 정상적으로 실행되지 않을때 취소가 된다
		 
		
		try {
			con.rollback(); //여기서 중복 값이 들어오면 DB작업이 취소 된다.
			System.out.println("db에 작업이 취소 되었습니다."); 
		} catch (SQLException s) {
			s.printStackTrace();
		}
		
		
		}finally {
			
			try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
			try {if(con !=null)con.close();}catch(SQLException s) {}
		
		/////////////////////////트랜스잭션 종료//////////////////////////////////////
		}


	}
}
