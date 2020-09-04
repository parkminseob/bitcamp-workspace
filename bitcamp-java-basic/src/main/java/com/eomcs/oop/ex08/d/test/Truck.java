package com.eomcs.oop.ex08.d.test;

public class Truck extends Car {

  @Override
  public void run() {
    System.out.println("덜덜 달린다"); 
  }

  public void dump() {
    System.out.println("짐을 내린다.");
  }
}
