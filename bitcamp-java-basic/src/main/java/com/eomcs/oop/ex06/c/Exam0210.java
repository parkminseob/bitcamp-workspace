package com.eomcs.oop.ex06.c;

public class Exam0210 {
  public static void main(String[] args) {
    B2 obj = new B2();

    // B2에서 B의 m()메서드를 오버라이딩했다고 착각하고 메서드를 쓸 수 있다.
    // 근데 B2를 가보니 m()의 파라미터가 float이다!
    // 오버라이딩이 아니라 오버로딩을 한것.
    obj.m(100); //B의 m(int)메서드를 호출

    //실수를 막기위해 오버라이딩 여부를 검샇는 특별한 문법을 추가.
  }
}
