package com.eomcs.corelib.ex03.Test;

public class MyArrayListTest3 {
  public static void main(String[] args) {
   MyArrayList list1 = new MyArrayList();
   list1.add("aaa");
   list1.add("bbb");
   list1.add("ccc");
   list1.add("ddd");
   list1.add("eee");
   list1.add("fff");
   list1.add("ggg");
   print(list1);

   list1.set(0, "mmm");
   print2(list1);
   list1.remove(6);
   print(list1);


    MyArrayList list2 = new MyArrayList(10);
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");
    list2.add("jjj");
    list2.add("kkk");


    System.out.println("-------------");
    print2(list2);

  }

  static void print(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }

  static void print2(MyArrayList list) {
    Object[] arr;
    arr = list.toArray();
    for(Object obj : arr) {
      String str = (String) obj;
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
