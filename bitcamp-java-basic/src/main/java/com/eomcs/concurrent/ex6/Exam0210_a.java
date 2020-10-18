package com.eomcs.concurrent.ex6;

import java.util.ArrayList;
import java.util.Scanner;

// 멀티 스레드 재활용 - Pooling 기법을 이용하여 생성된 객체를 재활용하기
public class Exam0210_a {
  static class MyThread extends Thread {
    ThreadPool pool;
    int count;

    public MyThread(String name, ThreadPool pool) {
      super(name);
      this.pool = pool;
    }

    public void setCount(int count) {
      this.count = count;
      synchronized (this) {
        notify();
      }
    }

    @Override
    public void run() {
      synchronized (this) {
        try {
          while(true) {
            // 작업하라는 알림이 올 때 까지 기다린다.
            wait();

            // 알림이 오면 작업을 실행한다.
            for(int i = count; i > 0; i--) {
              System.out.printf("[%s] %d\n", getName(), i);
              Thread.sleep(2000);
            }

            // 작업이 끝났으면 스레드풀로 돌아간다.
            pool.add(this);
          }
        } catch(Exception e) {

        }
      }
    }
  }
  // MyThreadPool과 MyThread 상호간의 참조를 피하기 위해
  // 인터페이스를 준비한다.
  interface ThreadPool {
    Thread get();

    void add(Thread obj);
  }

  static class MyThreadPool implements ThreadPool {
    ArrayList<MyThread> list = new ArrayList<>();

    public MyThreadPool() {

      // 사용할 스레드 객체를 미리 생성한다.
      // - 나중에 MyThread가 Pool로 다시 리턴될 수 있도록
      // 스레드 객체를 생성할 때 Pool의 주소를 알려준다.
      MyThread t1 = new MyThread("1번 스레드=>", this);
      MyThread t2 = new MyThread("2번 스레드***>", this);
      MyThread t3 = new MyThread("3번 스레드-->", this);

      // 생성된 스레드를 컬렉션에 보관한다.
      list.add(t1);
      list.add(t2);
      list.add(t3);

      // 일단 무조건 스레드를 미리 실행한다.
      t1.start();
      t2.start();
      t3.start();
    }

    @Override
    public MyThread get() {
      if(list.size() > 0) { // 컬렉션에 남아 있는 스레드가 있다면,
        return list.remove(0);
      }
      return null; // 없으면 null을 리턴한다.
      // 현재 이 예제에서는 오직 3개의 스레드만 쓰도록 했다.
    }

    // 스레드를 다 쓴 후에는 다시 스레드 풀에 돌려준다.
    @Override
    public void add(Thread t) {
      list.add((MyThread) t);
    }
  }

  public static void main(String[] args) {
    MyThreadPool threadPool = new MyThreadPool();

    Scanner keyScan = new Scanner(System.in);

    while(true) {
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if(str.equals("quit")) {
        break;
      }
      int count = Integer.parseInt(str);

      // 스레드풀에서 스레드를 하나 꺼낸다.
      MyThread t = threadPool.get();
      if(t == null) {
        System.out.println("남는 스레드가 없습니다.");
        continue;
      }

      // 스레드의 카운트를 설정한다. 그러면 카운트를 시작한다.
      t.setCount(count);
    }
    System.out.println("main 스레드 종료");
    keyScan.close();
  }
}
