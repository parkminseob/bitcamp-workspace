package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0130 {
  public static void main(String[] args) throws Exception{

    // Calendar 클래스의 경우도 생성자를 protected 로 막고 있다.
    // 즉 new 명령을 통해 바로 인스턴스를 생성할 수 없다.
    // 대신 클래스 메서드를 통해 생성하도록 유도하고 있다.
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    System.out.println(c1 == c2);


  }
}
