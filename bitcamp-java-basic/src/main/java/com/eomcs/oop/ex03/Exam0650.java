package com.eomcs.oop.ex03;

public class Exam0650 {
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
  public static void main(String[] args) throws Exception{
    //클래스가 로딩되는 경우.
    // 4) 자바에서 제공하는 도구를 사용하여 클래스를 로딩할 때,
    // 이미 클래스가 로딩되어있다면 다시 로딩하지 않음.

    Class.forName("com.eomcs.oop.ex03.Exam0650$A");
    //이 명령어는 ()안에 패키지를 로딩하는 명령임.

    System.out.println("종료~");
  }

}
