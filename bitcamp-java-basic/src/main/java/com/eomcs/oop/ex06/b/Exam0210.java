package com.eomcs.oop.ex06.b;
// 메서드 오버로딩 정의규칙과 사용규칙
public class Exam0210 {
  public static void main(String[] args) {
    A.m();
    A.m(100);
    A.m("Hello");
    A.m(100, "Hello");
    A.m("Hello", 100);
  }
}
