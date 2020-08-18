package com.eomcs.corelib.ex07.test;

import java.util.ArrayList;

// HashSet vs ArrayList
// ArrayList는 중복을 허용한다.
public class Exam0120 {
  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");

    ArrayList list = new ArrayList();
    list.add(v1);
    list.add(v2);
    list.add(v3);
    list.add(v4);
    list.add(v5);

    print(list);
 }

  static void print(ArrayList list) {
    Object[] arr = list.toArray();
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
}
