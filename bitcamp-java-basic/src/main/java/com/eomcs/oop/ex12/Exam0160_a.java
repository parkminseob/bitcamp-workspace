package com.eomcs.oop.ex12;
// lamda문법 : 익명 클래스를 사용할 수 있는 곳에는 모두 람다 사용 가능.
public class Exam0160_a {
  interface A {
    void print();
  }

  static A obj = () -> System.out.println("스태틱 필드");

  A obj2 = () -> System.out.println("인스턴스 필드");

  public static void main(String[] args) {

    A obj3 = () -> System.out.println("로컬 변수");

    m1(() -> System.out.println("파라미터"));
  }

  static void m1(final A obj) {
    obj.print();
  }
}
