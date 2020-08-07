package com.eomcs.oop.ex03;
//초기화 블럭
public class Exam0610 {

  static class A {

    static int x = 100; //변수선언 + 변수 초기화 문장(variable initializer)
    static void m1() {}

    int y = 100; //변수선언 + 변수 초기화 문장(variable initializer)
    //static 초기화 블럭
    static {
      x = 200;
      // 클래스가 로딩되고,
      // 스태틱 필드가 생성된 후
      // 스태틱 블럭을 순서대로 실행한다.

      // 정확한 내용
      // => static 블록이 여러 개일 경우 컴파일 과정에서 한 개의 스태틱 블록으로 합친다.
      System.out.println("static 블록 #1");
    }
    //instance 초기화 블럭
    {
      y = 200;
      // 인스턴스가 생성되고
      // 즉시 인스턴스 블럭이 순서대로 실행된다.
      // 그런 후 생성자가 호출된다.

      // 정확한 내용
      // => 인스턴스 블록은 컴파일 과정에서 모든 생성자의 첫 부분에 삽입된다.
      //
      System.out.println("인스턴스 블록 #1");
    }
    public A() {
      y = 300;
      System.out.println("A() 생성자 호출됨!");

    }
    public A(int value){
      System.out.println("A(int) 생성자 호출됨");
    }

    {
      System.out.println("인스턴스 블록#2");
    }
    static {
      System.out.println("static 블록 #2");
    }
  }

  static class B{
    static int x = 100;

    int y = 1000;//변수선언 + 변수 초기화 문장(variable initializer)
    // 인스턴스 변수 초기화 문장은 생성자의 앞부분에 삽입된다.

    static {
      x = 200;
    }

    public B() {
      y = 3000;
    }

    {
      y = 2000;
    }
  }

  public static void main(String[] args) {
    System.out.println("실행!");
    A obj1; // 레퍼런스를 선언할 때는 클래스가 로딩되지 않는다.


    //A.x = 100; //static 멤버(필드, 메서드)를 사용할 때 로딩된다.
    //A.m1();

    System.out.println("--------------------------");
    obj1 = new A(); // 인스턴스 생성하기 전에 클래스가 로딩되지 않았다면 먼저 로딩한다.
    // 인스턴스 블록이 실행 된 후 생성자가 실행된다.
    // = 인스턴스 블록이 생성자 블록 첫부분에 들어가서 실행된다.
    System.out.println(A.x);
    System.out.println(obj1.y);

    new A(100);
  }
}
