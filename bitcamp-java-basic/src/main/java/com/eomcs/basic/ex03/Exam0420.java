package com.eomcs.basic.ex03;

//# 문자의 리터럴 
//- 작은 따옴표 ''를 사용하여 문자를 표현한다.

public class Exam0420 {
  public static void main(String[] args) {
    System.out.println(0x41);
    System.out.println(65);

    // println()에게 문자 코드임을 알려줘라
    System.out.println((char)0x41);
    System.out.println((char)65);
    System.out.println((char)0xd5d0);
    
    System.out.println((char)'A'); // (char)0x0041
    
    // single quatation 연산자 ''의 역할?
    // => 문자의 코드값을 리턴해주는 일을 한다.
    
    
    
  }
}