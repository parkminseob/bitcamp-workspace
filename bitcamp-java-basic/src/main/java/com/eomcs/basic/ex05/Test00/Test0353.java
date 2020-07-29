package com.eomcs.basic.ex05.Test00;

public class Test0353 {
  public static void main (String[] args) {
    
    int data = 0b1111_1001_0111_1111;
    
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
    
  }
}
