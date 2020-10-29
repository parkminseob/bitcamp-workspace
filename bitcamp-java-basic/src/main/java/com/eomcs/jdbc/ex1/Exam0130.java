package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0130 {
  public static void main(String[] args) {
    try {

      // 무조건 패키지 이름을 다 포함해서 적어줘야 한다.
      // 클래스가 로딩되면 무조건 스태틱블록 먼저실행 -> 알아서 자기자신을 등록하여 객체 생성한다.
      Class.forName("org.mariadb.jdbc.Driver");
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);

      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
