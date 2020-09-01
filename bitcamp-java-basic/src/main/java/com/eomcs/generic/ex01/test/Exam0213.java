package com.eomcs.generic.ex01.test;

import java.util.ArrayList;

public class Exam0213 {

  static class A {}
  static class B1 extends A{}
  static class B2 extends A{}
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
    ArrayList<A> list1;

    list1 = new ArrayList(); //이렇게 하지 말것
    //list1 = new ArrayList<Object>(); //안됌.
    list1 = new ArrayList<>();
    list1 = new ArrayList<A>();
    //list1 = new ArrayList<B1>(); //안됌.
    //list1 = new ArrayList<B2>(); //안됌
    //list1 = new ArrayList<C>(); //안댐

    ArrayList<B2> list2;

    list2 = new ArrayList(); //하지마!
    //list2 = new ArrayList<Object>();
    list2 = new ArrayList<>();
    //list2 = new ArrayList<A>();
    //list2 = new ArrayList<B1>();
    list2 = new ArrayList<B2>();
    //list2 = new ArrayList<C>();
  }
}
