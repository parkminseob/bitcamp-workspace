package com.eomcs.algorithm.data_structure.linkedlist.test;

public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add("aaa"); //aaa
    list.add("bbb"); //aaa,bbb
    list.add("ccc"); //aaa,bbb,ccc
    list.add("ddd"); //aaa,bbb,ccc,ddd

    print(list);
    System.out.println("----------");

    list.add(2, "xxx"); //aaa,bbb,xxx,ccc,ddd
    print(list);
    System.out.println("-------------");
    
    System.out.println(list.get(3)); //ccc
    //System.out.println(list.get(-4));
    System.out.println("------------");
    
    list.remove(0); //bbb,xxx,ccc,ddd
    print(list);
    
    System.out.println("------------");
    list.set(3, "yyy");
    print(list);
    
    System.out.println("-----------------");
    print2(list.toArray());
  }

  static void print(MyLinkedList list) {
    for(int i = 0; i < list.size; i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }
  
  static void print2(Object[] arr) {
    for(Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
