package com.eomcs.oop.ex03;

public class Exam0110_a {
  public static void main(String[] args) {
    class A{
      // 인스턴스 변수
      // new 명령을 통해 생성됨
      // Heap 영역에 생성됨
      // non-static
      int v1;
      boolean v2;
    }

    //A 클래스에 대해 new 명령을 사용하기 전 까지는 v1, v2는 단지 설계도일 뿐임
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    //인스턴스 객체 생성
    //obj1, obj2, obj3 = 레퍼런스
    //인스턴스 생성될때 만들어지는 v1, v2가 인스턴스 변수

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);
  }
}
