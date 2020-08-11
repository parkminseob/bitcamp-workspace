package com.eomcs.oop.ex05.c;
// 상속 - 사용 전
// 기존 코드를 복사하여 새 클래스를 만든 후에 코드를 추가했다.
public class Car2 {
  String model;
  String maker;
  int capacity;
  boolean sunroof;
  boolean auto;

  public Car2() {}

  public Car2(String model, String maker, int capacity) {
    this.model = model;
    this.maker= maker;
    this.capacity = capacity;
  }

  public Car2(String model, String maker,
      int capacity, boolean sunroof, boolean auto) {
    this(model, maker, capacity);

    this.sunroof = sunroof;
    this.auto = auto;
  }
}
