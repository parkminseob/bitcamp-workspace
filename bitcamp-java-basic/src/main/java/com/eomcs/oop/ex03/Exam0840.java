package com.eomcs.oop.ex03;

public class Exam0840 {

  static class A {
    int b = 200;
    int c;

    // 인스턴스 필드 초기화 문장은
    // 생성자의 앞부분에 삽입된다.
    // 생성자가 없으면 기본 생성자가 생성되어 앞 부분에 삽입된다.

    public A() {
    // 인스턴스 필드를 초기화시키는 문장이 다음과 같이 삽입된다.
    //  a = 100;
    //  b = 200;
     c = 300;
    }
    int a = 100;
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);


  }
}
