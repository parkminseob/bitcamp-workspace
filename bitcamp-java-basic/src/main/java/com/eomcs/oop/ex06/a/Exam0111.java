// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam0111 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Vehicle v2 = null;

    v2 = b;
    v2 = c;
    v2 = s;
    v2 = t;

    // v2를 통해 Vehicle의 인스턴스 변수에 접근할 수 있다.
    v2.model = "티코";
    v2.capacity = 5;


  }
}
