package com.eomcs.oop.ex04;

import java.util.Date;

public class Exam0240 {
  public static void main(String[] args) throws Exception{
    Date d1 = new Date();

    // 인스턴스 메서드 활용
    // 메서드명에 취소선이 그어져 있는것은 활용도가 낮아 곧 없어질 예정이므로
    // 다른 메서드를 사용해주도록 한다.

    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());

    // 스태틱 메서드 활용
    long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
        System.out.println(millis);

        // 실무에서는 java.util.Date 대신 이 클래스의 자식 클래스인
        // java.sql.Date을 쓰기도 한다.
        // 이 클래스는 날짜 데이터를 문자열로 다룰 때
        // yyyy-MM-dd 형식으로 다루기 때문에 편리하다.

      long currMillis = System.currentTimeMillis();

      java.sql.Date today = new java.sql.Date(currMillis);

      String str = today.toString();
      System.out.println(str);

      java.sql.Date d = java.sql.Date.valueOf("2019-12-30");
      System.out.println(d);


  }
}
