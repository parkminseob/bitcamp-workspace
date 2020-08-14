package com.eomcs.corelib.ex02.test;
// String 문자열 객체 만들기
public class Exam0110 {
  public static void main(String[] args) {

    String s1;

    s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2); //f
  }

}
