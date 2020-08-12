package com.eomcs.oop.ex07.a;
// 캡슐화 문법 사용 - 개발자가 특정 필드에 접근하는 것 막기
class Score2{
  String name;
  int kor;
  int eng;
  int math;

  // sum이나 aver은 연산 결과를 보관하기 때문에 직접 접근을 허용하면 안됌.
  private int sum;
  private float aver;

  // sum과 aver의 값을 직접 변경하진 못하지만
  // 외부에서 이 값을 조회할 수 있는 방법/수단(method)는 제공해야한다.
  // 이 때 조회하는 용도의 메소드를 getXXX() 로 짓는다. (게터)
  // 게터는 공개로 설정한다.

  public int getSum() {
    return this.sum;
  }
  public float getAver() {
    return this.aver;
  }
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam0210 {
  public static void main(String[] args) {

    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng
        , s1.math, s1.getSum(), s1.getAver());
  }
}
