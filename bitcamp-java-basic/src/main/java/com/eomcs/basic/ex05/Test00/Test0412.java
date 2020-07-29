package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0412 {
  public static void main (String[] args) {
    
    //<< 비트이동연산자
    //
    System.out.println(3 << 1); // 2**1
    System.out.println(3 << 33); // 2**1
    System.out.println(3 << 68); // 2**4 = 16
    System.out.println(3 << 999); // 2**7 = 128
    
    // 왜 점점 숫자가 증식하고있지?
  }
}
