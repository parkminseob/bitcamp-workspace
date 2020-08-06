package com.eomcs.oop.ex03;

public class Exam0420 {
  static class SmartPhone{

    int volume;
    int bright;
    int contrast;

    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨~");
    }
  }

  public static void main(String[] args) {
    SmartPhone obj1 = new SmartPhone();

  }
}
