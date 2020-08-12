package com.eomcs.oop.ex07.b.test;
//캡슐화(encapsulation) - 필요한 이유
public class Exam0120 {

  public static void main(String[] args) {
    Customer2 c1 = new Customer2();
    c1.name = "홍길동";
    c1.age = 300;
    c1.weight = 100;
    c1.height = -50;

    // private으로 접근을 제한했기 때문에
    // 인스턴스 변수에 값을 넣을 수 없다.
    // 메서드를 새로 만들어 해결하자!

  }
}
