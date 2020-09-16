package com.eomcs.oop.ex12;
//lambda 문법 : 익명 클래스를 사용할 수 있는 곳에는 모두 람다 사용 가능

public class Exam0160 {
  interface A {
    void print();
  }

  // 스태틱 필드
  static A obj1 = () -> System.out.println("스태틱 필드");

  // 인스턴스 필드
  A obj2 = () -> System.out.println("인스턴스 필드");

  public static void main(String[] args) {

    Exam0160 ex = new Exam0160();

    m1(obj1);
    m1(ex.obj2);

    // 로컬 변수
    A obj3 = () -> System.out.println("로컬 변수");
    m1(obj3);

    // 파라미터
    m1(() -> System.out.println("파라미터 구현"));
  }

  static void m1(final A obj) {
    obj.print();
  }
}
