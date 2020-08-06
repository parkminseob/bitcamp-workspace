package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score_a;

public class Exam0110_a {
  public static void main(String[] args) {

    Score_a s1 = new Score_a("허난설헌", 100, 80, 77);

    Score_a s2 = new Score_a("유관순", 89, 97, 50);

    printScore(s1);
    System.out.println("-------------");
    printScore(s2);
  }

  static void printScore(Score_a s) {
   System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
       s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
