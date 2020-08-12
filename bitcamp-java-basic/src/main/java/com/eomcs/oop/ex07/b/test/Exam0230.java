package com.eomcs.oop.ex07.b.test;

import java.util.Calendar;

public class Exam0230 {
  public static void main(String[] args) {

    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();

    System.out.println(cal1 == cal2);

    // getInstance() 메서드는 singleton 기능을 수행하는 메서드가 아니라
    // 복잡한 Calendar  객체를 대신 생성해주는 factory method로서 역할을 수행한다.

    // 생성자를 protected로 감추고 getInstance()를 public으로 공개했다.
    // 캡슐화를 응용한 예.
  }
}
