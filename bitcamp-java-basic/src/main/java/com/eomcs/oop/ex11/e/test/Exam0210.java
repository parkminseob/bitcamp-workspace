package com.eomcs.oop.ex11.e.test;
//anonymous class - 클래스 상속

public class Exam0210 {
  // 클래스는 스태틱으로 선언해야만 스태틱 멤버에서 접근할 수 있다.
  static abstract class A {
    public abstract void print();
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
