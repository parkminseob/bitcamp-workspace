package com.eomcs.oop.ex11.a.test;

// top level class : 접근 범위 

// top level class
// 패키지에 소속된 클래스다.
public class Exam0110 {
  public static void main(String[] args) {
    // public으로 공개된 클래스는 다른 패키지에서 접근할 수 있다.
    com.eomcs.oop.ex11.a.sub.A obj1 = new com.eomcs.oop.ex11.a.sub.A();
  }
}
