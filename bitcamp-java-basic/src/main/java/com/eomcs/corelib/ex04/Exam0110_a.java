package com.eomcs.corelib.ex04;

import java.util.LinkedList;

public class Exam0110_a {
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

    System.out.println(list.get(0)); //aaa
    System.out.println(list.get(1)); //bbb
    System.out.println(list.get(2)); //ccc

    System.out.println(list.size()); //3

    System.out.println(list.remove(1)); //aaa,ccc
    print(list);

    list.add(0, s2); //bbb,aaa,ccc
    print(list);

    list.add(s4); //bbb,aaa,ccc,ddd
    print(list);

    list.add(4, "xxx");
    print(list);
  }
  static void print(LinkedList list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }

}
