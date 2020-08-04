package com.eomcs.basic.ex07;
// 메서드 스택메모리 응용
public class Exam0440 {

  static int m1(int value) {
    int r1 = m2(value);
    int r2 = m3(value);
    return r1 + r2; //310
  }
  static int m2(int value) {
    return value + 100; //105
  }
  static int m3(int value) {
    return value + 200; //205
  }

  public static void main(String[] args) {
    int r = m1(5);
    System.out.println(r);
  }
}
