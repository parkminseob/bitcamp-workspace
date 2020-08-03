package com.eomcs.basic.ex07;
// 메서드 : 가변 파라미터
public class Exam0250 {

  // 가변 파라미터
  // [리턴타입] 메서드명 (타입... 변수) {....}
  // 0개 이상의 값을 받을 때 선언하는 방식
  // 매서드 내부에서는 배열처럼 사용.

  // 다음예제는 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%d님 반가워용?\n", names[i]);
    }
  }
  public static void main(String[] args) {

    hello(); //names배열 갯수가 0임.
    System.out.println("------------");

    hello("홍길동"); //names배열 갯수가 1개.
    System.out.println("--------------");

    hello("홍길동","임꺽정","유관순"); //names 배열 갯수가 3개.
    System.out.println("-----------------");

    String[] arr = {"당근", "시금치", "토마토", "양상추"};
    hello(arr);
    System.out.println("--------------------");

  }
}
