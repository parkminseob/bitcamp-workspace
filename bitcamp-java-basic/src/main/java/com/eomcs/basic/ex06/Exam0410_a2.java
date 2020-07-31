// 반복문 for
package com.eomcs.basic.ex06;

public class Exam0410_a2 {
  public static void main(String[] args) {
    //for (변수선언 및 초기화; 조건; 증감문) 문장;

    loop:
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
      System.out.printf("%d x %d = %d\n", i, j, i * j);
      if (i == 5 && j == 5) {
        continue loop;
      }
     }
      System.out.println("-------------");
   }
  }
}
