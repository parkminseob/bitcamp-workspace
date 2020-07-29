package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0420 {
  public static void main (String[] args) {
    
    // >> 비트 이동 연산자 사용법
    // 왼쪽 빈자리를 같은 부호값으로 채운다. (양수0, 음수1)
    
    int i = 105;
    
    System.out.println(i);
    
    System.out.println(i >> 1); // 52
    System.out.println(i >> 2); // 26
    System.out.println(i >> 3); // 13
    System.out.println(i >> 4); // 6
    
    // 오른쪽 1비트 이동은 나누기 2 제곱수 한 것과 같은 효과.
  }
}
