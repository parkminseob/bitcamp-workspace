package com.eomcs.oop.ex07.b.test;
//캡슐화(encapsulation) - 필요한 이유
public class Exam0110 {

  public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.name = "홍길동";
    c1.age = 300;
    c1.weight = 100;
    c1.height = -50;

    // 이 값들은 인스턴스 변수에 들어갈 만한 값이긴 하나
    // 환자라는 데이터로서는 유효하지 않다.
    // 추상화가 무너졌다!
    // 이를 방지하기 위해 캡슐화가 필요하다.

  }
}
