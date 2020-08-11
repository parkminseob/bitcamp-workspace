package com.eomcs.oop.ex06.a;

public class Exam0210 {
  public static void main(String[] args) {
    Vehicle v1 = new Sedan();

    v1.model = "티코";
    v1.capacity = 5;

//    v1.cc = 1980;
//    v1.valve = 16;
//    v1.sunroof = true;
//    v1.auto = true;


    ((Sedan)v1).cc = 1980;
    ((Sedan)v1).valve = 16;
    ((Sedan)v1).sunroof = true;
    ((Sedan)v1).auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        v1.model, v1.capacity,
        ((Sedan)v1).cc, ((Sedan)v1).valve,
        ((Sedan)v1).sunroof, ((Sedan)v1).auto);

    // 각각의 변수를 일일이 형변환 하기 불편하니
    // 그냥 레퍼런스를 형변환해서 쓰기
    Sedan s = (Sedan)v1;
    s.cc = 1980;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        s.model, s.capacity,
        s.cc, s.valve, s.sunroof, s.auto);
  }
}
