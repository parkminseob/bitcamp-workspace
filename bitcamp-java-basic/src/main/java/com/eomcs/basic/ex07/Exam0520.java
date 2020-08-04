package com.eomcs.basic.ex07;
//main 메서드 - 프로그램 아규먼트
public class Exam0520 {

  //프로그램 아규먼트
  // jvm을 실행할 때 프로그램에 전달하는 값

  public static void main(String[] args) {
    //프로그램 아규먼트는 스트링 배열에 담겨서 main()을 호출할 때 넘어온다.
    //프로그램 아규먼트는 공백을 기준으로 문자열을 잘라서 배열을 만든다.
    //아규먼트가 없으면 빈 배열이 넘어온다.

    for(String value : args) {
      System.out.printf("[%s]\n", value);
    }
    System.out.println("안녕!");
  }
}
