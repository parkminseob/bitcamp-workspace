package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0430 {
  public static void main (String[] args) {
    
    // >>>연산자 사용법
    // 음수 양수 상관없이 0으로 채운다.
    
    int i = 0b01101001;
    System.out.println(i);
    
    System.out.println(i >>> 1);
    
    System.out.println(i >>> 2);
    
    System.out.println(i >>> 3);
    
    System.out.println(i >>> 4);
  }
}
