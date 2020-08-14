package com.eomcs.corelib.ex03;

public class MyArrayListTest3 {
  public static void main(String[] args) {

    MyArrayList list1 = new MyArrayList();

    //aaa, bbb, ccc, ddd, eee
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");


    MyArrayList list2 = new MyArrayList();
    //fff, ggg, hhh, iii
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");

    print(list1);
    System.out.println("----------------");
    print(list2);

  }

  static void print(MyArrayList list) {
    for(int i = 0; i < list.size(); i++) {
      String str = (String)list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
