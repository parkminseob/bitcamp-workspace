package com.eomcs.oop.ex06.b;
// 오버로딩
public class B extends A{

  // 조상클래스에 m()이라는 메서드가 여러개 있어도
  // 서브클래스에 파라미터 형식이 다른 메서드를 추가하면
  // 이것도 오버로딩이다.
  static void m (int a, int b, int c) {
    System.out.println("m(int,int,int)");
  }
}
