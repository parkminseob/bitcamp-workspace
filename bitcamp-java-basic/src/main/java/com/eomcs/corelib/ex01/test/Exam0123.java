package com.eomcs.corelib.ex01.test;
// toString 오버라이딩
public class Exam0123 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }
    //toString의 리턴값을 재정의하는것이 가능하다.
    //인스턴스의 내부값을 빠르게 확인하고 싶을 때 종종 오버라이딩한다.
    @Override
    public String toString() {
      return String.format("%s,%d,%d,%d,%d,%.1f",
          this.name, this.kor, this.eng, this.math, this.sum, this.aver);
    }
  }
  public static void main(String[] args) {
    Score s1 = new Score("홍길동",100,100,100);

    String str = s1.toString();
    System.out.println(str);
    System.out.println(s1);
  }
}
