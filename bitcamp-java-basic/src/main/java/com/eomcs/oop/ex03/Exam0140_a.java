package com.eomcs.oop.ex03;
// 클래스 변수와 인스턴스 변수 생성 시점과 메모리 영역
public class Exam0140_a {
  static class A{
    static int v1;
    int v2;
  }
  public static void main(String[] args) {
    // 클래스 변수는 클래스가 로딩되는 순간 바로 사용할 수 있다.
    A.v1 = 100;

    // v2는 인스턴스 변수라 new명령으로 생성해야함.
    A a = new A();
    // 이제 v2변수가 heap에 생성됨.
    // A클래스의 인스턴스를 만들 때
    // static이 안붙은 변수가 그 대상이다.

    //v2인스턴스 변수는 레퍼런스를 통해 사용해야한다.
    a.v2 = 200;

    //인스턴스 변수는 인스턴스를 만들 때 마다 생성됨.
    A a2 = new A();
    a2.v2 = 500;

    System.out.printf("A.v1=%d, a.v2=%d, a2.v2=%d", A.v1, a.v2, a2.v2);
  }
}
