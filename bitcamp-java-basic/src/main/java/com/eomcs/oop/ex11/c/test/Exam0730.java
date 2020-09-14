package com.eomcs.oop.ex11.c.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam0730 {
  public static void main(String[] args) {

    final ArrayList<String> m1 = new ArrayList<>();
    m1.add("AAA");
    m1.add("BBB");
    m1.add("CCC");

    // ArrayList 도 Iterator 구현체를 inner class 로 갖고 있다.
    // iterator() 메서드는 이 구현체를 생성하여 리턴한다.
    //
    final Iterator<String> i1 = m1.iterator();
    final Iterator<String> i2 = m1.iterator();

    while(i1.hasNext()) {
      System.out.println(i1.next());

    }
    System.out.println("---");

    while(i2.hasNext()) {
      System.out.println(i2.next());
    }
    System.out.println("---");
  }
}
