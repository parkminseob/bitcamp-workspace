package com.eomcs.corelib.ex03.Test;
// 최종형태 : 그냥 ArrayList 클래스 쓰기 

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {
   ArrayList list1 = new ArrayList();
   list1.add("aaa");
   list1.add("bbb");
   list1.add("ccc");
   list1.add("ddd");
   list1.add("eee");
   
    ArrayList list2 = new ArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");
    
    print(list1);
    System.out.println("-------------");
    print(list2);
    
    System.out.println("---------");
    Object obj = list1.get(4);
    System.out.println(obj);
    
    System.out.println("------------");
    obj = list1.set(3, "xxx");
    print(list1);
    System.out.println(obj);
    
    System.out.println("------------");
    obj = list1.remove(3);
    print(list1);
    System.out.println(obj);
    
  }
   
  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
