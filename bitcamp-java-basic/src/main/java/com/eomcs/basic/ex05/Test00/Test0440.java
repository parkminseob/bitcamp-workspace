package com.eomcs.basic.ex05.Test00;
//비트이동 연산자 
public class Test0440 {
  public static void main (String[] args) {
    
    int i = 0x27a130ff;
    int a, b, c, d;
    
    System.out.println(i);
    System.out.println(Integer.toHexString(i));
    
    a = i >> 24;
    System.out.println(Integer.toHexString(a));
    
    b = ((i >> 16) & 0xff);
    System.out.println(Integer.toHexString(b));
    
    c = (i >> 8) & 0xff;
    System.out.println(Integer.toHexString(c));
    
    d = i & 0xff;
    System.out.println(Integer.toHexString(d));
  }
}
