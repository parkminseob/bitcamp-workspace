package com.eomcs.oop.ex04;

public class Exam0230 {
  public static void main(String[] args) throws Exception{
    //Math클래스
    //전체 메서드가 스태틱메서드이다.

    //절대값
    System.out.println(Math.abs(-200));

    // ceil : 부동소수점이 바로 위 큰 정수값 리턴
    // floor : 부동소수점이 바로 아래 작은 정수값 리턴
    System.out.println(Math.ceil(3.28));
    System.out.println(Math.floor(3.28));

    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));

    // 2의 7승 값이 알고싶을때
    System.out.println(Math.pow(2, 7));

    // 반올림하여 정수 값 리턴
    System.out.println(Math.round(3.14));
    System.out.println(Math.round(3.54));
  }
}
