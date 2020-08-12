package com.eomcs.oop.ex06.c;

public class D2 extends D{
  @Override
  void m() {
    System.out.println("D2의 m()");
  }

  void test() {
    // this 레퍼런스로 메서드를 호출하면
    // 현재 클래스에서 메서드를 찾아 호출한다.
    this.m();

    super.m();
  }
}
