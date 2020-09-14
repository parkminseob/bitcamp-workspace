package com.eomcs.exception.ex3.test;

public class Exam0212 {
  // Exception 계열의 예외를 던질 경우,
  // 반드시 메서드 선언부에 어떤 예외를 던지는지 지정해야 한다.
  // => 보통 개발자가 애플리케이션을 작성하면서
  // 예외를 던질 경우 이 클래스(및 하위 클래스)를 사용한다.
  static void m1() throws Exception {
    throw new Exception();
  }

  static void m2() {
    throw new Exception();
  }
  static void m3() throws String{
    throw new String();
  }
  public static void main(String[] args) {

  }
}
