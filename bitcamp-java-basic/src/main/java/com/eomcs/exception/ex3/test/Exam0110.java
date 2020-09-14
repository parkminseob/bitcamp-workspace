package com.eomcs.exception.ex3.test;

public class Exam0110 {

  static void m() {
    throw new RuntimeException("예외 발생!");
  }

  public static void main(String[] args) {

    try {
      m();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("시스템 종료");
  }
}
