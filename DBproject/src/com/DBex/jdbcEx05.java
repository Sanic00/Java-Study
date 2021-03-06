package com.DBex;

import java.sql.*;

/*
 * 오라클 전송된 SQL 문은 Parsing -> execute plan -> fetch의 작업을 한
 * 이후에는 SQL 문을 수행결과를 Data Buffer Cache 에 저장함
 * 
 * 똑같은 SQL이 접속되면 Library cache에 저장된 SQL의 Parsing 결과와 execute plan의 그대로
 * 사용하게 됨으로 속도 향상에 도움을 줌
 * 
 * PreparedStatement는 SQL의 형태는 동일하나 조건이나 변수값이  다른 문장을
 * 바인딩 변수를 사용해서 변수처리함으로써 항상 동일한 SQL문을 
 * 동일하게 처리하게 할 수 있다.
 * 
 *  --PreparedStatement 객체의 생성과 바인딩 변수의 사용
 *  
 *  바인딩변수란?
 *  실제 값으로 대체될 부분에 사용함      
 *  첫번쨰 ? -> deptno = 203 /두번쨰 ? -> dname = 컴퓨터공학 /세번째 ? -> college = 200 /네번째 ? -> loc =7호관 
 *  String sql = "insert into department values(?,?,?,?)";
 *  ? -> 바인딩 변수이다. 처음에는 ?를 사용해서 값을 받으면 그때 값을 변경 
 *  PreparedStatement pstmt = con.prepareStatement(sql);
 *  
 *  바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다 
 *  pstmt.setInt(1, 203); <- 1은 인덱스 순서 203은 값
 *  pstmt.setString(2, "컴퓨터공학");
 *  pstmt.setInt(3, 200);
 *  pstmt.setString(4, "7호관");
 *  
 *  ※※※※※ 중요! 바인딩 변수는 절대 컬럼명에는 사용 할 수 없다.
 */

public class jdbcEx05 {

	public static void main(String[] args) {
		
	//PreparedStatement 를 사용하는 경우 
	// 반드시 SQL쿼리에서 실제 값으로 대체될 부분을 ? 로 처리한다.
    // ? 는 DataBase에서 SQL실행시에 실제 값으로 대체됨
		
		StringBuffer sql = new StringBuffer();
		 
		sql.append("insert into professor "); // 한줄로 쭉 써도 된다
		sql.append("values(?,?,?,?,?,sysdate,?,?)");
		

		//이건 정적 statment일때 
		//sql.append("insert into professor"); // 한줄로 쭉 써도 된다
		//sql.append("values(9920,'홍길동','gildongHong','전임교수',250,sysdate,32,203)");
		
		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언
		
		  try {
			  // 데이터베이스 연결
			  con = ConnUtil.getConnection();
//			  System.out.println("데이터 베이스 연결 성공 @");
			  pstmt = con.prepareStatement(sql.toString());
			  
			  
			  //쿼리의 파라미터를 셋팅한다
			  // 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함 
			  pstmt.setInt(1, 9920);
			  pstmt.setString(2, "홍길동");
			  pstmt.setString(3, "gildongHong");
			  pstmt.setString(4, "전임교수");
			  pstmt.setInt(5, 250);
			  //원래 6번째는 date임 sysdate는 바인딩을 할 필요가없다 
			  pstmt.setInt(6, 32);
			  pstmt.setInt(7, 203); // 외래키이기 떄문에 값을 맞춰야됨 
			  
			  //쿼리 실행
			  int i = pstmt.executeUpdate();
			  System.out.println(i+"행이 추가 되었습니다.");
			  
			  
		}catch (SQLException ss) {
		  ss.printStackTrace();
		}finally {
			try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
			try {if(con !=null)con.close();}catch(SQLException s) {}
		}


	}

}
