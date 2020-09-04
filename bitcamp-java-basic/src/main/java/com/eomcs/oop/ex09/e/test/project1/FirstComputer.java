package com.eomcs.oop.ex09.e.test.project1;

import com.eomcs.oop.ex09.e.test.Computer;

public class FirstComputer implements Computer{

  @Override
  public void compute() {
    System.out.println("나는야 단순한 계산기.");    
  }
}
