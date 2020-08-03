package com.eomcs.basic.ex07;

public class Exam0221 {
  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 안녕하시오?\n", age, name);
  }

  public static void main(String[] args) {

    hello("홍길동" , 20);
    hello("유관순", 30);
    hello("신사임당", 50);
  }
}
