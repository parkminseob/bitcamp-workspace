package com.eomcs.oop.ex06.b;
// 오버로딩의 응용
public class Exam0310 {
  public static void main(String[] args) {
    // 다양한 파라미터 값을 받는 println
    System.out.println(100);
    System.out.println(true);
    System.out.println("hello");


    Integer obj1 = Integer.valueOf(100);
    Integer obj2 = Integer.valueOf("100");
    Integer obj3 = Integer.valueOf("64", 16);

    System.out.printf("%d, %d, %d\n", obj1, obj2, obj3);
  }
}
