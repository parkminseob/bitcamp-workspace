package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {

    ArrayList list1 = new ArrayList();

    //aaa, bbb, ccc, ddd, eee
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");


    ArrayList list2 = new ArrayList();
    //fff, ggg, hhh, iii
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");

    print(list1);
    System.out.println("----------------");
    print(list2);

  }

  static void print(ArrayList list) {
    for(int i = 0; i < list.size(); i++) {
      String str = (String)list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
