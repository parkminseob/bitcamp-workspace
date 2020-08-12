package com.eomcs.oop.ex07.b.test;

public class Customer4 {
  private String name;
  private int age;
  private int weight;
  private int height;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public int getHeight() {
    return this.height;
  }
  public int getWeight() {
    return this.weight;
  }

  // 실무에서는 세터에 유효값을 검증하는 코드를 넣지 않는다.
  // 따로 인스턴스 변수의 값을 검증하는 메서드를 추가하여 처리한다.
  // 확장성을 고려하기 때문이다.

}
