package com.eomcs.oop.ex09.c.test;
// 다중 인터페이스 구현 
// 클래스는 여러 개의 규칙을 이행할 수 있다.
public class Exam02 implements B, C {

  @Override
  public void m1() { //A의 인터페이스 구현 
  }

  @Override
  public void m3() { //C의 인터페이스 구현 
  }

  @Override
  public void m2() { //B의 인터페이스 구현 
  }

  public static void main(String[] args) {

    Exam02 obj = new Exam02();

    // 한 클래스가 여러 개의 인터페이스(사용규칙)을 구현했다면,
    // 각 인터페이스로 구분해서 그 객체를 사용할 수 있다.

    // B 인터페이스 레퍼런스에 담는다면 B 규칙에 따라 사용할 수 있고,
    // => Exam02 객체를 B용도로 사용해볼까?
    B obj2 = obj;
    obj2.m2(); // B.m2()
    obj2.m1(); // A.m1() <- 상속 받은 메서드 
    //obj2.m3();

    // C 인터페이스 레퍼런스에 담는다면 C 규칙에 따라 사용할 수 있다.
    // => "Exam02 객체"를 C 용도로 사용해볼까?
    C obj3 = obj;
    obj3.m3(); // C.m3()
    //obj3.m1();
    //obj3.m2();
  }
}
