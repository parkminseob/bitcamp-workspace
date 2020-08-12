package com.eomcs.oop.ex07.a;
// 캡슐화 사용 전
public class Exam0111 {
  public static void main(String[] args) {

    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 70;
    s1.compute();

    // 계산 후에 임의로 합계나 평균을 변경한다면?
    s1.sum = 300;
    s1.aver = 100f;

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
    // 결과값이 이상하다..
    // sum이나 aver필드를 오직 메서드를 통해서만 변경하도록
    // 캡슐화 시킨다.
  }
}
