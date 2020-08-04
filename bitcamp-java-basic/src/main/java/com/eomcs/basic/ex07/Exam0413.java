package com.eomcs.basic.ex07;
// Heap 메모리를 초과시키는 방법.
import java.util.ArrayList;

// Stack과 Heap메모리 영역
//
public class Exam0413 {

  public static void main(String[] args) throws Exception {

    ArrayList list = new ArrayList();

    while(true) {
      list.add(createArray());
      Thread.currentThread().sleep(2000);
   }
  }

  static int[] createArray() {
   System.out.println(".");
    return new int[10_000_000];
  }
}