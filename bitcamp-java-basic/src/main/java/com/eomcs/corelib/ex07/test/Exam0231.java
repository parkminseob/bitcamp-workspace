package com.eomcs.corelib.ex07.test;
// 스택에 잇터레이터를 썼을 때 스택방식으로 출력하고 싶다면
// ArrayDeque를 써야한다.
import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0231 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayDeque stack = new ArrayDeque();
    stack.push(s1);
    stack.push(s2);
    stack.push(s3);
    stack.push(s4);
    stack.push(s5);

    Iterator get = stack.iterator();
    while(get.hasNext()) {
      System.out.print(get.next() + ",");
    }
    System.out.println();
  }
}
