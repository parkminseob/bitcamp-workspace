package com.eomcs.oop.ex03;
// 인스턴스 초기화 블록 초기화와 생성자
public class Exam0730 {

  static class A {
    int a;
    int b;
    int c;
    {
      a = 100;
      System.out.println("Hi~");
    }

  A() {
    // 컴파일러는 필드 초기화나
    // 인스턴스 초기화 블록이 있으면
    // 선언된 순서대로 모든 생성자의 첫 부분에 복사됨.
    // 즉 위에 선언된 초기화 블록에 다 복사된다.

    System.out.println("A() 생성자 호출");
    b = 200;
    c = 300;
  }

  A(int b) {
    // 자바 컴파일러는 이 생성자에도 인스턴스 블록의 코드를 그대로 복사한다.
    // a = 100;
    // System.out.println("Hello!");

    System.out.println("A(int)");
    this.b = b;
    this.c = 300;
  }

  A(int b, int c) {
    // 자바 컴파일러는 이 생성자에도 인스턴스 블록의 코드를 그대로 복사한다.
    // a = 100;
    // System.out.println("Hello!");
    System.out.println("A(int, int)");
    this.b = b;
    this.c = c;
  }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
    System.out.println("-------------------------");

    A obj2 = new A(222);
    System.out.printf("a=%d, b=%d, c=%d\n", obj2.a, obj2.b, obj2.c);
    System.out.println("-------------------------");

    A obj3 = new A(222, 333);
    System.out.printf("a=%d, b=%d, c=%d\n", obj3.a, obj3.b, obj3.c);
    System.out.println("-------------------------");

  }
}
