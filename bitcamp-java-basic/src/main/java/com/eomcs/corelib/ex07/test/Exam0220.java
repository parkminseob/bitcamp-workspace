package com.eomcs.corelib.ex07.test;

import java.util.Iterator;
import java.util.LinkedList;

// Iterator 사용법
public class Exam0220 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    LinkedList list = new LinkedList();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);

    Iterator 컬렉션에서값을꺼내주는객체 = list.iterator();
    while (컬렉션에서값을꺼내주는객체.hasNext()) {
      System.out.print(컬렉션에서값을꺼내주는객체.next() + ",");
    }
    System.out.println();
  }
}
