package com.eomcs.oop.ex11.e.test;
//anonymous class : 로컬 클래스 vs 익명 클래스

public class Exam0120 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
  interface A {
    void print();
  }
  public static void main(String[] args) {

    A obj = new A() {
      @Override
      public void print() {
        System.out.println("hello");
      }
    };
    obj.print();
  }
}
