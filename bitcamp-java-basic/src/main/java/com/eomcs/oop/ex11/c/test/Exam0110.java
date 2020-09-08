package com.eomcs.oop.ex11.c.test;


class A {
  class X{}
}

public class Exam0110 {
  public static void main(String[] args) {
    A.X obj;

    obj = new A.X();

    A outer = new A();

    obj = outer.new X();
  }
}
