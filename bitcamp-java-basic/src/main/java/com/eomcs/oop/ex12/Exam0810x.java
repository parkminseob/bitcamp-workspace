package com.eomcs.oop.ex12;
//인터페이스 구현체를 만드는 다양한 방법

public class Exam0810x {

  interface Factory {
    Object create();
  }
  static class Car {}

  public static Car createCar() {
    return new Car();
  }

  public static void main(String[] args) {
    // 1) 로컬 클래스로 인터페이스 구현체를 만든다.
    class MyCar implements Factory {
      @Override
      public Object create() {
        // TODO Auto-generated method stub
        return new MyCar();
      }
    }

    // 2) 익명 클래스로 인터페이스를 구현체로 만든다.
    Factory f1 = new Factory() {
      @Override
      public Object create() {
        return new Car();
      }
    };

    // 3) 람다로 인터페이스 구현체를 만든다.
    Factory f2 = () -> new Car();
    Car car = (Car)f2.create();

    // 4) 기존에 존재하는 메서드로 인터페이스 구현체를 만든다.
    Factory f3 = Exam0810x::createCar;


    // 5) 기존 클래스의 생성자로 인터페이스 구현체를 만든다.

  }

}
