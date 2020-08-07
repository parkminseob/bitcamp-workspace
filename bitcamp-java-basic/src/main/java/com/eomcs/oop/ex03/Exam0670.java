package com.eomcs.oop.ex03;

public class Exam0670 {
  public static class A{
    static int a = 100;
    // 변수초기화문장이 있으면
    // 스태틱 초기화 블록이 없어도 컴파일러가 자동생성 후 삽입한다.
    // 위 문장은 다음과 같이 바뀜.

    // static int a;
    // static {
    //  a = 100;
    //  }

  }
  public static void main(String[] args) {
    System.out.println(A.a);
  }
}
