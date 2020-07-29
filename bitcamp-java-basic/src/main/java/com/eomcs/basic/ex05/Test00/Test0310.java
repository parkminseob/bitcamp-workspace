package com.eomcs.basic.ex05.Test00;

public class Test0310 {
  public static void main(String[] args) {
    
    //And연산 : 두개 모두 true일때 결과도 true
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);
    System.out.println("-------------------");
    
    //or 연산 : 둘 중 하나라도 true면 결과도 true
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
    System.out.println("--------------------");
    
    //not 연산 : true 는 false로, false 는 true로 바꾼다.
    System.out.println(!true);
    System.out.println(!false);
    System.out.println("---------------------");
    
    // exclusive-OR 연산자
    // 배타적 비교 연산자라고 부름. 두개 값이 다를때 true!
    System.out.println(true ^ true);
    System.out.println(false ^ false);
    System.out.println(true ^ false);
    
  }
}
