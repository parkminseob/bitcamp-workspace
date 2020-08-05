package com.eomcs.util;
  public class Calculator {

    public int result = 0;

    public void plus(int value) {
      this.result += value;
    }
    public void minus(int value) {
      this.result -= value;
    }
    public void multiple(int value) {
      this.result *= value;
    }
    public void divide(int value) {
      this.result /= value;
    }
    public static void resultCalculator(int value) {
      System.out.println("********");
      System.out.printf("결과값? => %d\n", value);
      System.out.println("********");
    }


  }
