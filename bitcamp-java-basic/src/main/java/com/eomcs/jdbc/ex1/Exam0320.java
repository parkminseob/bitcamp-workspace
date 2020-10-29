package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0320 {
  public static void main(String[] args) {

    try(java.sql.Connection con =  DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement()) {

      System.out.println(stmt.getClass().getName());

      int count = stmt.executeUpdate(
          "insert into x_board(title,contents) values('제목10', '내용10')");
      System.out.printf("%d개 입력 성공!", count);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

