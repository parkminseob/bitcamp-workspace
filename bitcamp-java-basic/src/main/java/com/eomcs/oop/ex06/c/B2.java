package com.eomcs.oop.ex06.c;

public class B2 extends B {
  //오버라이딩 문법
  //메서드명, 파라미터형식, 리턴타입이 같아야한다.
  //파라미터 이름은 달라도 상관없음!
  void m (float x) {
  // 오버라이딩 했다고 착각한 문법.
  // 파라미터 형식이 같아야한다!
    System.out.println("B2의 m()");
  }
}
