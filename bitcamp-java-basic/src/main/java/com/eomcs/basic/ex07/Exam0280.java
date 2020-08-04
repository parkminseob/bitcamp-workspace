package com.eomcs.basic.ex07;
//메서드 중첩 호출
public class Exam0280 {
  public static void main(String[] args) {
    // 2 + 3 + 4 + 5 = ?

    // 1) 매서드 리턴 값을 변수로 받을 때
    int result = plus(2 , 3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);

    result = plus(plus(plus(2, 3), 4), 5);
    System.out.println(result);

    System.out.printf("100 + 200 = %d\n", plus(100, 300));

  }

  static int plus(int a, int b) {

    return a + b;
  }
}
