package com.eomcs.corelib.ex02.test;
// mutable vs immutable
public class Exam0161 {
  public static void main(String[] args) {
    // StringBuffer객체는 mutable 객체이다.
    // 인스턴스 데이터 변경이 가능하다.
    // 원래의 문자열을 변경하고 싶을 때 사용하는 클래스

    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf);

    buf.replace(2, 4, "xxxx"); //원본을 바꾼다.
    // 2 이상 4 미만의 문자를 "xxxx"로 대체하기
    System.out.println(buf);
  }
}
