package com.eomcs.basic.ex07;

public class Exam0230 {

  // 예3) 메서드 : 리턴값(o), 파라미터(x)
  // 메서드 블록을 실행한 후 값을 리턴하는 메서드
  // 메서드를 정의할 때 어떤 값을 리턴하는지 타입을 적어야함!!
  // 메서드에서도 종료하기 전 반드시 그 타입의 값을 리턴해야함.
  // 리턴 타입은 반드시 하나만 가능!!
  // 만약 여러개 값을 리턴하고싶다면 배열에 담거나 객체에 담기.
  // 동생 물떠와! or 손들어 돈내놔!

  static String hello() {
    return "안녕하세요~~~~~";
  }
  public static void main(String[] args) {

    String r = hello();
    System.out.println(r);
  }
}
