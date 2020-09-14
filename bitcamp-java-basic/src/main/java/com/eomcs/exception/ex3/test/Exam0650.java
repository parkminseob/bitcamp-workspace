package com.eomcs.exception.ex3.test;

public class Exam0650 {
  static class A{

  }
  static class B implements AutoCloseable {
    @Override
    public void close() throws Exception {
      System.out.println("B 클래스 자원 해제.");
    }
  }
  public static void main(String[] args) throws Exception {
    //B obj2 = null;

    try(
        obj2 = new B();
        ) {
      System.out.println("try블록 실행.");
    }

  }
}
