package com.eomcs.oop.ex03;

public class Exam0610_a {
  public static class A{
  static int a;

  static void m() {}

    // 클래스가 로딩될 때 스태틱 초기화 블록이 실행된다.
    // 여러 개의 스태틱 블록이 있을때 컴파일러는 하나의 블록으로 합침.

  static {
    System.out.println("Static{} 11111");
  }
  static {
    System.out.println("Static{} 22222");
   }
  }
  public static void main(String[] args) {
    //레퍼런스 선언 때 클래스가 로딩되지 않음
    //스태틱 초기화 블록 실행 안됌.
    A obj1;
    A obj2;
    System.out.println("종료~");
  }

}
