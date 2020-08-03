package com.eomcs.basic.ex07;
// 메서드 : 가변 파라미터
public class Exam0250_a {

  // 가변 파라미터
  // [리턴타입] 메서드명 (타입... 변수) {....}
  // 0개 이상의 값을 받을 때 선언하는 방식
  // 매서드 내부에서는 배열처럼 사용.

  // 다음예제는 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
  static void hello(boolean... b) {
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
  public static void main(String[] args) {

    int i = 100;

    hello(i < 90);
    System.out.println("------------");

    hello(i == 2*3);
    System.out.println("--------------");

    hello(i != 100);
    System.out.println("-----------------");

    boolean[] arr = {i > 10, 7 >=9, 30 < 20, false };
    hello(arr);
    System.out.println("--------------------");

  }
}
