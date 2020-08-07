package com.eomcs.oop.ex03;

public class Exam0640 {
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
    //클래스가 로딩되는 경우.
    // 3) 해당 클래스의 인스턴스를 최초로 생성할 때
    // 인스턴스를 만드려면 설계도가 필요하고 즉시 설계도를 로딩할 것이다.
    new A();

    System.out.println("종료~");
  }

}
