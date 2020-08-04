package com.eomcs.basic.ex07;
// 메소드를 이용해 로컬에서 연산하는 것 보다
// factorial수학 공식을 가독성 있게 만들기.
public class Exam0415_a {
  public static void main(String[] args) throws Exception{
    int result = 1;
    int n = 5;

    result = factorial(5);

    System.out.println(result);
  }
  //스택 오버플로 방지를 위해
  // if문을 넣어준다.
    static int factorial(int n) {
      if (n == 1) {
        return 1;
        }
      return n * factorial(n-1);
    }
}
