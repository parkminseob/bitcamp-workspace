package com.eomcs.basic.ex07;

public class Exam0240 {
  // 예4) 메서드 : 리턴값o, 파라미터o
  // 돈갖고 과자사오렴~
  static String hello(String name, int age) {
    String str = String.format("%d살 %s님을 환영합니다!", age, name);

    return str;
  }
  public static void main (String[] args) {
    String r = hello("홍길동", 40);
    System.out.println(r);


    hello("임차", 30);
  }
}
