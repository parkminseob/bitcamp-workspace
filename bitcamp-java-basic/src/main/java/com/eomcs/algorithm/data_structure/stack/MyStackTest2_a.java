package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest2_a {


  public static void main(String[] args) throws CloneNotSupportedException {

    MyStack06_a stack = new MyStack06_a();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    System.out.println("==>" + stack.peek());
    stack.push("ddd");
    stack.push("eee");

    print(stack);

    MyStack06_a stack2 = stack.clone();
    print(stack2);
  }
  static void print(MyStack06_a stack) {
    for(int i = 0; i<stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }

}
