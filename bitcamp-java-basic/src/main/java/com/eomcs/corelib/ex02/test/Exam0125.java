package com.eomcs.corelib.ex02.test;
// StringBuffer
public class Exam0125 {
  public static void main(String[] args) {

    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    // StringBuffer에 들어있는 문자열 비교하기
    // StringBuffer에서 String을 꺼내 비교하라!


    System.out.println(b1.toString().equals(b2.toString())); //t

    // String s1 = b1.toString();
    // String s2 = b2.toString();
    // System.out.println(s1.equals(s2));
  }
}
