package com.eomcs.concurrent.ex1;
//멀티 스레드 적용 전 - 멀티 태스킹을 적용하기 전

public class Exam0110 {
  public static void main(String[] args) {

    // 일반적으로 코드는 위에서 아래로 순서대로 실행한다.
    // 작업이 완료되기 전 까지는 다음줄로 가지 않는다.
    for(int i = 0; i < 1000; i++) {
      System.out.println("==> " + i);
    }

    for(int i = 0; i < 1000; i++) {
      System.out.println(">>> " + i);
    }
  }
}
