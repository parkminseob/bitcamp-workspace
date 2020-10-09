package com.eomcs.concurrent.ex3;
public class Exam0230 {
  public static void main(String[] args) {

    Thread t = new Thread(() -> {
      for(int i = 0; i < 1000; i++) {
        System.out.println("===> "+ i);
      }
    });
    t.start();

    // "main" 스레드는 Thread와 상관없이 병행하여 실행한다.
    for(int i = 0; i < 1000; i++) {
      System.out.println(">>>> " + i);
    }
  }
}
