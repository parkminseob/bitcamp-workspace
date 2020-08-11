package com.eomcs.oop.ex06.a;

public class Exam0113 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    // 설사 같은 부모의 자식 클래스라도 다른 클래스의 인스턴스는 가리킬 수 없음
    // Bike 클래스의 인스턴스변수를 갖고 있지 않기 때문이다.

    b2 = c; //안돼!
    b2 = s;
    b2 = t;

  }
}
