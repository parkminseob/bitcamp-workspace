package com.eomcs.basic.ex07;
// 메소드를 이용해 로컬에서 연산하는 것 보다
// factorial수학 공식을 가독성 있게 만들기.
// 재귀메서드 사용법!!
public class Exam0415 {

  public static void main(String[] args) {

    int result = 1;
    int n = 5;

    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);

    System.out.println("------------------------");

    result = factorial(5);
    // result = 5 * factorial(4)
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2)
    // result = 5 * 4 * 3 * 2 * factorial(1)
    // result = 5 * 4 * 3 * 2 * 1


    System.out.println(result);

  }
  static int factorial(int n) {
    return n * factorial(n - 1);

  }
}
