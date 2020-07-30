package com.eomcs.basic.ex06;
// 중첩 반복문 탈출
public class Exam0330 {
 public static void main(String[] args) {
  int x = 2, y = 1;

  //구구단 만들기!
  while (x <= 9) {
    while (y <= 9) {
      System.out.printf("%d x %d = %d\n", x, y, x * y);
      y++;
    }
    x++;
    y = 1;
  }

  System.out.println("-----------------------------------");

   int a = 2;
   int b = 1;

    while (a <= 9) {
      while (b <= 9) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
          if (a == 5 && b == 5)
            break;
            b++;
    }
      System.out.println();
     a++;
     b = 1;
  }
    System.out.println("종료?");


}
}
