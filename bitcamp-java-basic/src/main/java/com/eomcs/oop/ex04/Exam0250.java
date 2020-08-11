package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0250 {
  public static void main(String[] args) {
    // protected로 접근이 제한된 클래스는
    // 직접 생성자를 호출할 수 없다.
    //
    Calendar c = Calendar.getInstance();

    // 인스턴스 메서드 활용
    System.out.println(c.get(1)); //년도
    System.out.println(c.get(2) + 1); //월
    System.out.println(c.get(5)); //일
    System.out.println(c.get(7)); //요일(1~7)
    System.out.println(c.get(4)); //그 달의 몇번째 주?
    System.out.println(c.get(10)); // 시(12시간기준)
    System.out.println(c.get(11)); // 시(24시간기준)
    System.out.println(c.get(12)); // 분
    System.out.println(c.get(13)); // 초

   System.out.println("----------");

   System.out.println(c.get(Calendar.YEAR));
   System.out.println(c.get(Calendar.MONTH));
   System.out.println(c.get(Calendar.DATE));
   System.out.println(c.get(Calendar.DAY_OF_WEEK));
   System.out.println(c.get(Calendar.HOUR));
   System.out.println(c.get(Calendar.HOUR_OF_DAY));
   System.out.println(c.get(Calendar.MINUTE));
   System.out.println(c.get(Calendar.SECOND));

  }
}
