package com.eomcs.oop.ex03;
// 인스턴스 초기화 블록 초기화와 생성자
public class Exam0750 {

  static class A {
    int a;
    int b;
    int c;


    {
      this.a = 101;
      System.out.println("첫 번째 인스턴스 초기화 블록");
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
  {
    this.a = 102;
    System.out.println("두번째");
  }

  {
    this.a = 103;
    System.out.println("세번째");
  }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);

  }
}
