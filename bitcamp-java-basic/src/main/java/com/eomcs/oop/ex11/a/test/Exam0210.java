package com.eomcs.oop.ex11.a.test;

public class Exam0210 {
  // 중첩 클래스
  // 특정 클래스 안에서만 사용되는 클래스가 있다면 중첩 클래스로 선언하라.
  // 즉 노출 범위를 좁히는 것이 유지보수에 좋다.

  // static nested class
  // => 바깥 클래스의 인스턴스에 종속되지 않는 클래스.
  // => top level class 와 동일하게 사용한다.
  static class A{}

  static int a;
  static void m1() {}
  static {}

  // 2) non-static nested class = inner class
  // => 바깥 클래스의 인스턴스에 종속되는 클래스.
  // => 바깥 클래스의 인스턴스 없이 생성할 수 없다. 
  class B{}

  // 다른 인스턴스 멤버
  int b;
  void m2() {};
  {}

  public static void main(String[] args) {
    // 3) local class
    // 특정 메서드 안에서만 사용되는 클래스.
    class C{};

    // 4) anonymous class 
    // => 클래스의 이름이 없다.
    // => 클래스를 정의하는 동시에 인스턴스를 생성해야 한다.
    // => 클래스 이름이 없기 때문에 생성자를 정의할 수 없다.
    // => 만약 인스턴스의 값을 초기화시키기 위해 복잡한 코드를 작성해야 한다면,
    //    인스턴스 블록에 작성하라!
    // => 단 한 개의 인스턴스만 생성해서 사용할 경우 익명 클래스를 적용한다.
    // => 문법
    //      new 수퍼클래스() {클래스 정의}
    //      new 인터페이스() {클래스 정의}

    Object obj = new Object() {
      // Object 클래스를 상속 받은 익명 클래스를 만들고,
      // m1() 메서드를 추가한다.
      public void m1() {
        System.out.println("Hello!");
      }
    };
  }
}
