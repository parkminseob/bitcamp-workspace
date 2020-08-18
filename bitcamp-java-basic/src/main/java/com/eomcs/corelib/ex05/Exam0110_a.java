package com.eomcs.corelib.ex05;

import java.util.Stack;

public class Exam0110_a {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    Stack stack = new Stack();

    stack.push(s1); //aaa
    stack.push(s2); //aaa,bbb
    stack.push(s3); //aaa,bbb,ccc
    print(stack);

    System.out.println("===>" + stack.pop()); //ccc
    System.out.println("===>" + stack.pop()); //bbb
    print(stack);


    stack.push(s4);
    stack.push(s5);
    System.out.println("-----------");
    String value;

    while((value = (String) stack.pop()) != null) {
      System.out.println(value);

      try {
        while(true) {
          System.out.println(stack.pop());
        }
      } catch (Exception e) {
        System.out.println("스택에서 꺼낼 데이터가 없습니다.");
      }
    }

  }
  static void print(Stack stack) {
    for(int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }
}
