package com.eomcs.oop.ex09.e.test.project2;

import com.eomcs.oop.ex09.e.test.Computer;

public class SecondComputer implements Computer{
  @Override
  public void compute() {
    System.out.println("이젠 멀티태스킹도 할줄알아!");
  }
}
