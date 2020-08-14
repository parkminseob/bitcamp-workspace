package com.eomcs.corelib.ex02.test;
//Calendar
import java.util.Calendar;

public class Exam0410 {
  public static void main(String[] args) {

    Calendar c1;

    // 캘린더의 생성자는 protected라서 직접 생성자를 호출할 수 없다.
    // Calendar 인스턴스 생성을 도와주는 별도의 클래스메서드를 제공한다.
    c1 = Calendar.getInstance();
    System.out.println(c1.get(Calendar.YEAR));
  }
}
