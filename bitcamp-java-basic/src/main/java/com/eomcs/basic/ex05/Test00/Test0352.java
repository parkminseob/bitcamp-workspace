package com.eomcs.basic.ex05.Test00;

public class Test0352 {
  public static void main (String[] args) {
    
    // % 연산자를 이용하여 짝/홀 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    
    System.out.println((57 & 0x1) == 0? "짝" : "홀");
  }
}
