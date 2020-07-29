package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0411 {
  public static void main (String[] args) {
    
    //<< 비트이동연산자
    //
    int a = -0x7f_ff_ff_fa;
    System.out.println(a);
    System.out.println(a << 1);
    System.out.println(a << 2);
    System.out.println(a << 3);
    System.out.println(a << 4);
    
  }
}
