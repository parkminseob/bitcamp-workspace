package com.eomcs.basic.ex05;

public class Test0221 {
  public static void main(String[] args) {
    
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f); //false
    
    System.out.println(f1 * f2); //쓰레기값붙음
    
    // 오차 제거 후 비교
    // 단 절대값으로 만든 후 오차 이하값인지 비교하기
    
    float r = f1 * f2 - 0.01f; //0이여야 하죠?
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY); //true!
  }
}
