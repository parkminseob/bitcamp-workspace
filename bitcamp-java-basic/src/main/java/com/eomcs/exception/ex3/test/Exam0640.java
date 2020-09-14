package com.eomcs.exception.ex3.test;

public class Exam0640 {
  static class A{

  }

  static class B implements AutoCloseable {
    @Override
    public void close() throws Exception {
      System.out.println("B 클래스의 자원을 해제하였습니다.");
    }
  }
  public static void main(String[] args) throws Exception {
    try(
        //A obj = new A();
        B obj2 = new B();
        ){
      System.out.println("try 블록 실행");
    }
    // finally 블록에서 B의 close()를 호출하지 않아도,
    // 자동으로 호출될 것이다. 실행하여 확인하라!
  }
}
