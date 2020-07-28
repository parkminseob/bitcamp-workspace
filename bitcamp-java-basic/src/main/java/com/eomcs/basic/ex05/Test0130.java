package com.eomcs.basic.ex05;

public class Test0130 {
  public static void main(String[] args) {
    
    byte b;
    b = 5;
    b = 6;
    
    b = 5 + 6;
    
    System.out.println(b);
    
    
    byte x = 5, y = 6, z;
    z = x;
    z = y;
    
    //z = x + y; 
    //자바의 정수연산 최소단위는 4바이트(int)
    
    short s1 = 5;
    short s2 = 6;
    short s3;
    
    s3 = s1;
    s3 = s2;
    //s3 = s1 + s2;
    
    int s4 = s1 + s2;
    System.out.println(s4);
  }

}
