package com.eomcs.concurrent.ex3;
//스레드 만들기 II - Runnable 인터페이스 구현 + Thread

public class Exam0220 {
  public static void main(String[] args) {

    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 1000; i++) {
          System.out.println("===> "+ i);
        }
      }
    });
    t.start();

    // "main" 스레드는 Thread와 상관없이 병행하여 실행한다.
    for(int i = 0; i < 1000; i++) {
      System.out.println(">>>> " + i);
    }
  }
}
