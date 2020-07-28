package com.eomcs.basic.ex05;

public class Test0120 {
  public static void main(String[] args) {
    
    // 먼저 수행되는 연산
    System.out.println(2 + 3 * 7);
    System.out.println(3 * 7 + 2);
    
    // 같은 우선순위는 앞에서부터 차례대로.
    System.out.println(3 * 8 / 2);
    System.out.println(8 / 2 * 3);
    
    // 실행순서 바꾸기를 원하면 ()쓰기 
    System.out.println((2 + 3) * 7);
    
    
    
  }

}
