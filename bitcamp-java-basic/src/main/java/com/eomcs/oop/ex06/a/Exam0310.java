package com.eomcs.oop.ex06.a;

public class Exam0310 {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();

    v1.model = "티코";
    v1.capacity = 5;

    // 컴파일러를 속이고 컴파일을 시도하면
    // 컴파일러는 눈감아준다. 문제는 실행할때 들통난다!
    Sedan s = (Sedan)v1; // 런타임오류!

    s.cc = 1980;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        s.model, s.capacity,
        s.cc, s.valve, s.sunroof, s.auto);
  }
}
