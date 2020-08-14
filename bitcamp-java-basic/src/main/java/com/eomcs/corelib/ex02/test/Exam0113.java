package com.eomcs.corelib.ex02.test;
// String  인스턴스를 상수풀에 생성하기 : intern()
public class Exam0113 {
  public static void main(String[] args) {

    String s1 = new String("Hello");

    // intern()
    // 지정된 String객체를 상수풀에서 찾는다.
    // 있으면 String 객체의 주소 리턴
    // 없으면 String객체를 상수풀에 생성한 후 주소 리턴.

    String s2 = s1.intern();
    String s3 = "Hello";

    System.out.println(s1 == s2); //f
    System.out.println(s2 == s3); //t
  }
}
