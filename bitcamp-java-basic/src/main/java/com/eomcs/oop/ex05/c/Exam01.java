package com.eomcs.oop.ex05.c;
//상속 = 상속하지않고 기능추가II
public class Exam01 {
  public static void main(String[] args) {

    // 복붙의 문제점
    // 원본코드에 버그가 있으면 버그도 복사하게 되버림
    // 디버그를 할대 복사한 모든 소스파일을 수동으로 찾아 고쳐야한다.

    Car2 c = new Car2("비트자동차", "티코", 5 , true, true);
  }
}
