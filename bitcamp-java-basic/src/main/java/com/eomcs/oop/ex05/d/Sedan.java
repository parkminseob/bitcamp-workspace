package com.eomcs.oop.ex05.d;
// 기존의 클래스는 손대지 않고 새 기능만 추가하기
// 상속 문법 사용!

// 재 사용할 기존 클래스를 지정한 뒤
// 새 클래스에 추가할 기능을 덧붙인다.
public class Sedan extends Car {
  boolean sunroof;
  boolean auto;

  public Sedan(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
