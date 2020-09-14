package com.eomcs.exception.ex3.test;

public class Exam0641 {
  static class B implements AutoCloseable {

    public void m(int value) throws Exception{
      if(value < 0) {
        throw new Exception("음수.");
      }
      System.out.println("m()호출");
    }
    @Override
    public void close() throws Exception {
      System.out.println("close()호출 ");
    }
  }
  public static void main(String[] args) throws Exception {
    try(B obj = new B()) {
      System.out.println("try블록 실행");
      obj.m(-100);
      // 예외가 발생하면 try{} 블록을 나가기 전에 close()가 호출된다.

      System.out.println("try블록 종료");
    } catch (Exception e) {
      // close()가 호출된 후 catch 블록이 실행된다.
      System.out.println("예외 발생! " + e.getMessage());
    }
  }
}
