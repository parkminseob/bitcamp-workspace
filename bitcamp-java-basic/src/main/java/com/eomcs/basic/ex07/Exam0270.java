package com.eomcs.basic.ex07;

public class Exam0270 {

  //가변 파라미터의 단점

  // 1. 여러개 선언 불가, 중간에 다른 타입이 와서도 안됌.
  //static void m1(String... names, int a, String... scores) {}

  // 2. 가변 파라미터는 반드시 맨 끝에 와야한다.
  //static void m2(String... names, String a) {}
  static void m2(String a, String... str) {}

  public static void main(String[] args) {

  }
}
