package com.eomcs.oop.ex11.a.test;
//nested class : 로컬 클래스의 접근 제어

public class Exam0311 {
  static void m1() {
    // 로컬 변수처럼 로컬 클래스에는 접근 제어 modifier 를 붙일 수 없다.
    //private class A1 {}
    //protected class A2 {}
    //public class A3 {}

    class A4{}
  }

  void m2() {
    // 로컬 변수처럼 로컬 클래스에는 접근 제어 modifier 를 붙일 수 없다.
    //    private class B1 {}
    //    protected class B2 {}
    //    public class B3 {}

    class B4 {}

  }
}
