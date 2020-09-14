package com.eomcs.oop.ex11.e.test;
//anonymous class - 호출할 수퍼 클래스의 생성자 지정하기

public class Exam0310 {
  // 클래스는 스태틱으로 선언해야만 스태틱 멤버에서 접근할 수 있다.
  static class A {
    String name;

    public A() {
      name = "이름없음";
    }
    public A(final String name) {
      this.name = name;
    }
    public void print() {
      System.out.println(name);
    }
  }
  public static void main(String[] args) {

    A obj = new A() {};
    obj.print();

    obj = new A("aaa"){};
    obj.print();
  }
}
