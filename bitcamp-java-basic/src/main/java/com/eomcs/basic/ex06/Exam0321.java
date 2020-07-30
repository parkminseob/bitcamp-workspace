package com.eomcs.basic.ex06;
// break와 continue 활용.
public class Exam0321 {
  public static void main(String[] args) {

    int count = 0;
    int sum = 0;


    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count = %d, sum = %d\n", count, sum);

    System.out.println("-------------------");


    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1) // 나머지가 1인 것은 홀수니까 바로 다시 조건검사로 넘어감.
        continue;
      sum += count;
    }
    System.out.printf("count = %d, sum = %d\n", count, sum);
  }
}
