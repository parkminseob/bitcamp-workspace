package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0410 {
  public static void main (String[] args) {
    
    //<< 비트이동연산자
    //
    int i = 1;
    
    System.out.println(i << 1);
    System.out.println(i << 2);
    System.out.println(i << 3);
    System.out.println(i << 4);
    
    
    i = 11;
    System.out.println(i << 1);
    System.out.println(i << 2);
    System.out.println(i << 3);
    
    String s1 = "abc";
    String s2 = "가나다";
    String s3 = "a가b";
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s3.length());
  }
}
