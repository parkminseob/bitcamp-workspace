package com.eomcs.oop.ex09.h.test;

public class Exam0110 {
  public static void main(String[] args) {
    Car c1 = new Tico();

    if(CarCheckInfo.validate(c1)) {
      c1.start();
      c1.run();
      c1.shudown();
    } else {
      System.out.println("자동차 점검하세요! 문제가있거든요!!");
    }
  }
}
