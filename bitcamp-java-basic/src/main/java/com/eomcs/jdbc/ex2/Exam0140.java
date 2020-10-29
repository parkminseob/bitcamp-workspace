package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0140 {
  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    String no = null;

    try (Scanner keyScan = new Scanner(System.in)){

      System.out.print("번호? ");
      no = keyScan.nextLine();

      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      String sql = String.format(
          "update x_board set title='%s' ,contents='%s' where board_id=%s",
          title, contents, no);
      int count = stmt.executeUpdate(sql);

      if(count == 0) {
        System.out.println("해당 번호의 게시글이 없습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
    }
  }
}
