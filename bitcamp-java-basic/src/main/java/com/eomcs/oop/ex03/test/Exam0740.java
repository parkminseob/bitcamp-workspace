package com.eomcs.oop.ex03.test;

public class Exam0740 {
  static class A {
    int a;
    int b;
    int c;
  
    {
      this.a = 101;
      System.out.println("first");
    }
    
    {
      this.a = 102;
      System.out.println("second");
    }
    
    {
      this.a = 103;
      System.out.println("third");
    }
    A(){
      // 인스턴스 초기화 블록은 선언된 순서대로 삽입한다.
      // 즉 다음과 같다.
      // this.a = 101;
      // System.out.println("첫 번째 인스턴스 초기화 블록");
      // this.a = 102;
      // System.out.println("두 번째 인스턴스 초기화 블록");
      // this.a = 103;
      // System.out.println("세 번째 인스턴스 초기화 블록");

      System.out.println("A()");
      b = 200;
      c = 300;
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
  }
}
