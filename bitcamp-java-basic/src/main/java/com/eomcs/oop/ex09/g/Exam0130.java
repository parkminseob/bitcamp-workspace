// 인터페이스의 스태틱 메서드 호출
package com.eomcs.oop.ex09.g;

public class Exam0130 {
  public static void main(String[] args) {
    Exam0110 obj = new Exam0110();

    // 수퍼 클래스의 메서드 호출 
    obj.x1(); // 수퍼 클래스의 스태틱 메서드를 호출할 수 있다.
    obj.x2(); // 수퍼 클래스의 인스턴스 메서드를 호출할 수 있다.

    // 인터페이스의 메서드 호출
    obj.m1(); // 인터페이스의 스태틱 메서드를 호출할 수 없다.
  }
}
