package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0220 {
  public static void main(String[] args) {

    try(java.sql.Connection con =  DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb", //jdbcURL
        "study",
        "1111")) {

      System.out.println("DBMS연결됨!");
      System.out.println(con.getClass().getName());

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("DNMS와 연결 해제됨!");
  }
}

