package com.eomcs.corelib.ex02.test;
// String 값 비교 - equals()
public class Exam0121 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);

    System.out.println(s1.equals(s2));
  }
}
