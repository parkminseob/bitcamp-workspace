package com.eomcs.basic.ex06;

public class Exam0320 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    while (count < 100) {
      //count++;
      //sum += count; 아래 문장으로 요약이 가능하다.
      sum += ++count;


    }
    System.out.printf("count = %d, sum = %d\n", count, sum);
  }
}
