package com.eomcs.oop.ex07.a;
// 캡슐화 문법 사용 후
public class Exam0211 {
  public static void main(String[] args) {
    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    // sum과 aver의 값을 임의적으로 조작하는 건 막았는ㄷ
    // 개발자가 국영수 점수를 변경 한 후
    // compute()를 호출하지 않는다면?

    s1.eng = 100;
    s1.math = 100;

    // 문제가 생긴다.

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng,
        s1.math, s1.getSum(), s1.getAver());
  }
}
