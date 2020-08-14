package com.eomcs.corelib.ex02.test;
// String 문자열 리터럴
public class Exam0111 {
public static void main(String[] args) {

  // String constanc pool메모리 영역에 인스턴스를 생성한다.
  String x1 = "Hello";
  String x2 = "Hello";

  System.out.println(x1 == x2); //true
}
}
