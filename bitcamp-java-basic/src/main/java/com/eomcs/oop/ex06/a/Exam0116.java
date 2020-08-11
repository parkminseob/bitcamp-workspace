package com.eomcs.oop.ex06.a;

public class Exam0116 {
  public static void main(String[] args) {
    Car c = new Car();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

    // 형변환으로 컴파일러를 속일 순 있지만
    // 런타임 에러 발생하니까 속이지말라!
    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;

  }
}
