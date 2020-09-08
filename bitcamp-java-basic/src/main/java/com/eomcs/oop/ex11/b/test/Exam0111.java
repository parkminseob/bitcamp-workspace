package com.eomcs.oop.ex11.b.test;

class A2{
  static class X{
    static int v1;
    static void m1() {}
    static {}

    int v2;
    void m2() {}
    {}
  }
}
public class Exam0111 {
  public static void main(String[] args) {
    // 레퍼런스
    A2.X obj;

    //인스턴스
    obj = new A2.X();
  }
}
