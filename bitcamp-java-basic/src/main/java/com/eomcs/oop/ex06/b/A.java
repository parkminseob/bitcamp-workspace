package com.eomcs.oop.ex06.b;

public class A {
  static public void m() {
    System.out.println("m()");
  }
  static public void m(int a) {
    System.out.println("m(int)");
  }
  static public void m(String m) {
    System.out.println("m(String)");
  }
  static public void m(String a, int b) {
    System.out.println("m(String,int)");
  }
  static public void m(int a, String b) {
    System.out.println("m(int,String)");
  }
  // 변수이름만 다른 메서드를 중복해서 만들 순 없다.
  // 메서드를 파라미터 값의 타입으로 찾기 때문이다.
  // 같은 이유로 리턴 타입만 다른 메서드를 중복해서 만들 수 없다.
}
