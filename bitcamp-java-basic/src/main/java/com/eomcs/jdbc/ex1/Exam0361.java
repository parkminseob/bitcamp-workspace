package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0361 {
  public static void main(String[] args) {

    try(java.sql.Connection con =  DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement()) {

      System.out.println(stmt.getClass().getName());


      // 부모테이블의 데이터를 지우려면
      // 부모 테이블의 데이터를 참조하는 자식 테이블의 데이터를 먼저 지워야 한다.
      int count = stmt.executeUpdate(
          "delete from x_board_file where board_id = 4");
      System.out.printf("x_board_file 테이블 : %d개 데이터삭제 성공!\n", count);

      // 부모 테이블 데이터 지우기
      count = stmt.executeUpdate(
          "delete from x_board where board_id = 4");
      System.out.printf("x_board 테이블 : %d개 삭제 성공!\n", count);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

