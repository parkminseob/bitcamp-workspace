package com.eomcs.oop.ex02;

public class Exam0113 {

  static class Score{

    String name = "홍길동";
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {

    Score s1 ;
    //
    s1 = new Score();

    s1.name = "홍길동";
    //s1객체의 name에다가 홍길동을 집어넣어라!
    s1.kor = 77;
    s1.eng = 90;
    s1.math = 86;
    computeScore(s1);

    Score s2 = new Score();
    s2.name = "임자식";
    s2.eng = 100;
    s2.kor = 77;
    s2.math = 65;
    computeScore(s2);


    printScore(s1);

    System.out.println("------------");
    printScore(s2);
  }

  static void computeScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }

  static void printScore(Score s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
