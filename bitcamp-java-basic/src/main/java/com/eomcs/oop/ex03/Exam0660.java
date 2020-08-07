package com.eomcs.oop.ex03;
// 중복 로딩불가 확인하기
public class Exam0660 {
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

    //클래스는 중복로딩되지 않음
    A.a = 100;
    //A.m();
    //new A();
    //Class.forName("");

    //레퍼런스ㅡㄹㄹ 선언할 때는 클래스 로딩 안됌!
    //A obj;

    System.out.println("----------------------");
    //new A();
    //딱 한번만 로딩됨!
  }

}
