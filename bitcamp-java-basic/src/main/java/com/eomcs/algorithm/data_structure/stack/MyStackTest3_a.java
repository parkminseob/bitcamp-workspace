package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest3_a {


  public static void main(String[] args) throws Exception{

    MyStack07_a<String> stack = new MyStack07_a<>();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ddd");
    stack.push("eee");
    //stack.push(new Integer(100));
    print(stack);

    MyStack07_a<String> stack2 = stack.clone();
    print(stack2);

    stack2.pop();

    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    print(stack2);

    System.out.println("-------------");
    print(stack);
  }
  static void print(MyStack07_a<?> stack) {
    for(int i = 0; i<stack.size(); i++) {
      System.out.print(stack.get(i) + " ");
    }
    System.out.println();
  }

}
