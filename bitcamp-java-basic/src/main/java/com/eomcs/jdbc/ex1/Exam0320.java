package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0320 {
  public static void main(String[] args) {

    try(java.sql.Connection con =  DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();

        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id desc")) {

      boolean isReceived = rs.next(); // 서버에서 레코드를 하나 들고오라고 한다.
      // 가져오면 true, 못가져오면 false;

      if(isReceived) {
        // 서버에서 하나 들고온 결과를 출력한다.
        System.out.printf("%s, %s, %s, %s, %s\n",
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5));
      } else {
        System.out.println("서버에서 한 개의 레코드를 가져오지 못했음.");
      }
      //
      //      System.out.println(stmt.getClass().getName());
      //
      //      int count = stmt.executeUpdate(
      //          "insert into x_board(title,contents) values('제목10', '내용10')");

      //      System.out.printf("%d개 입력 성공!", count);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

