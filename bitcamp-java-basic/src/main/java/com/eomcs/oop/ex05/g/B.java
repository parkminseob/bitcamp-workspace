package com.eomcs.oop.ex05.g;

public class B extends A{
  int v2;
  //수퍼클래스에 기본 생성자가 없다면
  //개발자가 직접 수퍼클래스에 있는 생성자를 호출해줘야 한다.
  //호출하지 않으면 컴파일 에러.

  B() {
    super(100);
    System.out.println("B() 생성자");
  }

  B(int value){
    super();
    this.v2 = value;
  }

}
