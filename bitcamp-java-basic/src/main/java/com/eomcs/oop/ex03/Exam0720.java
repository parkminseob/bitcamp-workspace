package com.eomcs.oop.ex03;
// 인스턴스 초기화 블록 초기화와 생성자
public class Exam0720 {

  static class A {
    int a;
    int b;
    int c;
    // 인스턴스 초기화 블록 사용 후
    // 여러 생성자에 공통으로 존재하는 코드가 있다면
    // 별도의 블록으로 뽑아내는게 코드 관리에 좋음.
    // 이럴때 쓰는게 인스턴스 블록.
    // 다음과 같이 생성자에 공통으로 들어갈 코드 작성해보기.
    // 무조건 인스턴스 초기화 블록이 먼저 실행됨!!!(바이트코드 확인)


  public A() {
    a = 200;
    System.out.println("A() 생성자 호출");
  }

  {
    a = 100;
    System.out.println("인스턴스 초기화 블록 실행할거임");
  }
  // 생성자가 없으면 컴파일러가 자동 생성함. (바이트코드 확인)
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
  }
}
