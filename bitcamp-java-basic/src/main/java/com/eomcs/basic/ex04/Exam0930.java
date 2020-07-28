package com.eomcs.basic.ex04;

public class Exam0930 {
  public static void main (String[] args) {
    
    //명시적 형변환
    
    float f = 3.14f;
    int i = (int)f; //소수점 이하 제거됨
    System.out.println(i);
    
    
    double d = 9876.56789;
    long l = (long)d;
    System.out.println(l);
    
  }
}
