package com.eomcs.oop.ex06.a.test;
// 다형적 변수 
public class Exam0113 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();
    
    Bike b2 = null;
    
    // 같은 조상의 자식 클래스라도
    // 다른 클래스의 인스턴스는 가리킬 수 없음
    
    //안됌!!!!!
    b2 = c;
    b2 = s;
    b2 = t;
  }
}
