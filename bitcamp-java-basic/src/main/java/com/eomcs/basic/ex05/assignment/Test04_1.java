package com.eomcs.basic.ex05.assignment;


//# 과제 : 
//          다음 int 변수에 들어있는 값을 
//          각 자릿수의 10진수 값을 역순으로 출력하라. 
//실행 예)
//값 :23459876
//6
//7
//8
//9
//5
//4
//3
//2

public class Test04_1 {

  public static void main(String[] args) {
    
   int value = 23459876;
   // 코드를 완성하시오
   // 0001 0110 0101 1111 1000 0010 0100 = 23459876 = 165f824
   
   
   int a, b, c, d, e, f, g, h;
   
   a = value & 0xff;
   // 0000 0001 0110 0101 1111 1000 0010 0100
   // 0000 0000 0000 0000 0000 0000 0000 1111
   
   
   System.out.println(a);
   
   
   
   System.out.println("정답-------------------");
   while (value > 0) {
     System.out.println(value % 10);
     value = value /10;
   }

  }

}








