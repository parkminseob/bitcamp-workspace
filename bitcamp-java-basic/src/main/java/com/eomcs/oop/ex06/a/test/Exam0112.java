package com.eomcs.oop.ex06.a.test;
// 다형적 변수 
public class Exam0112 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();
    
    Bike b2 = null;
    
    // 하위클래스 레퍼런스로 상위클래스 인스턴스를 가리킬 수 없다.
    // 상위 클래스 인스턴스에는 하위 클래스의 인스턴스 변수가 없을 수 있기 때문이다.
    b2 = v; // (Child child = new parent(); 같은 예시)
    b2.engine = true;
    // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    // Type mismatch: cannot convert from Vehicle to Bike
    
    System.out.println(b2.engine);
    
    // 개발자가 레퍼런스를 통해 존재하지 않는 인스턴스 멤버를 사용할까봐
    // 이걸 미리 방지하려고 컴파일 단계에서 막는 것.
  }
}
