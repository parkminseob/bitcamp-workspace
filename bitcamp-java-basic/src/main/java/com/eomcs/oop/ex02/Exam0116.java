package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {


  public static void main(String[] args) {

    Score s1 = new Score();
    s1.name = "홍길동";
    //s1객체의 name에다가 홍길동을 집어넣어라!
    s1.kor = 77;
    s1.eng = 90;
    s1.math = 86;
    s1.compute();

    Score s2 = new Score();
    s2.name = "임자식";
    s2.eng = 100;
    s2.kor = 77;
    s2.math = 65;
    s2.compute();


    printScore(s1);

    System.out.println("------------");
    printScore(s2);
  }


  static void printScore(Score s) { //상황에 따라 출력할 수 있는 방향이 다양해서 Score클래스에 넣지 않는다.
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
