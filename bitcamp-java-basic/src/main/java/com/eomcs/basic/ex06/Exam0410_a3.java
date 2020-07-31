// 반복문 for
package com.eomcs.basic.ex06;

public class Exam0410_a3 {
  public static void main(String[] args) {

    int[] scores = new int[5];
    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    scores[3] = 70;
    scores[4] = 60;

    for (int i = 0; i < scores.length; i++ ) {
      System.out.println(scores[i]);
    }
  }
}
