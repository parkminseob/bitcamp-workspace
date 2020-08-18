package com.eomcs.algorithm.data_structure.linkedlist.test2;

public class MyLinkedLisTest {
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    print(list);
    System.out.println("-----------");

    list.add​(1, "xxx");
    print(list);
    System.out.println("-----------");

    list.remove(1); //aaa,bbb,ccc,ddd
    print(list);

    System.out.println("------------");
    list.set​(1, "yyy"); //aaa,yyy/ccc,ddd
    print(list);
  }


  static void print(MyLinkedList list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+ ",");
    }
    System.out.println();
  }

}
