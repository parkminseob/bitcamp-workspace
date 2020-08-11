package com.eomcs.oop.ex05.e;
//상속 - 클래스 로딩과 인스턴스 과정
public class Exam01 {
  public static void main(String[] args) {
    // B클래스 설계도에 따라 Heap에 변수를 준비한다.
    // B는 A를 상속받았기 때문에 A클래스 인스턴스 변수도 Heap에 함께 생성된다.

    B obj = new B();
    obj.v2 = 200;
    obj.v1 = 100;
    System.out.printf("v2=%d, v1=%d\n", obj.v2, obj.v1);

    B obj2 = new B();
    obj2.v2 = 2000;
    obj2.v1 = 1000;
    System.out.printf("v2=%d, v1=%d\n", obj2.v2, obj2.v1);
    
    
  }
}
