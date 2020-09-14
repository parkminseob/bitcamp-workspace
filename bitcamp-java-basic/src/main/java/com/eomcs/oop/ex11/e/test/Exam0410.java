package com.eomcs.oop.ex11.e.test;

public class Exam0410 {
  interface A {
    void print();
  }
  static A obj = new A() {
    @Override
    public void print() {
      System.out.println("hello");
    }
  };
}
