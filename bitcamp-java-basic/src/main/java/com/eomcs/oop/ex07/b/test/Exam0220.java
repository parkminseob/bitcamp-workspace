package com.eomcs.oop.ex07.b.test;

public class Exam0220 {
  public static void main(String[] args) {
    //Car c1 = new Car();
    //생성자를 private로 막아서 호출 불가능

    //개발자가 직접 인스턴스를 생성하면 너무 복잡하니
    //다른 메서드를 통해 인스턴스를 생성하란 뜻.

    Car c2 = Car.create("티코");
    System.out.printf("%s,%s,%d,%d\n",
        c2.maker,c2.model, c2.cc, c2.valve);
  }
}
