package com.eomcs.oop.ex06.a;

public class Exam0115 {
  public static void main(String[] args) {

    Car c = new Sedan();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

    // 레퍼런스가 실제 하위 인스턴스를 가리키고 있다 하더라고
    // 레퍼런스 타입의 범위를 벗어나서 사용할 수 없다.

    c.sunroof = true; //안돼!
    c.auto = true; //안됀다고!

    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;

    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;

  }
}
