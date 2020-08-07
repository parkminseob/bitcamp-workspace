package com.eomcs.oop.ex03;

public class Exam0630 {
  public static class A{
  static int a;

  static void m() {
    System.out.println("m메소드");
  }

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
    //클래스가 로딩되는 경우.
    // 2) 클래스 멤버(필드와 메서드) 최초 사용할때.

    A.m();
    System.out.println("종료~");
  }

}
