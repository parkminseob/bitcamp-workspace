package com.eomcs.oop.ex04;

public class Exam0230 {
  public static void main(String[] args) throws Exception{
    //Math클래스
    //전체 메서드가 클래스메서드이다.

    //절대값
    System.out.println(Math.abs(-200));

    // ceil : 부동소수점이 바로 위 큰 정수값 리턴
    // floor : 부동소수점이 바로 아래 작은 정수값 리턴
    System.out.println(Math.ceil(3.28));
    System.out.println(Math.floor(3.28));

    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
  }
}
