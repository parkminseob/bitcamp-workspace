package com.eomcs.oop.ex03;

public class Exam0450 {

  class X {
    // 생성자의 접근범위를 private로 설정하면 외부에서 접근할 수 없기 때문에
    // 생성자를 호출할 수 없다.
    // 결국 인스턴스를 생성하지 못하게 만든다.

    private X() {
      System.out.println("x()");
    }
  }
  public static void main(String[] args) {
    X obj1;
   // obj1 = new X();
    // 생성자의 접근이 막혀있기 때문에 생성자를 호출할 수 없음.
    // new 명령으로도 객체 생성이 불가능!
  }
}
