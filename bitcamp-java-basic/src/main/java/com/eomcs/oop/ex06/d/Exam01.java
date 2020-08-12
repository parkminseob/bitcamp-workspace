package com.eomcs.oop.ex06.d;

public class Exam01 {
  public static void main(String[] args) {
    A a = new A();
    a.m(); //A의 멤버 호출 ok!
    //((A2)a).x(); // 컴파일은 통과하지만 A 객체를 A2객체라 우기지말기!
    System.out.println("-------------");

    A2 a2 = new A2();
    a2.m();
    a2.x();
    System.out.println("---------------");

    A a3 = new A2(); // 인간은 포유류다!
    a3.m();
    // 이럴 경우 포유류의 특징만 이야기해야한다.
    // 즉 A2에서 추가한 메서드를 호출할 수는 없는것이다!
    //a3.x(); //컴파일에러!

    // 물론 a3이 실제 A2객체를 가리키기 때문에
    // A2로 형변환 후 A2멤버를 사용할 수 있다.
    ((A2)a3).x();
    System.out.println("-----------");

  }
}
