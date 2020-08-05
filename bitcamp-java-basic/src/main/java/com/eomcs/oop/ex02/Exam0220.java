package com.eomcs.oop.ex02;

public class Exam0220 {
  static class Calculator {
    static int plus(int a, int b) {
      return a + b;
    }
    static int minus(int a, int b) {
      return a - b;
    }
    static int multiple(int a, int b) {
      return a * b;
    }
    static int divide(int a, int b) {
      return a / b;
    }
  }

  public static void main(String[] args) {

    int result = 0;

    result = Calculator.plus(2, 3);
    result = Calculator.minus(result, 1);
    result = Calculator.multiple(result, 7);
    result = Calculator.divide(result, 3);

    System.out.printf("result = %d\n", result);

  }
}
