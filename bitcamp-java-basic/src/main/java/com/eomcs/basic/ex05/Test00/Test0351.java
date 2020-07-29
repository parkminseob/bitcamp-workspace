package com.eomcs.basic.ex05.Test00;

public class Test0351 {
  public static void main (String[] args) {
    
    System.out.println(57 % 2);
    System.out.println(57 & 0b0000_0001);
    
    // % 연산은 나누기 연산을 수행해야 한다.
    // 그에 비해 & 비트 연산은 한번만 하면 된다.
    
    // 홀/짝인지 알아내거나
    // 2의 나머지를 구하고 싶으면 & 비트 연산을 수행하는게 더 빠름.
    
    System.out.println(57 % 4);
    System.out.println(57 & 0b11);
    
    System.out.println(57 % 8);
    System.out.println(57 & 0b111);
    
    System.out.println(57 % 16);
    System.out.println(57 & 0b111);
    
  }
}
