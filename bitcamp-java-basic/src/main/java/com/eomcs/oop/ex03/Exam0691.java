package com.eomcs.oop.ex03;

// 클래스 로딩 순서 이해하기
public class Exam0691 {
  public static class A{
    static int a = 7;

    static {
      System.out.println("A.static{}");
      a += B.b; //a = 36
    }

  }
  static class B{
    static int b = 22;

    static {
      System.out.println("B.static{}");
      b += A.a; // b = 29
    }
  }

  public static void main(String[] args) {
    System.out.println(A.a);
    System.out.println(B.b);
  }
}
