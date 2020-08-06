package com.eomcs.oop.ex03;

public class Exam0210 {

  static class A {
    static int v1; // 스태틱 변수 = static field = class field
    int v2; // 인스턴스 변수 = instance field = non-static field

    // static method = class method
    static void m1() {
      System.out.println("m1()");
      A.v1 = 100;
      v1 = 200; // 같은 static 멤버이기 때문에 클래스명 생략 가능

      //this.v2 = 200;
      //v2 = 200;
      //this.m2();
      //스태틱 메서드는 this라는 내장 변수가 없기 때문에
      //this를 사용하여 접근하는 인스턴스멤버(필드,메서드)를 사용할수없다!

    }
    // non-static method = instance method
    void m2() {
      System.out.println("m2()");

      //인스턴스 필드에 접근하려면
      // 메서드 내장 변수인 this를 사용하라.
      //this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 가지고있음.
      this.v2 = 100;
      v2 = 300;

      // 스태틱 필드는 인스턴스 레퍼런스를 통해 접근할 수 있다.
      // 그러나 비권장!
      this.v1 = 100; // A.v1 = 100;

      //물론 다음과 같이 클래스이름을 생략할 수 있음.
      v1 = 200; // A.v1 = 200;
      A.v1 = 200;
      m1();
      A.m1();
      //인스턴스 메서드는 인스턴스 멤버(필드나 메서드) 뿐 아니라
      //클래스 멤버(필드, 메서드)도 사용할 수 있다.


    }

    static int abs(int value) {
      if(value < 0) {
        return value * -1;
      } else {
        return value;
      }
    }
  }
  public static void main(String[] args) {
    A.m1();
    //A.m2();

    // non-static method는 인스턴스가 있어야만 호출 가능
    // => 인스턴스 메소드
    A obj1 = new A();
    obj1.m2();

    obj1.m1(); // => A.m1();

    System.out.println(A.abs(100));
    System.out.println(A.abs(-100));
    System.out.println(Math.abs(-100));
  }
}
