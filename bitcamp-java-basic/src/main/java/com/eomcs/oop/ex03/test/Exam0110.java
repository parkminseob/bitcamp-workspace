package com.eomcs.oop.ex03.test;

public class Exam0110 {
  public static void main(String[] args) {
    // 인스턴스 변수
    // new 명령을 통해 실행한다
    // new 명령을 실행하기 전까지는 인스턴스 변수는 존재하지 않는다
    // Heap에 생성된다
    // static이 붙지않는다.
    class A{
      int v1;
      boolean v2;
    }
    
    // A클래스에 대해 new 명령을 사용하기 전에는 v1, v2메모리는 존재하지 않는다.
    // 단지 설계도일 뿐이다.
    A obj1 = new A();
    A obj2 = new A();
    
    // 이렇게 생성된 메모리를 "인스턴스" , "객체"라고 부른다
    // 인스턴스의 주소를 저장하는 obj1, obj2를 레퍼런스라고 부른다
    // 인스턴스가 생성될 때 만들어지는 v1, v2 변수를 인스턴스 변수라고 한다.
    
    // 인스턴스 변수는 레퍼런스를 통해 사용할 수 있다.
    obj1.v1 = 100;
    obj2.v1 = 200;
    
    System.out.println(obj1);
    System.out.println(obj2);
  }
}
