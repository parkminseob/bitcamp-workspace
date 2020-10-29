package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0340 {
  public static void main(String[] args) {

    try(java.sql.Connection con =  DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();

        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id desc")) {


      while (rs.next()) {
        // 서버에서 하나 들고온 결과를 출력한다.
        System.out.printf("%d, %s, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getString("contents"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

