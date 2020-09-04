package com.eomcs.oop.ex09.b.test;

public interface A {

  // 인터페이스에 정의하는 메서드는 호출 규칙이다.
  // 규칙은 공개되어야 한다.
  // 그래서 인터페이스에 선언되는 모든 메서드는 public 이다.
  public void m1();

  //=> 무조건 public이기 때문에 생략해도 public 이다.
  void m2();

  //=> private, protected, (default)는 없다.
  //private void m3(); // 컴파일 오류!
  //protected void m4(); // 컴파일 오류!
  void m5();
}
