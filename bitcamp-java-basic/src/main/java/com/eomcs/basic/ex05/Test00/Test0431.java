package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0431 {
  public static void main (String[] args) {
    
    // >>>연산자 사용법
    // 음수 양수 상관없이 0으로 채운다.
    // 거의 쓰이지 않는 예제
    int i = 0b11111111_11111111_11111111_10101001;
    
    System.out.println(i);
    
    System.out.println(i >>> 1);
    
    System.out.println(i >>> 2);
    
    System.out.println(i >>> 3);
    
    System.out.println(i >>> 4);
  }
}
