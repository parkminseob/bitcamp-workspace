package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0220 {
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
        PreparedStatement stmt = con.prepareStatement(
            "update x_board set title = ?, contents = ? where board_id = ?")) {

      stmt.setString(1, title); // int column의 값을 setString()으로 바꿀 수 있음.
      stmt.setString(2, contents);
      stmt.setString(3, no);

      // preparedStatement에서는 sql문을 서버에 보내기 위해
      // executeUpdate()를 호출할 때 파라미터로 전달하지 않는다.
      // 이미 객체를 생성할 때 sql문을 준비했기 때문이다!
      int count = stmt.executeUpdate();
      if(count == 0) {
        System.out.println("해당 번호의 게시글이 없습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
    }
  }
}
