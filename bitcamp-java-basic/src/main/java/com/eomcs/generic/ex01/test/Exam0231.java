package com.eomcs.generic.ex01.test;

import java.util.ArrayList;

public class Exam0231 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */
  public static void main(String[] args) {
    ArrayList<B1> list = new ArrayList<>();

    // ArrayList의 항목 타입을 B1으로 지정했기 때문에  
    // ArrayList의 메서드 파라미터나 리턴 타입은 B1으로 설정된다.

    // => add(B1)
    //    list.add(new Object());
    //    list.add(new String());
    //    list.add(new Integer(100));
    //    list.add(new Member("홍길동", 20));
    //    list.add(new A());
    list.add(new B1());
    //    list.add(new B2());
    list.add(new C());

    System.out.println("종료!");
  }
}
