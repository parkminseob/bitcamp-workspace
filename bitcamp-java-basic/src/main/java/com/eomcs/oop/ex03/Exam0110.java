package com.eomcs.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    // 인스턴스 변수(instance field) = non-static variable
    class A { //설계도에서 static이 붙지 않은 변수를 인스턴스 변수라고 한다.
      int v1;
      boolean v2;
    }
    //Heap에 변수생성됨
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
  }
}
