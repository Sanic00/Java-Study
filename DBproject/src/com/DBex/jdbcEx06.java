package com.DBex;

import java.sql.*;

public class jdbcEx06 {

	
	public static void main(String[] args) {
		
			StringBuffer sql = new StringBuffer();
			 
			sql.append("update professor "); // 한줄로 쭉 써도 된다
			sql.append("set sal = ?"); //동적은 여기서 바인딩 함수로 
			sql.append("where name = ?");
			
			Connection con = null;
			PreparedStatement pstmt = null; // 동적 객체 선언
			
			  try {
				  // 데이터베이스 연결
				  con = ConnUtil.getConnection();
//				  System.out.println("데이터 베이스 연결 성공 @");
				  pstmt = con.prepareStatement(sql.toString());
				  
				  
				  //쿼리의 파라미터를 셋팅한다
				  // 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함 
				  pstmt.setInt(1, 500); //위에 쿼리문append 파라미터 인덱스에 따라 달라짐
				  pstmt.setString(2, "홍길동");
				 
				  //쿼리 실행
				  int i = pstmt.executeUpdate();
				  System.out.println(i+"행이 수정 되었습니다.");
				  
				  
			}catch (SQLException ss) {
			  ss.printStackTrace();
			}finally {
				try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
				try {if(con !=null)con.close();}catch(SQLException s) {}
			}


		}
}
