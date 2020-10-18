package com.eomcs.concurrent.ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam0210_b {
  static class MyThread extends Thread {
    ThreadPool pool;
    int count;

    public MyThread(String name, ThreadPool pool) {
      super(name);
      this.pool = pool;
    }

    public void setCount(int count) {
      this.count = count;
      // 여기서 사용하는 this는 MyThread 기본 생성자??
      synchronized (this) {
        notify();
      }
    }

    @Override
    public void run() {
      synchronized (this) {
        try {
          while(true) {
            // 작업하라는 알림이 올 때까지 기다린다.
            wait();

            // 알림이 오면 작업을 실행한다.
            for(int i = count; i > 0; i--) {
              System.out.printf("[%s] %d\n", getName(), i);
              Thread.sleep(2000);
            }

            // 작업이 끝났으면 스레드폴로 돌아간다.
            pool.add(this);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

  interface ThreadPool {
    Thread get();
    void add(Thread obj);
  }

  static class MyThreadPool implements ThreadPool {
    ArrayList<MyThread> list = new ArrayList<>();

    public MyThreadPool() {
      MyThread t1 = new MyThread("1번 스레드 =>", this);
      MyThread t2 = new MyThread("2번 스레드***>", this);
      MyThread t3 = new MyThread("3번 스레드-->", this);

      t1.start();
      t2.start();
      t3.start();

      list.add(t1);
      list.add(t2);
      list.add(t3);
    }

    @Override
    public MyThread get() {
      if(list.size() > 0) {
        return list.remove(0);
      }
      return null;
    }

    @Override
    public void add(Thread t) {
      list.add((MyThread) t);
    }
  }

  public static void main(String[] args) {

    // 스레드풀 준비!
    MyThreadPool threadPool = new MyThreadPool();

    Scanner keyScan = new Scanner(System.in);

    while(true) {
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if(str.equals("quit")) {
        break;
      }
      int count = Integer.parseInt(str);

      MyThread t = threadPool.get();
      if(t == null) {
        System.out.println("남는 스레드가 없습니다!");
        continue;
      }

      t.setCount(count);
    }
    System.out.println("main 스레드 종료!");
    keyScan.close();
  }
}
