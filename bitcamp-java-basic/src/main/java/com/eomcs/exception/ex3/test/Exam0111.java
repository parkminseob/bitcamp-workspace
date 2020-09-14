package com.eomcs.exception.ex3.test;

public class Exam0111 {
  static void m() {
    throw new RuntimeException("예외발생 ");
  }
  public static void main(String[] args) {
    m();
    System.out.println("종료");
  }
}
