package com.eomcs.corelib.ex06;

import java.util.concurrent.ArrayBlockingQueue;

//Queue
public class Exam0110_a {
  public static void main(String[] args) {

    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    queue.offer(s1); //aaa
    queue.offer(s2); //aaa,bbb
    queue.offer(s3); //aaa,bbb,ccc
    print(queue);

    System.out.println("==>" + queue.poll()); // bbb,ccc
    System.out.println("==>" + queue.poll()); // ccc
    print(queue);

    queue.offer(s4);
    queue.offer(s5);
    print(queue);

    System.out.println("-------------------");
    String value;
    while ((value = (String) queue.poll()) != null) {
      System.out.println(value);
    }
  }
  static void print(ArrayBlockingQueue queue) {
    Object[] arr = queue.toArray();
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
}
