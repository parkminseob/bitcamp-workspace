package com.eomcs.basic.ex05.Test00;

public class Test0640 {
  public static void main(String[] args) {
    
    //후위 증감응용2
    
    int i = 2;
    
    int result = i++ + i++ * i++;
    
    //순서대로 i값에 2, 3, 4가 들어간다.
    // 2 + 3 * 4
    // 2 + 12
    // 14
    //i = 5
    
    
    System.out.printf("%d, %d\n", i, result); //14
   
  }
}
