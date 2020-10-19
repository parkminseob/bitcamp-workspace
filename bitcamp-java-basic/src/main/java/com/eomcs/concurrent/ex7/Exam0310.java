package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0310 {
  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중...\n",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }

  public static void main(String[] args) throws Exception {
    ExecutorService executorService  = Executors.newFixedThreadPool(3);

    // 스레드풀에 수행할 작업을 등록한다.
    // 스레드풀은 execute()를 호출한 순서대로 작업큐에 작업을 보관한다.
    // 그리고 놀고 있는 스레드가 있다면 작업 큐에서 작업을 꺼내 수행시킨다.
    // 놀고 있는 스레드가 없으면, 새로 스레드를 생성한다.
    // 수행한 작업의 종료 여부를 확인할 수 없다.
    executorService.execute(new MyRunnable(6000));

    System.out.println("main() 종료!");
  }
}
