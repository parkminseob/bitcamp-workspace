package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score4;

public class Exam0119 {


  public static void main(String[] args) {

    Score4 s1 = new Score4("홍길동", 100, 90, 88);

    Score4 s2 = new Score4("허난설헌", 44, 67, 90);

    printScore(s1);

    System.out.println("------------");
    printScore(s2);
  }


  static void printScore(Score4 s) { //상황에 따라 출력할 수 있는 방향이 다양해서 Score클래스에 넣지 않는다.
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
