package com.eomcs.oop.ex06.a.test;
// 다형적 변수 
public class Exam0114 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();
    
     Car c2 = null;
     
     // 서브클래스 인스턴스는 가리킬 수 있다
     // 서브클래스 인스턴스에는 무조건! 수퍼클래스의 인스턴스 변수가 있기 때문!
     
     c2 = s;
     c2 = t;
     
     // 그래서 다음과 같이 Sedan 인스턴스가 대입된 c2레퍼런스를 통해 
     // c2로 Car인스턴스 변수를 사용할 수 있다!
     
     c2 = s;
     
     c2.model = "졸려";
     c2.capacity = 90;
     c2.cc = 999;
     c2.valve = 19;
  }
}
