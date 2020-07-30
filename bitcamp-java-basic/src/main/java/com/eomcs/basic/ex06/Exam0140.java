package com.eomcs.basic.ex06;

public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    if (age < 19)
      System.out.println("미성년입니다.");

    if (age >= 19)
      System.out.println("성년입니다.");
    else
      System.out.println("미성년입니다.");

    if (age >= 20) {
      System.out.println("--------------");
      System.out.println("성년입니다.");
    }
    else {
      System.out.println("--------------");
      System.out.println("미성년입니다.");
    }

    if (age >= 19) {
      System.out.println("성년입니다.");
      System.out.println("----------------");
    }
    else
      System.out.println("미성년 입니다.");


     if (age >= 19)
       System.out.println("성년입니다.");
     else {
       System.out.println("미성년입니다.");
       System.out.println("--------------------");
     }








  }

}
