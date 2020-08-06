package com.eomcs.oop.ex03;

public class Exam0220 {
  static class A {
    int value;

    static void m1() {
    //this.value = 100;
    }

    void m2() {
      this.value = 100;
    }

    void m3() {
      this.value = 200;
      value = 200;
    }

    void m4(int value) {
      value = 200;

      this.value = 300;
    }
  }
  public static void main(String[] args) {
    A.m1();

    A obj1 = new A();

    obj1.m2();
    obj1.m1();

    A obj2 = new A();

    obj2.m2();
  }
}
