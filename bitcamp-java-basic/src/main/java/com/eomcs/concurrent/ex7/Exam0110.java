package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0110 {
  public static void main(String[] args) {
    // 스레드풀을 생성한다.
    // - 최대 3개의 스레드를 생성한다.
    ExecutorService threadPool = Executors.newFixedThreadPool(3);

    // 스레드풀에 작업 수행을 요구한다.
    // - 작업은 Runnable 구현체로 작성하여 넘겨준다.
    // - 스레드풀은 스레드를 생성하여 작업을 수행시킨다.
    threadPool.execute(() -> System.out.printf("%s 스레드 실행!\n",
        Thread.currentThread().getName()));

    System.out.println("main() 종료!");
    // JVM은 main스레드가 종료하더라도 나머지 스레드가 종료할 때까지
  }
}
