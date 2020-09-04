package com.eomcs.oop.ex09.e.test.project4;

import com.eomcs.oop.ex09.e.test.Computer;

public class NewComputer2 implements Computer {
  @Override
  public void compute() {
    System.out.println("새컴퓨터..");
  }

  public void touch() {
    System.out.println("이젠 터치까지? 대박이네..");
  }
}
