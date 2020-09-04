package com.eomcs.oop.ex08.c.test;

public class Sedan extends Car{

  @Override
  public void run() {
    System.out.println("생생돈까스");
  }

  public void doSunroof(boolean open) {
    if(open) {
      System.out.println("썬루프를 열다.");
    } else {
      System.out.println("썬루프를 닫다.");
    }
  }
}
