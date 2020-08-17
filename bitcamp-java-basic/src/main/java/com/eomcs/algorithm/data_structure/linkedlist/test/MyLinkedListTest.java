package com.eomcs.algorithm.data_structure.linkedlist.test;

public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");

    print(list);
    System.out.println("----------");

    list.add(2, "xxx");
    print(list);
  }



  static void print(MyLinkedList list) {
    for(int i = 0; i < list.size; i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }
}
